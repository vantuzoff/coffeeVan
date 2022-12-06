package GUI;

import Classes.Coffee;
import Classes.Coffee_Van;
import Classes.Inventory;
import Classes.Order;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ChooseBrandController {
    static Order order;
    public void setNescafe(ActionEvent event) throws IOException {
        order = new Order();
        Coffee_Van.addOrder(order);
        ArrayList<Inventory> arrInv;
        arrInv = Coffee_Van.retArrInv();
        order.getCoffee().setBrand(((Coffee)arrInv.get(0)).getBrand());
        order.getCoffee().setCoffeePrice(((Coffee)arrInv.get(0)).getPrice());
        order.getCoffee().setAmount(((Coffee)arrInv.get(0)).getAmount());
        FXMLLoader loader = new FXMLLoader(MainFXController.class.getResource("orderCreate.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
        System.out.println("Nescafe set");
    }

    public void setJacobs(ActionEvent event) throws IOException {
        order = new Order();
        Coffee_Van.addOrder(order);
        ArrayList<Inventory> arrInv;
        arrInv = Coffee_Van.retArrInv();
        order.getCoffee().setBrand(((Coffee)arrInv.get(1)).getBrand());
        order.getCoffee().setCoffeePrice(((Coffee)arrInv.get(1)).getPrice());
        order.getCoffee().setAmount(((Coffee)arrInv.get(1)).getAmount());
        FXMLLoader loader = new FXMLLoader(MainFXController.class.getResource("orderCreate.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
        System.out.println("Jacobs set");
    }

    public void setNesquik(ActionEvent event) throws IOException {
        order = new Order();
        Coffee_Van.addOrder(order);
        ArrayList<Inventory> arrInv;
        arrInv = Coffee_Van.retArrInv();
        order.getCoffee().setBrand(((Coffee)arrInv.get(2)).getBrand());
        order.getCoffee().setCoffeePrice(((Coffee)arrInv.get(2)).getPrice());
        order.getCoffee().setAmount(((Coffee)arrInv.get(2)).getAmount());
        FXMLLoader loader = new FXMLLoader(MainFXController.class.getResource("orderCreate.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
        System.out.println("Nesquik set");
    }

}
