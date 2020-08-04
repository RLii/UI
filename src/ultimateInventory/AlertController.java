package ultimateInventory;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AlertController implements Initializable {

    @FXML public Label error;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void setAlertText(String text)
    {
        error.setText(text);
    }
}
