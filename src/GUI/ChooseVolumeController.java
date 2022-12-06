package GUI;

import Classes.Coffee;
import Classes.Coffee_Van;
import Classes.Inventory;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ChooseVolumeController {
    Parent root;
    public void choose2kg(ActionEvent event) throws IOException {
        if (2 <= ChooseBrandController.order.getCoffee().getAmount()) {
            ArrayList<Inventory> arrInv;
            arrInv = Coffee_Van.retArrInv();
            ChooseBrandController.order.getPackage1().setVolume(2);
            for (Inventory inv : arrInv) {
                if (Objects.equals(((Coffee) inv).getBrand(), ChooseBrandController.order.getCoffee().getBrand()))
                    ((Coffee) inv).setAmount(((Coffee) inv).getAmount() - 2);
            }
            ChooseBrandController.order.getPackage1().setPackagePrice(2 * ChooseBrandController.order.getCoffee().getPrice());
            System.out.println("Price: " + ChooseBrandController.order.getPackage1().getPrice());
            ChooseBrandController.order.setPrice(ChooseBrandController.order.getPackage1().getPrice());
            Coffee_Van.setProfit(ChooseBrandController.order.getPackage1().getPrice());
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
            root = loader.load();
            SceneController sceneController = loader.getController();
            sceneController.TextLabelVolume(2);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
            root = loader.load();
            SceneController sceneController = loader.getController();
            sceneController.TextLabelVolumeError(ChooseBrandController.order.getCoffee().getAmount());
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void choose5kg(ActionEvent event) throws IOException {
        if (5 <= ChooseBrandController.order.getCoffee().getAmount()) {
            ArrayList<Inventory> arrInv;
            arrInv = Coffee_Van.retArrInv();
            ChooseBrandController.order.getPackage1().setVolume(5);
            for (Inventory inv : arrInv) {
                if (Objects.equals(((Coffee) inv).getBrand(), ChooseBrandController.order.getCoffee().getBrand()))
                    ((Coffee) inv).setAmount(((Coffee) inv).getAmount() - 5);
            }
            ChooseBrandController.order.getPackage1().setPackagePrice(5 * ChooseBrandController.order.getCoffee().getPrice());
            System.out.println("Price: " + ChooseBrandController.order.getPackage1().getPrice());
            ChooseBrandController.order.setPrice(ChooseBrandController.order.getPackage1().getPrice());
            Coffee_Van.setProfit(ChooseBrandController.order.getPackage1().getPrice());
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
            root = loader.load();
            SceneController sceneController = loader.getController();
            sceneController.TextLabelVolume(5);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
            root = loader.load();
            SceneController sceneController = loader.getController();
            sceneController.TextLabelVolumeError(ChooseBrandController.order.getCoffee().getAmount());
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void choose10kg(ActionEvent event) throws IOException {
        if (10 <= ChooseBrandController.order.getCoffee().getAmount()) {
            ArrayList<Inventory> arrInv;
            arrInv = Coffee_Van.retArrInv();
            ChooseBrandController.order.getPackage1().setVolume(10);
            for (Inventory inv : arrInv) {
                if (Objects.equals(((Coffee) inv).getBrand(), ChooseBrandController.order.getCoffee().getBrand()))
                    ((Coffee) inv).setAmount(((Coffee) inv).getAmount() - 10);
            }
            ChooseBrandController.order.getPackage1().setPackagePrice(10 * ChooseBrandController.order.getCoffee().getPrice());
            System.out.println("Price: " + ChooseBrandController.order.getPackage1().getPrice());
            ChooseBrandController.order.setPrice(ChooseBrandController.order.getPackage1().getPrice());
            Coffee_Van.setProfit(ChooseBrandController.order.getPackage1().getPrice());
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
            root = loader.load();
            SceneController sceneController = loader.getController();
            sceneController.TextLabelVolume(10);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
            root = loader.load();
            SceneController sceneController = loader.getController();
            sceneController.TextLabelVolumeError(ChooseBrandController.order.getCoffee().getAmount());
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
}
