package GUI;

import Classes.Coffee_Van;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.sql.SQLException;

public class MainFX extends Application {
        @Override
        public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader(MainFXController.class.getResource("source.fxml"));
            Scene scene = new Scene(loader.load(), 960, 540, Color.rgb(30,14,1));

            Image icon = new Image("3506338.png");

            stage.getIcons().add(icon);
            stage.setResizable(false);
            stage.setTitle("CoffeeVan App");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) throws SQLException {
            new Coffee_Van().getInventory();
            launch();
        }

}
