package ultimateInventory;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CatEditorController implements Initializable {

    private CatTableManager catTableManager;

    //************************************************************_____ADD FORM INPUTS_____*****************************************************************
    @FXML
    Button saveBtn;
    @FXML
    TextField addPriceText;
    @FXML
    TextField addIdText;
    @FXML
    TextField addVendorNameText;
    @FXML
    TextField addVendorEmailText;
    @FXML
    TextField addVendorContactText;
    @FXML
    TextField addVendorWebsiteText;
    @FXML
    RadioButton addCadBtn;
    @FXML
    RadioButton addUsdBtn;
    @FXML
    DatePicker addPurchaseDateText;
    @FXML
    TextField addPayTermText;
    @FXML
    TextField addPayMethodText;
    @FXML
    TextArea addNoteText;

    //************************************************************_____EDIT FORM INPUTS_____*****************************************************************
    @FXML
    Button updateBtn;
    @FXML
    TextField editPriceText;
    @FXML
    TextField editVendorNameText;
    @FXML
    TextField editVendorEmailText;
    @FXML
    TextField editVendorContactText;
    @FXML
    TextField editVendorWebsiteText;
    @FXML
    RadioButton editCadBtn;
    @FXML
    RadioButton editUsdBtn;
    @FXML
    DatePicker editPurchaseDateText;
    @FXML
    TextField editPayTermText;
    @FXML
    TextField editPayMethodText;
    @FXML
    TextArea editNoteText;
    @FXML
    ComboBox editCombox;
    @FXML
    Label editVendorNameLabel;
    @FXML
    Label editVendorEmailLabel;
    @FXML
    Label editVendorContactLabel;
    @FXML
    Label editVendorWebsiteLabel;
    @FXML
    Label editPriceLabel;
    @FXML
    Label editPayMethodLabel;
    @FXML
    Label editPayTermLabel;
    @FXML
    Label editPayDateLabel;
    @FXML
    Label editCurrLabel;
    @FXML
    Label editNoteLabel;

    //************************************************************_____DELETE FORM INPUTS_____*****************************************************************
    @FXML
    Button deleteBtn;
    @FXML
    ComboBox delCombox;
    @FXML
    Label delVendorNameLabel;
    @FXML
    Label delVendorEmailLabel;
    @FXML
    Label delVendorContactLabel;
    @FXML
    Label delVendorWebsiteLabel;
    @FXML
    Label delPriceLabel;
    @FXML
    Label delPayMethodLabel;
    @FXML
    Label delPayTermLabel;
    @FXML
    Label delPayDateLabel;
    @FXML
    Label delCurrLabel;
    @FXML
    Label delNoteLabel;

    //All use variables
    Boolean isCad = true;
    ObservableList<String> data = FXCollections.observableArrayList();

    public void setModel(CatTableManager manager)
    {
        catTableManager = manager;
        buildComBoxData();
    }

    public void add(ActionEvent actionEvent) {
        try
        {

            String curr;
            if(isCad == true)
            {
                curr = "CAD";
            }
            else
            {
                curr = "USD";
            }

            catTableManager.add(addIdText.getText(),
                    addVendorNameText.getText(),
                    addVendorEmailText.getText(),
                    addVendorContactText.getText(),
                    addVendorWebsiteText.getText(),
                    Integer.valueOf(addPriceText.getText()),
                    addPayMethodText.getText(),
                    addPayTermText.getText(),
                    addPurchaseDateText.getEditor().getText(),
                    curr,
                    addNoteText.getText());

            Stage stage = (Stage) saveBtn.getScene().getWindow();
            stage.close();
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error!" + e);
            }
            else
            {
                displayAlert("Please fill out the form correctly");
            }
        }
    }
    public void edit()
    {
        try
        {
            String curr;
            if(isCad == true)
            {
                curr = "CAD";
            }
            else
            {
                curr = "USD";
            }
            catTableManager.edit(editCombox.getValue().toString(),
                    editVendorNameText.getText(),
                    editVendorEmailText.getText(),
                    editVendorContactText.getText(),
                    editVendorWebsiteText.getText(),
                    Integer.parseInt(editPriceText.getText()),
                    editPayMethodText.getText(),
                    editPayTermText.getText(),
                    editPurchaseDateText.getEditor().getText(),
                    curr,
                    editNoteText.getText());

            Stage stage = (Stage) saveBtn.getScene().getWindow();
            stage.close();
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error!" + e);
            }
            else
            {
                displayAlert("Please fill out the form correctly");
            }
        }
    }
    public void delete()
    {
        try
        {
            catTableManager.delete(delCombox.getValue().toString());
        }
        catch(SQLException e)
        {
            displayAlert("Error! :" + e);
        }
        finally {
            Stage stage = (Stage) deleteBtn.getScene().getWindow();
            stage.close();
        }
    }
    public void cadCall()
    {
        addCadBtn.setSelected(true);
        editCadBtn.setSelected(true);
        addUsdBtn.setSelected(false);
        editUsdBtn.setSelected(false);
        isCad = true;
    }
    public void usdCall()
    {
        addUsdBtn.setSelected(true);
        editUsdBtn.setSelected(true);
        addCadBtn.setSelected(false);
        editCadBtn.setSelected(false);
        isCad = false;
    }
    public void buildComBoxData()
    {
        try
        {
            data.addAll(catTableManager.getIdNames());
        }
        catch(SQLException e)
        {
            displayAlert("ERROR: "+e);
        }
    }
    private void displayAlert(String msg) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Alert.fxml"));
            Parent ERROR = loader.load();
            AlertController controller = (AlertController) loader.getController();

            Scene scene = new Scene(ERROR);
            Stage stage = new Stage();
            stage.setScene(scene);

            stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon.png"));
            controller.setAlertText(msg);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        } catch (IOException ex1) {

        }
    }
    public void updateDelLabels()
    {
        try
        {
            String id = delCombox.getValue().toString();
            String [] array = catTableManager.getRow(id);
            delVendorNameLabel.setText(array[0]);
            delVendorEmailLabel.setText(array[1]);
            delVendorContactLabel.setText(array[2]);
            delVendorWebsiteLabel.setText(array[3]);
            delPriceLabel.setText(array[4]);
            delPayMethodLabel.setText(array[5]);
            delPayTermLabel.setText(array[6]);
            delPayDateLabel.setText(array[7]);
            delCurrLabel.setText(array[8]);
            delNoteLabel.setText(array[9]);
        }
        catch(SQLException e)
        {
            displayAlert("ERROR : "+e);
        }
    }
    public void updateEditLabels()
    {
        try
        {
            String id = editCombox.getValue().toString();
            String [] array = catTableManager.getRow(id);
            editVendorNameLabel.setText(array[0]);
            editVendorEmailLabel.setText(array[1]);
            editVendorContactLabel.setText(array[2]);
            editVendorWebsiteLabel.setText(array[3]);
            editPriceLabel.setText(array[4]);
            editPayMethodLabel.setText(array[5]);
            editPayTermLabel.setText(array[6]);
            editPayDateLabel.setText(array[7]);
            editCurrLabel.setText(array[8]);
            editNoteLabel.setText(array[9]);

            editVendorNameText.setText(array[0].trim());
            editVendorEmailText.setText(array[1].trim());
            editVendorContactText.setText(array[2].trim());
            editVendorWebsiteText.setText(array[3].trim());
            editPriceText.setText(array[4].trim());
            editPayMethodText.setText(array[5].trim());
            editPayTermText.setText(array[6].trim());
            editPurchaseDateText.getEditor().setText(array[7].trim());
            if(array[8].trim().equals("CAD"))
            {
                cadCall();
            }
            else
            {
                usdCall();
            }
            editNoteText.setText(array[9].trim());

        }
        catch(SQLException e)
        {
            displayAlert("Error :" + e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        editCombox.setItems(data);
        delCombox.setItems(data);
    }
}
