package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderCreateController {
    Parent root;
    public void chooseSpecies(ActionEvent event) throws IOException {
        System.out.println(ChooseBrandController.order.toString());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("chooseSpecies.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void chooseType(ActionEvent event) throws IOException {
        System.out.println(ChooseBrandController.order.toString());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("chooseType.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void chooseVolume(ActionEvent event) throws IOException {
        System.out.println(ChooseBrandController.order.toString());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("chooseVolume.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void choosePrevious(ActionEvent event) throws IOException {
        if (ChooseBrandController.order.getCoffee().getAmount() >= 1) {
            if (ChooseBrandController.order.getPackage1().getVolume() != 0) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("source.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.show();
            } else {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
                root = loader.load();
                SceneController sceneController = loader.getController();
                sceneController.TextLabelPrevious();
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("source.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.show();
        }
    }

    public void chooseCustomVolume(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("chooseCustomVolume.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void chooseSortByAmount(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sort.fxml"));
        root = loader.load();
        SortController sortController = loader.getController();
        sortController.showSortByAmount();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void chooseSortByPrice(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sort.fxml"));
        root = loader.load();
        SortController sortController = loader.getController();
        sortController.showSortByPrice();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
