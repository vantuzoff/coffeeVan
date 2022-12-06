package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseSpeciesController {
    private Parent root;
    public void chooseGrain(ActionEvent event) throws IOException {
        ChooseBrandController.order.getCoffee().setCoffeeSpecies("Grain");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
        root = loader.load();
        SceneController sceneController = loader.getController();
        sceneController.TextLabelSpecies("Grain");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void chooseGround(ActionEvent event) throws IOException {
        ChooseBrandController.order.getCoffee().setCoffeeSpecies("Ground");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
        root = loader.load();
        SceneController sceneController = loader.getController();
        sceneController.TextLabelSpecies("Ground");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void chooseInstant(ActionEvent event) throws IOException {
        ChooseBrandController.order.getCoffee().setCoffeeSpecies("Instant");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
        root = loader.load();
        SceneController sceneController = loader.getController();
        sceneController.TextLabelSpecies("Instant");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
