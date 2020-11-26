package gui.mainMenu;

import gui.constants.EnvironmentConstants;

import javax.swing.*;
import java.awt.*;

public abstract class MainMenuButton extends JButton {

    /**
     * Creates a button for the main menu.
     *
     * @param labelText String - text to be displayed on the button
     */
    public MainMenuButton(String labelText) {
        System.out.println(EnvironmentConstants.env.BUTTON_SIZE.toString());
        this.setSize(EnvironmentConstants.env.BUTTON_SIZE);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(new JLabel(labelText));
    }

}