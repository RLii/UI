package ultimateInventory;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class NutsEditorController {

    private NutsTableManager nutsTableManager;


    @FXML
    Button saveBtn;

    @FXML
    TextField addPriceText;
    @FXML
    TextField addIdText;

    public void setModel(NutsTableManager nut)
    {
        nutsTableManager = nut;
    }

    public void newNut(ActionEvent actionEvent) {
        try
        {
            nutsTableManager.addNewNut();
        }
        catch(Exception e)
        {
            displayAlert("Error!");
        }
    }
    public void editNut()
    {
        try
        {
            nutsTableManager.editNut();
        }
        catch(Exception e)
        {
            displayAlert("Error!");
        }
    }
    public void deleteNut()
    {
        try
        {
            nutsTableManager.deleteNut();
        }
        catch(Exception e)
        {
            displayAlert("Error!");
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
}
