package ultimateInventory;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
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
    ComboBox nutComBox;
    @FXML
    TextField nutQtyText;

    @FXML
    ComboBox pipeComBox;
    @FXML
    TextField pipeQtyText;

    @FXML
    ComboBox flangeComBox;
    @FXML
    TextField flangeQtyText;

    @FXML
    ComboBox elbowComBox;
    @FXML
    TextField elbowQtyText;

    @FXML
    ComboBox hangerComBox;
    @FXML
    TextField hangerQtyText;

    @FXML
    ComboBox boxComBox;
    @FXML
    TextField boxQtyText;

    @FXML
    ComboBox mufflerComBox;
    @FXML
    TextField mufflerQtyText;

    @FXML
    ComboBox resonatorComBox;
    @FXML
    TextField resonatorQtyText;

    @FXML
    ComboBox catComBox;
    @FXML
    TextField catQtyText;



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

            nutComBox.getSelectionModel().selectFirst();
            pipeComBox.getSelectionModel().selectFirst();
            elbowComBox.getSelectionModel().selectFirst();
            flangeComBox.getSelectionModel().selectFirst();
            hangerComBox.getSelectionModel().selectFirst();
            boxComBox.getSelectionModel().selectFirst();
            mufflerComBox.getSelectionModel().selectFirst();
            resonatorComBox.getSelectionModel().selectFirst();
            catComBox.getSelectionModel().selectFirst();
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

            if(!(nutComBox.getSelectionModel().isEmpty()))
            {
                if(nutsTableManager.isCad(nutComBox.getValue().toString()))
                    cadTotal += nutsTableManager.getPrice(nutComBox.getValue().toString()) * Integer.parseInt(nutQtyText.getText());
                else
                    usdTotal += nutsTableManager.getPrice(nutComBox.getValue().toString()) * Integer.parseInt(nutQtyText.getText());
            }
            if(!(pipeComBox.getSelectionModel().isEmpty()))
            {
                if(pipeTableManager.isCad(pipeComBox.getValue().toString()))
                    cadTotal += pipeTableManager.getPrice(pipeComBox.getValue().toString()) * Integer.parseInt(pipeQtyText.getText());
                else
                    usdTotal += pipeTableManager.getPrice(pipeComBox.getValue().toString()) * Integer.parseInt(pipeQtyText.getText());
            }
            if(!(elbowComBox.getSelectionModel().isEmpty()))
            {
                if(elbowTableManager.isCad(elbowComBox.getValue().toString()))
                    cadTotal += elbowTableManager.getPrice(elbowComBox.getValue().toString()) * Integer.parseInt(elbowQtyText.getText());
                else
                    usdTotal += elbowTableManager.getPrice(elbowComBox.getValue().toString()) * Integer.parseInt(elbowQtyText.getText());
            }
            if(!(flangeComBox.getSelectionModel().isEmpty()))
            {
                if(flangeTableManager.isCad(flangeComBox.getValue().toString()))
                    cadTotal += flangeTableManager.getPrice(flangeComBox.getValue().toString()) * Integer.parseInt(flangeQtyText.getText());
                else
                    usdTotal += flangeTableManager.getPrice(flangeComBox.getValue().toString()) * Integer.parseInt(flangeQtyText.getText());
            }
            if(!(hangerComBox.getSelectionModel().isEmpty()))
            {
                if(hangerTableManager.isCad(hangerComBox.getValue().toString()))
                    cadTotal += hangerTableManager.getPrice(hangerComBox.getValue().toString()) * Integer.parseInt(hangerQtyText.getText());
                else
                    usdTotal += hangerTableManager.getPrice(hangerComBox.getValue().toString()) * Integer.parseInt(hangerQtyText.getText());
            }
            if(!(boxComBox.getSelectionModel().isEmpty()))
            {
                if(boxTableManager.isCad(boxComBox.getValue().toString()))
                    cadTotal += boxTableManager.getPrice(boxComBox.getValue().toString()) * Integer.parseInt(boxQtyText.getText());
                else
                    usdTotal += boxTableManager.getPrice(boxComBox.getValue().toString()) * Integer.parseInt(boxQtyText.getText());
            }
            if(!(mufflerComBox.getSelectionModel().isEmpty()))
            {
                if(mufflerTableManager.isCad(mufflerComBox.getValue().toString()))
                    cadTotal += mufflerTableManager.getPrice(mufflerComBox.getValue().toString()) * Integer.parseInt(mufflerQtyText.getText());
                else
                    usdTotal += mufflerTableManager.getPrice(mufflerComBox.getValue().toString()) * Integer.parseInt(mufflerQtyText.getText());
            }
            if(!(resonatorComBox.getSelectionModel().isEmpty()))
            {
                if(resonatorTableManager.isCad(resonatorComBox.getValue().toString()))
                    cadTotal += resonatorTableManager.getPrice(resonatorComBox.getValue().toString()) * Integer.parseInt(resonatorQtyText.getText());
                else
                    usdTotal += resonatorTableManager.getPrice(resonatorComBox.getValue().toString()) * Integer.parseInt(resonatorQtyText.getText());
            }
            if(!(catComBox.getSelectionModel().isEmpty()))
            {
                if(catTableManager.isCad(catComBox.getValue().toString()))
                    cadTotal += catTableManager.getPrice(catComBox.getValue().toString()) * Integer.parseInt(catQtyText.getText());
                else
                    usdTotal += catTableManager.getPrice(catComBox.getValue().toString()) * Integer.parseInt(catQtyText.getText());
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

        nutComBox.setItems(nutsData);
        pipeComBox.setItems(pipeData);
        elbowComBox.setItems(elbowData);
        flangeComBox.setItems(flangeData);
        hangerComBox.setItems(hangerData);
        boxComBox.setItems(boxData);
        mufflerComBox.setItems(mufflerData);
        resonatorComBox.setItems(resonatorData);
        catComBox.setItems(catData);

        nutQtyText.setText("0");
        pipeQtyText.setText("0");
        elbowQtyText.setText("0");
        flangeQtyText.setText("0");
        hangerQtyText.setText("0");
        boxQtyText.setText("0");
        mufflerQtyText.setText("0");
        resonatorQtyText.setText("0");
        catQtyText.setText("0");


    }
}
