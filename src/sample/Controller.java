package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    ArrayList<String> wordArray = new ArrayList<String>();

    @FXML
    private TextField indtastNoget;
    @FXML
    private TextArea outputText;
    public void sendMetode(ActionEvent actionEvent) {
        String s = indtastNoget.getText();
        wordArray.add(s);
        outputText.setText(outputText.getText() + indtastNoget.getText() + "\n");
        indtastNoget.clear();


    }


}
