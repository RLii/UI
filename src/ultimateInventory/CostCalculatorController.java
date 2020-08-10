package ultimateInventory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class CostCalculatorController implements Initializable {
    //*****************************TABLE MANAGERS**********************
    NutsTableManager nutsTableManager;
    PipeTableManager pipeTableManager;
    ElbowTableManager elbowTableManager;
    FlangeTableManager flangeTableManager;
    HangerTableManager hangerTableManager;
    BoxTableManager boxTableManager;
    MufflerTableManager mufflerTableManager;
    ResonatorTableManager resonatorTableManager;
    CatTableManager catTableManager;



    //*****************************COMBOX DATA LISTS*******************
    ObservableList<String> nutsData = FXCollections.observableArrayList();
    ObservableList<String> pipeData = FXCollections.observableArrayList();
    ObservableList<String> elbowData = FXCollections.observableArrayList();
    ObservableList<String> flangeData = FXCollections.observableArrayList();
    ObservableList<String> hangerData = FXCollections.observableArrayList();
    ObservableList<String> boxData = FXCollections.observableArrayList();
    ObservableList<String> mufflerData = FXCollections.observableArrayList();
    ObservableList<String> resonatorData = FXCollections.observableArrayList();
    ObservableList<String> catData = FXCollections.observableArrayList();


    //*****************************FXML********************************
    @FXML
    ComboBox nutComBox1;
    @FXML
    TextField nutQtyText1;
    @FXML
    Label nutSubtotal1;

    @FXML
    ComboBox pipeComBox1;
    @FXML
    TextField pipeQtyText1;
    @FXML
    Label pipeSubtotal1;

    @FXML
    ComboBox flangeComBox1;
    @FXML
    TextField flangeQtyText1;
    @FXML
    Label flangeSubtotal1;

    @FXML
    ComboBox elbowComBox1;
    @FXML
    TextField elbowQtyText1;
    @FXML
    Label elbowSubtotal1;

    @FXML
    ComboBox hangerComBox1;
    @FXML
    TextField hangerQtyText1;
    @FXML
    Label hangerSubtotal1;

    @FXML
    ComboBox boxComBox1;
    @FXML
    TextField boxQtyText1;
    @FXML
    Label boxSubtotal1;

    @FXML
    ComboBox mufflerComBox1;
    @FXML
    TextField mufflerQtyText1;
    @FXML
    Label mufflerSubtotal1;

    @FXML
    ComboBox resonatorComBox1;
    @FXML
    TextField resonatorQtyText1;
    @FXML
    Label resonatorSubtotal1;

    @FXML
    ComboBox catComBox1;
    @FXML
    TextField catQtyText1;
    @FXML
    Label catSubtotal1;



    @FXML
    Label CADTotalLabel;
    @FXML
    Label USDTotalLabel;


    public void setModel(NutsTableManager nut, PipeTableManager pipe, ElbowTableManager elbow, FlangeTableManager flange, HangerTableManager hanger, BoxTableManager box, MufflerTableManager muffler, ResonatorTableManager resonator, CatTableManager cat)
    {
        nutsTableManager = nut;
        pipeTableManager = pipe;
        elbowTableManager = elbow;
        flangeTableManager = flange;
        hangerTableManager = hanger;
        boxTableManager = box;
        mufflerTableManager = muffler;
        resonatorTableManager = resonator;
        catTableManager = cat;

        buildComBoxData();
    }
    public void buildComBoxData()
    {
        try
        {
            nutsData.addAll(nutsTableManager.getIdNames());
            pipeData.addAll(pipeTableManager.getIdNames());
            elbowData.addAll(elbowTableManager.getIdNames());
            flangeData.addAll(flangeTableManager.getIdNames());
            hangerData.addAll(hangerTableManager.getIdNames());
            boxData.addAll(boxTableManager.getIdNames());
            mufflerData.addAll(mufflerTableManager.getIdNames());
            resonatorData.addAll(resonatorTableManager.getIdNames());
            catData.addAll(catTableManager.getIdNames());

            nutComBox1.getSelectionModel().selectFirst();
            pipeComBox1.getSelectionModel().selectFirst();
            elbowComBox1.getSelectionModel().selectFirst();
            flangeComBox1.getSelectionModel().selectFirst();
            hangerComBox1.getSelectionModel().selectFirst();
            boxComBox1.getSelectionModel().selectFirst();
            mufflerComBox1.getSelectionModel().selectFirst();
            resonatorComBox1.getSelectionModel().selectFirst();
            catComBox1.getSelectionModel().selectFirst();
        }
        catch(SQLException e)
        {
            displayAlert("Error: " + e);
        }
    }
    public void calculateTotals()
    {
        try
        {
            int cadTotal = 0;
            int usdTotal = 0;

            if(!(nutComBox1.getSelectionModel().isEmpty()))
            {
                if(nutsTableManager.isCad(nutComBox1.getValue().toString()))
                    cadTotal += nutsTableManager.getPrice(nutComBox1.getValue().toString()) * Integer.parseInt(nutQtyText1.getText());
                else
                    usdTotal += nutsTableManager.getPrice(nutComBox1.getValue().toString()) * Integer.parseInt(nutQtyText1.getText());
            }
            if(!(pipeComBox1.getSelectionModel().isEmpty()))
            {
                if(pipeTableManager.isCad(pipeComBox1.getValue().toString()))
                    cadTotal += pipeTableManager.getPrice(pipeComBox1.getValue().toString()) * Integer.parseInt(pipeQtyText1.getText());
                else
                    usdTotal += pipeTableManager.getPrice(pipeComBox1.getValue().toString()) * Integer.parseInt(pipeQtyText1.getText());
            }
            if(!(elbowComBox1.getSelectionModel().isEmpty()))
            {
                if(elbowTableManager.isCad(elbowComBox1.getValue().toString()))
                    cadTotal += elbowTableManager.getPrice(elbowComBox1.getValue().toString()) * Integer.parseInt(elbowQtyText1.getText());
                else
                    usdTotal += elbowTableManager.getPrice(elbowComBox1.getValue().toString()) * Integer.parseInt(elbowQtyText1.getText());
            }
            if(!(flangeComBox1.getSelectionModel().isEmpty()))
            {
                if(flangeTableManager.isCad(flangeComBox1.getValue().toString()))
                    cadTotal += flangeTableManager.getPrice(flangeComBox1.getValue().toString()) * Integer.parseInt(flangeQtyText1.getText());
                else
                    usdTotal += flangeTableManager.getPrice(flangeComBox1.getValue().toString()) * Integer.parseInt(flangeQtyText1.getText());
            }
            if(!(hangerComBox1.getSelectionModel().isEmpty()))
            {
                if(hangerTableManager.isCad(hangerComBox1.getValue().toString()))
                    cadTotal += hangerTableManager.getPrice(hangerComBox1.getValue().toString()) * Integer.parseInt(hangerQtyText1.getText());
                else
                    usdTotal += hangerTableManager.getPrice(hangerComBox1.getValue().toString()) * Integer.parseInt(hangerQtyText1.getText());
            }
            if(!(boxComBox1.getSelectionModel().isEmpty()))
            {
                if(boxTableManager.isCad(boxComBox1.getValue().toString()))
                    cadTotal += boxTableManager.getPrice(boxComBox1.getValue().toString()) * Integer.parseInt(boxQtyText1.getText());
                else
                    usdTotal += boxTableManager.getPrice(boxComBox1.getValue().toString()) * Integer.parseInt(boxQtyText1.getText());
            }
            if(!(mufflerComBox1.getSelectionModel().isEmpty()))
            {
                if(mufflerTableManager.isCad(mufflerComBox1.getValue().toString()))
                    cadTotal += mufflerTableManager.getPrice(mufflerComBox1.getValue().toString()) * Integer.parseInt(mufflerQtyText1.getText());
                else
                    usdTotal += mufflerTableManager.getPrice(mufflerComBox1.getValue().toString()) * Integer.parseInt(mufflerQtyText1.getText());
            }
            if(!(resonatorComBox1.getSelectionModel().isEmpty()))
            {
                if(resonatorTableManager.isCad(resonatorComBox1.getValue().toString()))
                    cadTotal += resonatorTableManager.getPrice(resonatorComBox1.getValue().toString()) * Integer.parseInt(resonatorQtyText1.getText());
                else
                    usdTotal += resonatorTableManager.getPrice(resonatorComBox1.getValue().toString()) * Integer.parseInt(resonatorQtyText1.getText());
            }
            if(!(catComBox1.getSelectionModel().isEmpty()))
            {
                if(catTableManager.isCad(catComBox1.getValue().toString()))
                    cadTotal += catTableManager.getPrice(catComBox1.getValue().toString()) * Integer.parseInt(catQtyText1.getText());
                else
                    usdTotal += catTableManager.getPrice(catComBox1.getValue().toString()) * Integer.parseInt(catQtyText1.getText());
            }


            CADTotalLabel.setText(Integer.toString(cadTotal));
            USDTotalLabel.setText(Integer.toString(usdTotal));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: "+ e);
            }
            else
            {
                displayAlert("Please Fill out the fields Correctly");
            }
        }

    }
    /*****************************************************************************************************************
     ************************************************Info Buttons*****************************************************
     *****************************************************************************************************************/
    public void openNutInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = nutComBox1.getValue().toString();
            String [] array = nutsTableManager.getRow(comValue);
            openInfoSheet("Nut", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("Error!!!");
            }


        }
    }
    public void openPipeInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = pipeComBox1.getValue().toString();
            String [] array = pipeTableManager.getRow(comValue);
            openInfoSheet("Pipe", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("Error!!!");
            }


        }
    }
    public void openElbowInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = elbowComBox1.getValue().toString();
            String [] array = elbowTableManager.getRow(comValue);
            openInfoSheet("Elbow", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("Error!!!");
            }


        }
    }
    public void openFlangeInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = flangeComBox1.getValue().toString();
            String [] array = flangeTableManager.getRow(comValue);
            openInfoSheet("Flange", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("Error!!!");
            }


        }
    }
    public void openHangerInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = hangerComBox1.getValue().toString();
            String [] array = hangerTableManager.getRow(comValue);
            openInfoSheet("Hanger", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("Error!!!");
            }


        }
    }
    public void openBoxInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = boxComBox1.getValue().toString();
            String [] array = boxTableManager.getRow(comValue);
            openInfoSheet("Box", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("Error!!!");
            }


        }
    }
    public void openMufflerInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = mufflerComBox1.getValue().toString();
            String [] array = mufflerTableManager.getRow(comValue);
            openInfoSheet("Muffler", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("Error!!!");
            }


        }
    }
    public void openResonatorInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = resonatorComBox1.getValue().toString();
            String [] array = resonatorTableManager.getRow(comValue);
            openInfoSheet("Resonator", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("No Selected Value");
            }


        }
    }
    public void openCatInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = catComBox1.getValue().toString();
            String [] array = catTableManager.getRow(comValue);
            openInfoSheet("Cat", comValue, array);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: " +e);
            }
            else
            {
                displayAlert("Error!!!");
            }


        }
    }
    /******************************************************************************************************************/
    private void openInfoSheet(String title, String id, String [] array)throws Exception
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InfoSheet.fxml"));
        Parent info = (Parent) fxmlLoader.load();

        InfoSheetController infoSheetController = (InfoSheetController) fxmlLoader.getController();
        infoSheetController.setData(title, id, array);

        Scene scene = new Scene(info);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/ultimateInventory/ultimateIcon"));
        stage.setTitle(title + "Info");

        stage.show();
    }
    /*****************************************************************************************************************
     ************************************************Subtotal Updates*****************************************************
     *****************************************************************************************************************/
    public void CalculateNutSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            nutSubtotal1.setText(df.format(nutsTableManager.getPrice(nutComBox1.getValue().toString())*Double.parseDouble(nutQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
        }
    }
    public void CalculatePipeSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            pipeSubtotal1.setText(df.format(pipeTableManager.getPrice(pipeComBox1.getValue().toString())*Double.parseDouble(pipeQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
        }
    }
    public void CalculateElbowSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            elbowSubtotal1.setText(df.format(elbowTableManager.getPrice(elbowComBox1.getValue().toString())*Double.parseDouble(elbowQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
        }
    }
    public void CalculateFlangeSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            flangeSubtotal1.setText(df.format(flangeTableManager.getPrice(flangeComBox1.getValue().toString())*Double.parseDouble(flangeQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
        }
    }
    public void CalculateHangerSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            hangerSubtotal1.setText(df.format(hangerTableManager.getPrice(hangerComBox1.getValue().toString())*Double.parseDouble(hangerQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
        }
    }
    public void CalculateBoxSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            boxSubtotal1.setText(df.format(boxTableManager.getPrice(boxComBox1.getValue().toString())*Double.parseDouble(boxQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
        }
    }
    public void CalculateMufflerSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            mufflerSubtotal1.setText(df.format(mufflerTableManager.getPrice(mufflerComBox1.getValue().toString())*Double.parseDouble(mufflerQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
        }
    }
    public void CalculateResonatorSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            resonatorSubtotal1.setText(df.format(resonatorTableManager.getPrice(resonatorComBox1.getValue().toString())*Double.parseDouble(resonatorQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
        }
    }
    public void CalculateCatSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            DecimalFormat df = new DecimalFormat("#####.##");
            catSubtotal1.setText(df.format(catTableManager.getPrice(catComBox1.getValue().toString())*Double.parseDouble(catQtyText1.getText())));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {
                displayAlert("Please fill out the forms correctly");
            }
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

            stage.getIcons().add(new Image("file:src/TennisBallGames/WesternLogo.png"));
            controller.setAlertText(msg);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        } catch (IOException ex1) {

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        nutComBox1.setItems(nutsData);
        pipeComBox1.setItems(pipeData);
        elbowComBox1.setItems(elbowData);
        flangeComBox1.setItems(flangeData);
        hangerComBox1.setItems(hangerData);
        boxComBox1.setItems(boxData);
        mufflerComBox1.setItems(mufflerData);
        resonatorComBox1.setItems(resonatorData);
        catComBox1.setItems(catData);

        nutQtyText1.setText("0");
        pipeQtyText1.setText("0");
        elbowQtyText1.setText("0");
        flangeQtyText1.setText("0");
        hangerQtyText1.setText("0");
        boxQtyText1.setText("0");
        mufflerQtyText1.setText("0");
        resonatorQtyText1.setText("0");
        catQtyText1.setText("0");


    }
}
