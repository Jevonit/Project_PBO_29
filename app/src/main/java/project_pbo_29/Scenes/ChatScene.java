package project_pbo_29.Scenes;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Random;

public class ChatScene {
    private Stage stage;
    private String username;
    private String password;
    private boolean isWaitingForResponse = false; // flag to check if the user is waiting for a response

    public ChatScene(Stage stage, String username, String password) {
        this.stage = stage;
        this.username = username;
        this.password = password;
    }

    public ChatScene(Stage stage) {
        this.stage = stage;
    }

    public void showChatScene() {
        BorderPane SceneChat = new BorderPane();
        SceneChat.setId("SceneChat");

        // nama logo, icon logo, dan button logout
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
        settingsButton.setOnAction(event -> settingMenu());

        Button logoutButton = new Button("Logout");
        logoutButton.setId("logoutButton");
        logoutButton.setOnAction(event -> Logout());

        topBar.getChildren().addAll(titleLabel, spacer, settingsButton, logoutButton);
        SceneChat.setTop(topBar);

        // chat area
        VBox chatArea = new VBox();
        chatArea.setId("chatArea");
        chatArea.setPadding(new Insets(10, 20, 10, 20));
        chatArea.setSpacing(10);

        ScrollPane chatScrollPane = new ScrollPane(chatArea);
        chatScrollPane.setFitToWidth(true);
        SceneChat.setCenter(chatScrollPane);

        // input area
        VBox inputArea = new VBox();
        inputArea.setId("inputArea");
        inputArea.setPadding(new Insets(10, 20, 10, 20));
        inputArea.setSpacing(10);

        Button question1Button = new Button("Halo, saya ingin bertanya tentang pengertian reduce, reuse, dan recyle");
        question1Button.setId("questionButton");
        question1Button.setOnAction(event -> askQuestion(chatArea, "Halo, saya ingin bertanya tentang pengertian reduce, reuse, dan recyle", "1. Reduce\r\n" + 
                        "reduce atau mengurangi adalah konsep untuk mengurangi penggunaan bahan yang tidak perlu dan mengurangi jumlah sampah yang dihasilkan. Hal ini dapat dilakukan dengan cara mengurangi konsumsi sumber daya alam dan mengurangi produksi limbah.\r\n" + 
                        "\r\n" + 
                        "Beberapa contoh pengurangan penggunaan bahan yang tidak perlu adalah dengan membeli produk dengan kemasan yang ramah lingkungan, menggunakan kantong belanjaan yang dapat digunakan kembali, atau memilih produk yang memiliki masa pakai yang lebih lama.\r\n" + 
                        "\r\n" + 
                        "Manfaat dari konsep reduce adalah dapat mengurangi penggunaan sumber daya alam dan mengurangi jumlah sampah yang dihasilkan. Dengan cara ini, akan mengurangi dampak negatif terhadap lingkungan.\r\n" + 
                        "\r\n" + 
                        "2. Reuse\r\n" + 
                        " reuse atau menggunakan kembali adalah konsep untuk menggunakan kembali bahan yang masih bisa digunakan dan meminimalisir jumlah sampah. Hal ini dilakukan dengan cara memanfaatkan kembali produk yang sudah tidak digunakan.\r\n" + 
                        "\r\n" + 
                        "Contohnya dengan memanfaatkan kantong belanjaan yang sudah tidak digunakan lagi sebagai tempat sampah atau membuat tas belanjaan dari bahan-bahan bekas lain seperti baju atau celana yang tidak dipakai lagi.\r\n" + 
                        "\r\n" + 
                        "Manfaat dari konsep ini, Anda dapat mengurangi jumlah sampah yang dihasilkan dan mengurangi penggunaan sumber daya alam yang baru. Penerapan konsep reuse dapat meminimalisasi dampak buruk terhadap lingkungan hidup.\r\n" + 
                        "\r\n" + 
                        "3. Recycle\r\n" + 
                        " recycle atau mendaur ulang adalah konsep untuk mengolah kembali sampah menjadi bahan yang bisa digunakan kembali. Anda bisa melakukannya dengan cara memilah sampah dan mengolahnya menjadi bahan baku yang bisa digunakan kembali.\r\n" + 
                        "\r\n" + 
                        "Beberapa contoh dari konsep ini adalah dengan mengolah sampah kertas menjadi kertas daur ulang atau mengolah botol plastik menjadi serat yang bisa digunakan untuk membuat produk lain seperti baju atau tas.\r\n" + 
                        "\r\n" + 
                        "Manfaat dari konsep recycle juga sama, yaitu mengurangi jumlah sampah yang ada dan mengurangi penggunaan sumber daya alam yang baru. Melalui cara ini, diharapkan dapat mengurangi dampak negatif terhadap lingkungan dan meningkatkan efisiensi penggunaan sumber daya alam.\r\n" + 
                        "\r\n" + 
                        "Dengan menerapkan konsep Reduce Reuse Recycle, selain jumlah dan dampak sampah terhadap lingkungan dapat dikurangi, masyarakat luas juga bisa meningkatkan rasa kepedulian dan kesadaran pada lingkungan."));

        Button question2Button = new Button("Question 2");
        question2Button.setId("questionButton");
        question2Button.setOnAction(event -> askQuestion(chatArea, "Question 2?", "Answer 2"));

        inputArea.getChildren().addAll(question1Button, question2Button);
        SceneChat.setBottom(inputArea);

        Scene chatScene = new Scene(SceneChat, 1000, 600);
        chatScene.getStylesheets().add(getClass().getResource("/style/styleChatScene.css").toExternalForm());
        stage.setScene(chatScene);
        stage.show();
    }

    private void askQuestion(VBox chatArea, String question, String answer) {
        if (!isWaitingForResponse) {
            isWaitingForResponse = true;
            addChatMessage(chatArea, question, true);
            animasiBerpikir(chatArea, answer);
        }
    }

    private void addChatMessage(VBox chatArea, String message, boolean isUser) {
        HBox messageBox = new HBox();
        messageBox.setPadding(new Insets(5, 10, 5, 10));
        messageBox.setAlignment(isUser ? Pos.CENTER_RIGHT : Pos.CENTER_LEFT);

        Label messageLabel = new Label(message);
        messageLabel.setWrapText(true);
        messageLabel.setId(isUser ? "userMessage" : "botMessage");

        messageBox.getChildren().add(messageLabel);
        chatArea.getChildren().add(messageBox);
    }

    private void animasiBerpikir(VBox chatArea, String answer) {
        HBox thinkingBox = new HBox();
        thinkingBox.setPadding(new Insets(5, 10, 5, 10));
        thinkingBox.setAlignment(Pos.CENTER_LEFT);

        Label thinkingLabel = new Label("...");
        thinkingLabel.setId("thinkingMessage");

        thinkingBox.getChildren().add(thinkingLabel);
        chatArea.getChildren().add(thinkingBox);

        int delay = new Random().nextInt(3) + 1;

        new Thread(() -> {
            try {
                Thread.sleep(delay * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                chatArea.getChildren().remove(thinkingBox);
                addChatMessage(chatArea, answer, false);
                isWaitingForResponse = false;
            });
        }).start();
    }

    private void settingMenu() {
        Alert settingsAlert = new Alert(Alert.AlertType.INFORMATION);
        settingsAlert.setTitle("Settings");
        settingsAlert.setHeaderText("Profile Information");
        settingsAlert.setContentText("Username: " + username + "\nPassword: " + password);
        settingsAlert.showAndWait();
    }

    private void Logout(){
        Alert logoutAlert = new Alert(AlertType.CONFIRMATION);
        logoutAlert.setTitle("Logout Confirmation");
        logoutAlert.setHeaderText("Are you sure you want to logout?");
        logoutAlert.setContentText("Press OK to logout or Cancel to stay.");

        logoutAlert.showAndWait().ifPresent(respon -> {
            if (respon == ButtonType.OK) {
                LoginScene loginScene = new LoginScene(stage);
                loginScene.showLoginScene();
            }
        });
    }
}
