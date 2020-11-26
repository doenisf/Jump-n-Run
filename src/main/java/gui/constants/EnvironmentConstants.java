package gui.constants;

import java.awt.*;

public final class EnvironmentConstants {
    public final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public final int SCREEN_HEIGHT = (int) SCREEN_SIZE.getHeight();
    public final int SCREEN_WIDTH = (int) SCREEN_SIZE.getWidth();
    public final Dimension BUTTON_SIZE = new Dimension(SCREEN_HEIGHT / 3, SCREEN_WIDTH / 10);

    public static EnvironmentConstants env;

    /**
     * Initialize the environment constants
     */
    public static void init() {
        env = new EnvironmentConstants();
    }

    private EnvironmentConstants() {}
}
