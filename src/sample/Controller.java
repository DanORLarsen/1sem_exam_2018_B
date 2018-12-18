package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;


public class Controller {
    @FXML
    TextField textField;
    @FXML
    TextArea output;
    public void kigIMappe(ActionEvent actionEvent) {
        File folder = new File(textField.getText()+"\\\\\\\\");
        File[] fileList = folder.listFiles();
        for (int i = 0; i < fileList.length ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(fileList[i]);
            sb.delete(0,6);
            //Så skriver den ikke media\ foran alle sammen.
           output.setText(output.getText()+sb.toString()+"\n");

        }
    }
}
