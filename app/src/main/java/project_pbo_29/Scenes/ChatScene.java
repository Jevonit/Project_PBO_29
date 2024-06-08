package project_pbo_29.Scenes;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import project_pbo_29.Data.QuestionAnswer;
import project_pbo_29.Data.QuestionAndAnswerData;
import project_pbo_29.Utils.ScreenSizeUtils;
import project_pbo_29.Utils.DB_Utils;;

public class ChatScene extends BaseScene {
    public String username;
    private String password;
    private VBox chatArea;
    private VBox inputArea;
    private ScrollPane chatScrollPane;
    private String currentQuestion;
    private boolean tungguRespon = false;
    private Button scrollToBottomButton;

    private Label usernameLabel;
    private Label passwordLabel;

    public ChatScene(Stage stage, String username, String password) {
        super(stage);
        this.username = username;
        this.password = password;
        this.currentQuestion = "root";
    }

    public ChatScene(Stage stage) {
        super(stage);
        this.currentQuestion = "root";
    }

    @Override
    public void showScene() {
        BorderPane SceneChat = new BorderPane();

        // logo, title, settings button, and logout button
        HBox topBar = new HBox();
        topBar.setId("topBar");
        topBar.setPadding(new Insets(10, 20, 10, 20));
        topBar.setAlignment(Pos.CENTER_LEFT);
        topBar.setSpacing(10);

        Label titleLabel = new Label("Eco-Resolver");
        titleLabel.setId("titleLabel");

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Image icon = new Image(getClass().getResourceAsStream("/images/Logo.png"));
        ImageView settingsIconView = new ImageView(icon);
        settingsIconView.setFitHeight(50);
        settingsIconView.setFitWidth(50);
        Button settingsButton = new Button("", settingsIconView);
        settingsButton.setId("settingsButton");
        settingsButton.setOnAction(event -> showProfile());

        Button logoutButton = new Button("Logout");
        logoutButton.setId("logoutButton");
        logoutButton.setOnAction(event -> Logout());

        topBar.getChildren().addAll(titleLabel, spacer, settingsButton, logoutButton);
        SceneChat.setTop(topBar);

        // Chat area
        chatArea = new VBox();
        chatArea.setId("chatArea");
        chatArea.setPadding(new Insets(10, 20, 10, 20));
        chatArea.setSpacing(10);

        chatScrollPane = new ScrollPane(chatArea);
        chatScrollPane.setFitToWidth(true);
        SceneChat.setCenter(chatScrollPane);

        // Input area
        inputArea = new VBox();
        inputArea.setId("inputArea");
        inputArea.setPadding(new Insets(10, 20, 10, 20));
        inputArea.setSpacing(10);
        inputArea.setAlignment(Pos.CENTER);

        ScrollPane inputScrollPane = new ScrollPane(inputArea);
        inputScrollPane.setFitToWidth(true);
        inputScrollPane.setPrefHeight(210);
        SceneChat.setBottom(inputScrollPane);
        updateQuestions();

        //fitur tambahan, button yang ketika ditekan akan langsung mengscroll ke akhir chat
        scrollToBottomButton = new Button("⬇");
        scrollToBottomButton.setId("scrollToBottomButton");
        scrollToBottomButton.setOnAction(event -> chatScrollPane.setVvalue(1.0));
        
        StackPane chatStackPane = new StackPane();
        chatStackPane.getChildren().addAll(chatScrollPane, scrollToBottomButton);
        StackPane.setAlignment(scrollToBottomButton, Pos.BOTTOM_RIGHT);
        StackPane.setMargin(scrollToBottomButton, new Insets(10));
        SceneChat.setCenter(chatStackPane);

        HBox inputBox = new HBox();
        inputBox.getChildren().addAll(inputScrollPane);
        HBox.setHgrow(inputScrollPane, Priority.ALWAYS);
        SceneChat.setBottom(inputBox);

        Scene chatScene = new Scene(SceneChat, 1000, 600);
        chatScene.getStylesheets().add(getClass().getResource("/style/styleChatScene.css").toExternalForm());
        stage.setScene(chatScene);
        ScreenSizeUtils.restoreScreenSize(stage);
        stage.show();
        welcomeMessage();

        // fitur tambahan, tombol untuk scroll keakhir chat akan hilang ketika kita sedang berada di akhir chat/sesuai yang diatur
        chatScrollPane.vvalueProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.doubleValue() < 1.0) {
                scrollToBottomButton.setVisible(true);
            } else {
                scrollToBottomButton.setVisible(false);
            }
        });
    }


    private void welcomeMessage() {
        String welcomeText = "Halo!, selamat datang di Eco-Resolver";
        addMessage(chatArea, welcomeText, false);
    }

    private void addMessage(VBox chatArea, String message, boolean isUser) {
        HBox messageBox = new HBox();
        messageBox.setPadding(new Insets(5, 10, 5, 10));
        messageBox.setAlignment(isUser ? Pos.CENTER_RIGHT : Pos.CENTER_LEFT);

        Label messageLabel = new Label(message);
        messageLabel.setWrapText(true);
        messageLabel.setId(isUser ? "userMessage" : "botMessage");

        messageBox.getChildren().add(messageLabel);
        chatArea.getChildren().add(messageBox);

        applyFadeTransition(messageBox, 0, 1, 1);
        Platform.runLater(() -> chatScrollPane.setVvalue(1.0));
    }

    private void askQuestion(QuestionAnswer qa) {
        if (!tungguRespon) {
            tungguRespon = true;
            addMessage(chatArea, qa.getQuestion(), true);
            animasiBerpikir(chatArea, qa.getAnswer());
            currentQuestion = qa.getNext();
        }
    }

    private void updateQuestions() {
        inputArea.getChildren().clear();
        List<QuestionAnswer> currentQuestions = QuestionAndAnswerData.getQuestions(currentQuestion);

        for (int i = 0; i < currentQuestions.size(); i++) {
            QuestionAnswer qa = currentQuestions.get(i);
            Button questionButton = new Button(qa.getQuestion());
            questionButton.setId("questionButton");
            questionButton.setOnAction(event -> askQuestion(qa));

            Label numberLabel = new Label((i + 1) + ". ");
            HBox buttonContainer = new HBox(numberLabel, questionButton);
            buttonContainer.setAlignment(Pos.CENTER_LEFT);
            inputArea.getChildren().add(buttonContainer);

            //tambahan code untuk memanjangkan jangkauan tekan Questionbox
            HBox.setHgrow(questionButton, Priority.ALWAYS);
            questionButton.setMaxWidth(Double.MAX_VALUE);
            questionButton.setAlignment(Pos.BASELINE_LEFT);

            if (i < currentQuestions.size() - 1) {
                Separator separator = new Separator();
                inputArea.getChildren().add(separator);
            }
        }
    }

    private void animasiBerpikir(VBox chatArea, String answer) {
        HBox thinkingBox = new HBox();
        thinkingBox.setPadding(new Insets(5, 10, 5, 10));
        thinkingBox.setAlignment(Pos.CENTER_LEFT);

        Label thinkingLabel = new Label("");
        thinkingLabel.setId("thinkingMessage");

        thinkingBox.getChildren().add(thinkingLabel);
        chatArea.getChildren().add(thinkingBox);

        Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(0), event -> thinkingLabel.setText(".")),
            new KeyFrame(Duration.seconds(0.5), event -> thinkingLabel.setText("..")),
            new KeyFrame(Duration.seconds(1), event -> thinkingLabel.setText("...")),
            new KeyFrame(Duration.seconds(1.5), event -> thinkingLabel.setText(""))
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        Platform.runLater(() -> chatScrollPane.setVvalue(1.0));

        int delay = new Random().nextInt(3) + 1;

        new Thread(() -> {
            try {
                Thread.sleep(delay * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                chatArea.getChildren().remove(thinkingBox);
                addMessage(chatArea, answer, false);
                tungguRespon = false;
                updateQuestions();
            });
        }).start();
    }

    // penambahan fitur, sekarang bisa menghide password, dan kita bisa mengubah username dan password
    private void showProfile() {
        Dialog<Void> profileDialog = new Dialog<>();
        profileDialog.setTitle("Profile Information");
        profileDialog.getDialogPane().getStylesheets().add(getClass().getResource("/style/styleChatScene.css").toExternalForm());
        profileDialog.getDialogPane().getStyleClass().add("profile-dialog");
    
        profileDialog.getDialogPane().setMinWidth(400);
        profileDialog.getDialogPane().setMinHeight(300);
    
        GridPane profileLayout = new GridPane();
        profileLayout.setAlignment(Pos.CENTER);
        profileLayout.setPadding(new Insets(20));
        profileLayout.setHgap(10);
        profileLayout.setVgap(10);
    
        usernameLabel = new Label("Username: " + username);
        usernameLabel.getStyleClass().add("label");
    
        passwordLabel = new Label("Password: " + "*".repeat(password.length()));
        passwordLabel.getStyleClass().add("label");
    
        Button showHidePasswordButton = new Button("Show");
        showHidePasswordButton.setOnAction(event -> {
            if (showHidePasswordButton.getText().equals("Show")) {
                passwordLabel.setText("Password: " + password);
                showHidePasswordButton.setText("Hide");
            } else {
                passwordLabel.setText("Password: " + "*".repeat(password.length()));
                showHidePasswordButton.setText("Show");
            }
        });
    
        Button changeUsernameButton = new Button("Change Username");
        changeUsernameButton.setOnAction(event -> changeUsername());
    
        Button changePasswordButton = new Button("Change Password");
        changePasswordButton.setOnAction(event -> changePassword());
    
        profileLayout.add(usernameLabel, 0, 0);
        profileLayout.add(changeUsernameButton, 1, 0);
        profileLayout.add(passwordLabel, 0, 1);
        profileLayout.add(changePasswordButton, 1, 1);
        profileLayout.add(showHidePasswordButton, 1, 2);
    
        profileDialog.getDialogPane().setContent(profileLayout);
        profileDialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
    
        profileDialog.showAndWait();
    }
    
    private void changeUsername() {
        DB_Utils DButils = new DB_Utils(stage);
        TextInputDialog dialog = new TextInputDialog(username);
        dialog.setTitle("Change Username");
        dialog.setHeaderText("Enter new username:");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(newUsername -> {
            if (newUsername == null || newUsername.trim().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Username and Password cannot be empty!");
                alert.show();
            } else {
                DButils.updateUsernameInDatabase(username, newUsername);
                username = newUsername;
                usernameLabel.setText("Username: " + newUsername);
            }
        });
    }
    
    private void changePassword() {
        DB_Utils DButils = new DB_Utils(stage);
        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Change Password");
        dialog.setHeaderText("Enter new password:");
    
        ButtonType okButtonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(okButtonType, ButtonType.CANCEL);
    
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("New Password");
    
        dialog.getDialogPane().setContent(passwordField);
    
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == okButtonType) {
                return passwordField.getText();
            }
            return null;
        });
    
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(newPassword -> {
            if (newPassword == null || newPassword.trim().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Username and Password cannot be empty!");
                alert.show();
            } else {
                DButils.updatePasswordInDatabase(username, newPassword);
                password = newPassword;
                passwordLabel.setText("Password: " + "*".repeat(newPassword.length()));
            }
        });
    }
    
    private void Logout() {
        Alert logoutAlert = new Alert(Alert.AlertType.CONFIRMATION);
        logoutAlert.setTitle("Logout Confirmation");
        logoutAlert.setHeaderText("Are you sure you want to logout?");
        logoutAlert.setContentText("Press OK to logout or Cancel to stay.");

        logoutAlert.showAndWait().ifPresent(respon -> {
            if (respon == ButtonType.OK) {
                LoginScene loginScene = new LoginScene(stage);
                loginScene.showScene();
            }
        });
    }
}