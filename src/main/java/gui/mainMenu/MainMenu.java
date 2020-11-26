package gui.mainMenu;

import javax.swing.*;

public class MainMenu extends JPanel {

    /**
     * Create the main menu
     */
    public MainMenu() {
        initMainMenu();
    }

    /**
     * Initialize the main menu
     */
    private void initMainMenu() {
        this.add(new ReturnToDesktopButton());
    }
}
