package project_pbo_29.Utils;

import javafx.stage.Stage;

public class ScreenSizeUtils {
    private static boolean isFullscreen = false;
    private static double width = 1000;
    private static double height = 600;

    public static void saveScreenSize(Stage stage) {
        isFullscreen = stage.isFullScreen();
        width = stage.getWidth();
        height = stage.getHeight();
    }

    public static void restoreScreenSize(Stage stage) {
        stage.setFullScreen(isFullscreen);
        if (!isFullscreen) {
            stage.setWidth(width);
            stage.setHeight(height);
        }
    }
}

