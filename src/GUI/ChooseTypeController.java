package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseTypeController {
    private Parent root;

    public void chooseSoft(ActionEvent event) throws IOException {
        ChooseBrandController.order.getCoffee().setCoffeeType("Soft");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
        root = loader.load();
        SceneController sceneController = loader.getController();
        sceneController.TextLabelType("Soft");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void chooseMedium(ActionEvent event) throws IOException {
        ChooseBrandController.order.getCoffee().setCoffeeType("Medium");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
        root = loader.load();
        SceneController sceneController = loader.getController();
        sceneController.TextLabelType("Medium");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void chooseStrong(ActionEvent event) throws IOException {
        ChooseBrandController.order.getCoffee().setCoffeeType("Strong");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
        root = loader.load();
        SceneController sceneController = loader.getController();
        sceneController.TextLabelType("Strong");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
