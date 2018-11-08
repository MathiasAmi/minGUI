package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    ArrayList<String> wordArray = new ArrayList<String>();

    @FXML
    private TextField indtastNoget;
    @FXML
    private TextArea outputText;
    @FXML
    private Button fact;

    public void sendMetode(ActionEvent actionEvent) {
        String s = indtastNoget.getText();
        wordArray.add(s);
        outputText.setText(outputText.getText() + indtastNoget.getText() + "\n");
        indtastNoget.clear();

    }


    public void factMetode(ActionEvent actionEvent) {
        outputText.setText(fact.getText() + ": Dan er max skrald" + "\n" + outputText.getText() + "\n");
        indtastNoget.clear();
    }
}
