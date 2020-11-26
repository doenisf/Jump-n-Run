package gui.mainMenu;

import javax.swing.*;
import java.awt.*;

public abstract class MainMenuButton extends JButton {

    /**
     * Creates a button for the main menu.
     *
     * @param dimension Dimension - the dimension or size of the button
     * @param y         int - y coordinate of the button
     * @param labelText String - text to be displayed on the button
     */
    public MainMenuButton(Dimension dimension, int y, String labelText) {
        this.setSize(dimension);
        this.setAlignmentY(y);
        this.add(new JLabel(labelText));
    }

}