package ultimateInventory;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.apache.derby.impl.sql.catalog.SYSTRIGGERSRowFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private Connection conn;
    private NutsTableManager nuts;


    public void initialize(URL url, ResourceBundle rb) {

        try {
            // Create a named constant for the URL
            // NOTE: This value is specific for Java DB
            String DB_URL = "jdbc:derby:UltimateDB";
            // Create a connection to the database
            conn = DriverManager.getConnection(DB_URL);

        } catch (SQLException ex) {
            displayAlert(ex.getMessage());
        }

    }
    public void resetDB(ActionEvent actionEvent) {
        try
        {
            nuts = new NutsTableManager(conn, true);
            displayAlert("reset nuts");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetNuts(ActionEvent actionEvent)
    {
        try
        {
            nuts = new NutsTableManager(conn, true);
            displayAlert("reset nuts");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }

    public void openNutsEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NutsEditor.fxml"));
        Parent matchesList = (Parent) fxmlLoader.load();

        NutsEditorController nutsEditorController = (NutsEditorController) fxmlLoader.getController();
        nutsEditorController.setModel(new NutsTableManager(conn,false));

        Scene scene = new Scene(matchesList);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Nuts Editor");

        stage.show();
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


