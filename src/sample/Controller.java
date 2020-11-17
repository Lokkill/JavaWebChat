package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ListView<String> messageList;
    @FXML
    private TextField textField;
    @FXML
    private ListView<String> listContact;

    @FXML
    public void sendMessage() {
        String text = textField.getText();
        if (!text.isBlank()){
            messageList.getItems().add(text);
        }
        textField.setText("");
    }


}
