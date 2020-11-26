package gui.mainMenu;

import gui.constants.EnvironmentConstants;

import javax.swing.*;
import java.awt.*;

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
        this.add(createButtonPane(), BorderLayout.CENTER);
    }

    private JPanel createButtonPane() {
        JPanel buttonPane = new JPanel();
        buttonPane.setBorder(BorderFactory.createEmptyBorder());
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.PAGE_AXIS));
        buttonPane.add(Box.createRigidArea(EnvironmentConstants.env.EMPTY_SPACE));
        buttonPane.add(new StartGameButton());
        buttonPane.add(Box.createRigidArea(EnvironmentConstants.env.EMPTY_SPACE));
        buttonPane.add(new ReturnToDesktopButton());

        return buttonPane;
    }
}
