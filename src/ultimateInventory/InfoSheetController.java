package ultimateInventory;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class InfoSheetController{

    @FXML
    Label TitleLabel;
    @FXML
    Label IDLabel;
    @FXML
    Label VendorNameLabel;
    @FXML
    Label VendorEmailLabel;
    @FXML
    Label VendorContactLabel;
    @FXML
    Label VendorWebsiteLabel;
    @FXML
    Label PriceLabel;
    @FXML
    Label PayMethodLabel;
    @FXML
    Label PayTermLabel;
    @FXML
    Label PayDateLabel;
    @FXML
    Label CurrLabel;
    @FXML
    Label NoteLabel;



    public void setData(String title, String id, String [] array)
    {
        TitleLabel.setText(title);
        IDLabel.setText(id);
        VendorNameLabel.setText(array[0]);
        VendorEmailLabel.setText(array[1]);
        VendorContactLabel.setText(array[2]);
        VendorWebsiteLabel.setText(array[3]);
        PriceLabel.setText(array[4]);
        PayMethodLabel.setText(array[5]);
        PayTermLabel.setText(array[6]);
        PayDateLabel.setText(array[7]);
        CurrLabel.setText(array[8]);
        NoteLabel.setText(array[9]);

    }
}
