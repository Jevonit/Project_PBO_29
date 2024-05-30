package project_pbo_29.Scenes;

import javafx.animation.FadeTransition;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public abstract class BaseScene {
    protected Stage stage;

    public BaseScene(Stage stage) {
        this.stage = stage;
    }

    public abstract void showScene();

    protected void applyFadeTransition(Pane pane, double fromValue, double toValue, double duration) {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(duration), pane);
        fadeTransition.setFromValue(fromValue);
        fadeTransition.setToValue(toValue);
        fadeTransition.play();
    }

}


