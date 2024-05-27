package project_pbo_29.Scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import project_pbo_29.DButils;

public class LoginScene {
    private Stage stage;

    public LoginScene(Stage stage){
        this.stage = stage;
    }

    public void showLoginScene(){
        DButils DButils = new DButils(stage);
        BorderPane SceneLogin = new BorderPane();

        // Kiri
        GridPane bagianKiri = new GridPane();
        bagianKiri.setId("LoginSceneKiri");

        Image image = new Image(getClass().getResourceAsStream("/images/Logo.png"));
        ImageView logo = new ImageView(image);
        logo.setFitHeight(100);
        logo.setFitWidth(100);

        Label EcoResolver = new Label("Eco-Resolver");
        Label deskripsiSingkat = new Label("An eco-themed app that guides\nhow to reduce waste effectively.");
        EcoResolver.setId("namaLogo");
        deskripsiSingkat.setId("deskripsi");

        bagianKiri.add(logo, 0, 0);
        bagianKiri.add(EcoResolver, 0, 1);
        bagianKiri.add(deskripsiSingkat, 0, 2);

        // Kanan
        GridPane bagianKanan = new GridPane();
        bagianKanan.setId("LoginSceneKanan");
        bagianKanan.setPadding(new Insets(50));
        bagianKanan.setVgap(20);
        bagianKanan.setHgap(10);
        bagianKanan.setAlignment(Pos.CENTER);

        Label Text1 = new Label("Sign In");
        Text1.setId("textSignIn");

        TextField usernameField = new TextField();
        usernameField.setId("Username");
        usernameField.setPromptText("Username");

        PasswordField passwordField = new PasswordField();
        passwordField.setId("password");
        passwordField.setPromptText("Password");

        Button signInButton = new Button("Sign in");
        Button dontHaveAccountButton = new Button("Don't have an account? Sign up");
        signInButton.setId("signInButton");
        dontHaveAccountButton.setId("dontHaveAccount");

        signInButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            DButils.loginUser(event, username, password);
        });

        dontHaveAccountButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            DButils.signUpUser(event, username, password);
        });

        bagianKanan.add(Text1, 0, 0, 2, 1);
        bagianKanan.add(usernameField, 0, 1, 2, 1);
        bagianKanan.add(passwordField, 0, 2, 2, 1);
        bagianKanan.add(signInButton, 0, 3);
        bagianKanan.add(dontHaveAccountButton, 0, 4, 2, 1);

        // Layout dan show
        SceneLogin.setLeft(bagianKiri);
        SceneLogin.setCenter(bagianKanan);
        Scene loginScene = new Scene(SceneLogin, 1000, 600);
        loginScene.getStylesheets().add(getClass().getResource("/style/styleLoginScene.css").toExternalForm());
        stage.setScene(loginScene);
        stage.show();
    }
}
