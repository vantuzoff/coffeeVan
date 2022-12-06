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
public class SceneController {
    @FXML
    Label labelSpecies;

    public void TextLabelSpecies(String speciesText){
        labelSpecies.setText("Coffee species chosen successfully\nSpecies - "+speciesText);
    }

    public void TextLabelType(String typeText){
        labelSpecies.setText("Coffee type chosen successfully\nSpecies - "+typeText);
    }

    public void TextLabelVolume(int vol){
        labelSpecies.setText("Coffee volume chosen successfully\nVolume - "+vol+" kg");
    }

    public void TextLabelPrevious(){
        labelSpecies.setText("You can't exit without choosing volume!");
    }

    public void TextLabelSortedByAmount(){

    }

    public void TextLabelVolumeError(int amount){
        if (amount >= 1){
            labelSpecies.setText("Volume is too big!");
        }else {
            labelSpecies.setText("There's less than 1 kg of this coffee brand!\nYou can exit to main menu!");
        }
    }

    public void backToMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("orderCreate.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }
}
