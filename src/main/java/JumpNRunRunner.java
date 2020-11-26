import gui.constants.EnvironmentConstants;
import gui.mainMenu.MainMenu;

import javax.swing.*;

public class JumpNRunRunner implements Runnable{
    private JFrame frame = new JFrame("Jump'n'Run by Simon");

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        EnvironmentConstants.init();
        startFrame();
    }

    /**
     * Initializes the frame and starts it with the main menu showing
     */
    private void startFrame() {
        frame.setContentPane(new MainMenu());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
