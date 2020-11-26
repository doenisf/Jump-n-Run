package gui.mainMenu;

public class StartGameButton extends MainMenuButton {

    /**
     * Creates a button for the main menu.
     */
    public StartGameButton() {
        super("Start game");
        this.addActionListener(e -> {
            System.out.println("Start game");
        });
    }
}
