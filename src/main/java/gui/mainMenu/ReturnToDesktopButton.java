package gui.mainMenu;

import javax.swing.*;

public class ReturnToDesktopButton extends MainMenuButton{

    /**
     * Creates a button for the main menu.
     */
    public ReturnToDesktopButton() {
        super("Return to desktop");
        this.addActionListener(e -> {
            JButton source = (JButton) e.getSource();
            JFrame frame = (JFrame) source.getTopLevelAncestor();
            frame.dispose();
        });
    }
}
