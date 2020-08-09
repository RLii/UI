package ultimateInventory;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private Connection conn;
    private NutsTableManager nuts;
    private PipeTableManager pipe;
    private ElbowTableManager elbow;
    private FlangeTableManager flange;
    private HangerTableManager hanger;
    private BoxTableManager box;
    private MufflerTableManager muffler;
    private ResonatorTableManager resonator;
    private CatTableManager cat;


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
            pipe = new PipeTableManager(conn, true);
            elbow = new ElbowTableManager(conn, true);
            flange = new FlangeTableManager(conn, true);
            hanger = new HangerTableManager(conn, true);
            box = new BoxTableManager(conn, true);
            muffler = new MufflerTableManager(conn, true);
            resonator = new ResonatorTableManager(conn, true);
            cat = new CatTableManager(conn, true);
            displayAlert("all reset");
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
            displayAlert("nuts reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetPipes(ActionEvent actionEvent)
    {
        try
        {
            pipe = new PipeTableManager(conn, true);
            displayAlert("pipes reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetElbows(ActionEvent actionEvent)
    {
        try
        {
            elbow = new ElbowTableManager(conn, true);
            displayAlert("elbows reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetFlanges(ActionEvent actionEvent)
    {
        try
        {
            flange = new FlangeTableManager(conn, true);
            displayAlert("flanges reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetHangers(ActionEvent actionEvent)
    {
        try
        {
            hanger = new HangerTableManager(conn, true);
            displayAlert("hangers reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetBoxes(ActionEvent actionEvent)
    {
        try
        {
            box = new BoxTableManager(conn, true);
            displayAlert("boxes reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetMufflers(ActionEvent actionEvent)
    {
        try
        {
            muffler = new MufflerTableManager(conn, true);
            displayAlert("mufflers reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetResonators(ActionEvent actionEvent)
    {
        try
        {
            resonator = new ResonatorTableManager(conn, true);
            displayAlert("resonators reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }
    public void resetCats(ActionEvent actionEvent)
    {
        try
        {
            cat = new CatTableManager(conn, true);
            displayAlert("cats reset");
        }
        catch(SQLException ex)
        {
            displayAlert("ERROR" + ex.getMessage());
        }
    }

    //**********************************************************OPENING_EDITORS*******************************************************************
    public void openNutsEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NutsEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        NutsEditorController nutsEditorController = (NutsEditorController) fxmlLoader.getController();
        nutsEditorController.setModel(new NutsTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Nuts Editor");

        stage.show();
    }
    public void openPipesEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PipeEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        PipeEditorController pipeEditorController = (PipeEditorController) fxmlLoader.getController();
        pipeEditorController.setModel(new PipeTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Pipe Editor");

        stage.show();
    }
    public void openElbowEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ElbowEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        ElbowEditorController elbowEditorController = (ElbowEditorController) fxmlLoader.getController();
        elbowEditorController.setModel(new ElbowTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Elbow Editor");

        stage.show();
    }
    public void openFlangeEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FlangeEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        FlangeEditorController flangeEditorController = (FlangeEditorController) fxmlLoader.getController();
        flangeEditorController.setModel(new FlangeTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Flange Editor");

        stage.show();
    }
    public void openHangerEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HangerEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        HangerEditorController hangerEditorController = (HangerEditorController) fxmlLoader.getController();
        hangerEditorController.setModel(new HangerTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Hanger Editor");

        stage.show();
    }
    public void openBoxEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BoxEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        BoxEditorController boxEditorController = (BoxEditorController) fxmlLoader.getController();
        boxEditorController.setModel(new BoxTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Box Editor");

        stage.show();
    }
    public void openMufflerEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MufflerEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        MufflerEditorController mufflerEditorController = (MufflerEditorController) fxmlLoader.getController();
        mufflerEditorController.setModel(new MufflerTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Muffler Editor");

        stage.show();
    }
    public void openResonatorEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ResonatorEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        ResonatorEditorController resonatorEditorController = (ResonatorEditorController) fxmlLoader.getController();
        resonatorEditorController.setModel(new ResonatorTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Resonator Editor");

        stage.show();
    }
    public void openCatEditor(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CatEditor.fxml"));
        Parent Editor = (Parent) fxmlLoader.load();

        CatEditorController catEditorController = (CatEditorController) fxmlLoader.getController();
        catEditorController.setModel(new CatTableManager(conn,false));

        Scene scene = new Scene(Editor);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("Cat Editor");

        stage.show();
    }
    public void openCostCalculator(ActionEvent actionEvent) throws Exception
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CostCalculator.fxml"));
        Parent costCalc = (Parent) fxmlLoader.load();

        CostCalculatorController costCalculatorController = (CostCalculatorController) fxmlLoader.getController();
        costCalculatorController.setModel(new NutsTableManager(conn, false),
                new PipeTableManager(conn, false),
                new ElbowTableManager(conn, false),
                new FlangeTableManager(conn, false),
                new HangerTableManager(conn, false),
                new BoxTableManager(conn, false),
                new MufflerTableManager(conn, false),
                new ResonatorTableManager(conn, false),
                new CatTableManager(conn, false));

        Scene scene = new Scene(costCalc);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle("CostCalculator");

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


