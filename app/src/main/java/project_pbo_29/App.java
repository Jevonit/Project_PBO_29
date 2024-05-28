package project_pbo_29;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import project_pbo_29.Scenes.LoginScene;

public class App extends Application{

    @Override
    public void start(Stage PrimaryStage){
        PrimaryStage.setTitle("Eco-Resolver");
        Image icon = new Image(getClass().getResourceAsStream("/images/Logo.png"));
        PrimaryStage.getIcons().add(icon);

        LoginScene homeScene = new LoginScene(PrimaryStage);
        homeScene.showLoginScene(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}
