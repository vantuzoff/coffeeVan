package GUI;

import Classes.Coffee_Van;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
public class ProfitController {
    @FXML
    Label labelProfit;

    public void displayProfit(){
        labelProfit.setText("Coffee van profit: "+ Coffee_Van.getProfit());
    }

    public void displayOrderHistory(){

    }
    public void backToMainMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("source.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }
}
