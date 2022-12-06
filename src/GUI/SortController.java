package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class SortController {
    @FXML
    ScrollPane scrollSort;

    public void showSortByAmount(){
        Text text = new Text();
        ChooseBrandController.order.sortByAmount();
        text.setText(ChooseBrandController.order.showCoffee());
        scrollSort.setContent(text);
    }

    public void showSortByPrice(){
        Text text = new Text();
        ChooseBrandController.order.sortByPrice();
        text.setText(ChooseBrandController.order.showCoffee());
        scrollSort.setContent(text);
    }

    public void backToMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("orderCreate.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }
}
