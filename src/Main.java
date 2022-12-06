import Classes.Coffee_Van;
import Classes.MainMenu;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        new Coffee_Van().getInventory();
        new MainMenu().OpenMainMenu();
    }
}