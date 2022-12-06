package GUI;

import Classes.Coffee;
import Classes.Coffee_Van;
import Classes.Inventory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

public class ChooseCustomVolumeController {
    @FXML
    Label cusVolLabel;
    @FXML
    TextField volumeField;
    int vol;
    Parent root;
    public void chooseCustomVolume(ActionEvent event){
        try {
            vol = Integer.parseInt(volumeField.getText());
            if (vol <= ChooseBrandController.order.getCoffee().getAmount()){
                ArrayList<Inventory> arrInv;
                arrInv = Coffee_Van.retArrInv();
                ChooseBrandController.order.getPackage1().setVolume(vol);
                for (Inventory inv: arrInv){
                    if (Objects.equals(((Coffee) inv).getBrand(), ChooseBrandController.order.getCoffee().getBrand()))
                        ((Coffee) inv).setAmount(((Coffee) inv).getAmount()-vol);
                }
                ChooseBrandController.order.getPackage1().setPackagePrice(vol*ChooseBrandController.order.getCoffee().getPrice());
                System.out.println("Price: "+ChooseBrandController.order.getPackage1().getPrice());
                ChooseBrandController.order.setPrice(ChooseBrandController.order.getPackage1().getPrice());
                Coffee_Van.setProfit(ChooseBrandController.order.getPackage1().getPrice());
                FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneLabel.fxml"));
                root = loader.load();
                SceneController sceneController = loader.getController();
                sceneController.TextLabelVolume(vol);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
        }catch (NumberFormatException e){
            cusVolLabel.setText("Please input numbers");
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
