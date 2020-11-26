package gui.mainMenuElements;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    final int height = (int) screenSize.getHeight();
    final int width = (int) screenSize.getWidth();
    Dimension buttonSize = new Dimension(width / 3, height / 10);


    /**
     *
     */
    public MainMenu() {
        System.out.println("height = " + height);
        this.add(new MainMenuButton(buttonSize, height / 2 - (height / 10), "Return to desktop"));
    }
}
