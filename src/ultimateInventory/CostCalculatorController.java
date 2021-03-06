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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.ResourceBundle;

public class CostCalculatorController implements Initializable {
    //*****************************TABLE MANAGERS**********************
    NutsTableManager nutsTableManager;
    PipeTableManager pipeTableManager;
    ElbowTableManager elbowTableManager;
    FlangeTableManager flangeTableManager;
    HangerTableManager hangerTableManager;
    MufflerTableManager mufflerTableManager;
    ResonatorTableManager resonatorTableManager;
    CatTableManager catTableManager;
    FlexPipeTableManager flexPipeTableManager;
    BoltTableManager boltTableManager;
    WasherTableManager washerTableManager;
    RubberTableManager rubberTableManager;
    TipTableManager tipTableManager;
    ClampTableManager clampTableManager;
    KitTableManager kitTableManager;





    //*****************************FXML********************************
    @FXML
    ComboBox nutComBox1;
    @FXML
    TextField nutQtyText1;
    @FXML
    Label nutSubtotal1;

    @FXML
    ComboBox nutComBox2;
    @FXML
    TextField nutQtyText2;
    @FXML
    Label nutSubtotal2;

    @FXML
    ComboBox nutComBox3;
    @FXML
    TextField nutQtyText3;
    @FXML
    Label nutSubtotal3;

    @FXML
    ComboBox nutComBox4;
    @FXML
    TextField nutQtyText4;
    @FXML
    Label nutSubtotal4;

    @FXML
    ComboBox pipeComBox1;
    @FXML
    TextField pipeQtyText1;
    @FXML
    Label pipeSubtotal1;

    @FXML
    ComboBox pipeComBox2;
    @FXML
    TextField pipeQtyText2;
    @FXML
    Label pipeSubtotal2;

    @FXML
    ComboBox pipeComBox3;
    @FXML
    TextField pipeQtyText3;
    @FXML
    Label pipeSubtotal3;

    @FXML
    ComboBox pipeComBox4;
    @FXML
    TextField pipeQtyText4;
    @FXML
    Label pipeSubtotal4;

    @FXML
    ComboBox flangeComBox1;
    @FXML
    TextField flangeQtyText1;
    @FXML
    Label flangeSubtotal1;

    @FXML
    ComboBox flangeComBox2;
    @FXML
    TextField flangeQtyText2;
    @FXML
    Label flangeSubtotal2;

    @FXML
    ComboBox flangeComBox3;
    @FXML
    TextField flangeQtyText3;
    @FXML
    Label flangeSubtotal3;

    @FXML
    ComboBox flangeComBox4;
    @FXML
    TextField flangeQtyText4;
    @FXML
    Label flangeSubtotal4;

    @FXML
    ComboBox elbowComBox1;
    @FXML
    TextField elbowQtyText1;
    @FXML
    Label elbowSubtotal1;

    @FXML
    ComboBox elbowComBox2;
    @FXML
    TextField elbowQtyText2;
    @FXML
    Label elbowSubtotal2;

    @FXML
    ComboBox elbowComBox3;
    @FXML
    TextField elbowQtyText3;
    @FXML
    Label elbowSubtotal3;

    @FXML
    ComboBox elbowComBox4;
    @FXML
    TextField elbowQtyText4;
    @FXML
    Label elbowSubtotal4;

    @FXML
    ComboBox hangerComBox1;
    @FXML
    TextField hangerQtyText1;
    @FXML
    Label hangerSubtotal1;

    @FXML
    ComboBox hangerComBox2;
    @FXML
    TextField hangerQtyText2;
    @FXML
    Label hangerSubtotal2;

    @FXML
    ComboBox hangerComBox3;
    @FXML
    TextField hangerQtyText3;
    @FXML
    Label hangerSubtotal3;

    @FXML
    ComboBox hangerComBox4;
    @FXML
    TextField hangerQtyText4;
    @FXML
    Label hangerSubtotal4;


    @FXML
    ComboBox mufflerComBox1;
    @FXML
    TextField mufflerQtyText1;
    @FXML
    Label mufflerSubtotal1;

    @FXML
    ComboBox mufflerComBox2;
    @FXML
    TextField mufflerQtyText2;
    @FXML
    Label mufflerSubtotal2;

    @FXML
    ComboBox mufflerComBox3;
    @FXML
    TextField mufflerQtyText3;
    @FXML
    Label mufflerSubtotal3;

    @FXML
    ComboBox mufflerComBox4;
    @FXML
    TextField mufflerQtyText4;
    @FXML
    Label mufflerSubtotal4;


    @FXML
    ComboBox resonatorComBox1;
    @FXML
    TextField resonatorQtyText1;
    @FXML
    Label resonatorSubtotal1;

    @FXML
    ComboBox resonatorComBox2;
    @FXML
    TextField resonatorQtyText2;
    @FXML
    Label resonatorSubtotal2;

    @FXML
    ComboBox resonatorComBox3;
    @FXML
    TextField resonatorQtyText3;
    @FXML
    Label resonatorSubtotal3;

    @FXML
    ComboBox resonatorComBox4;
    @FXML
    TextField resonatorQtyText4;
    @FXML
    Label resonatorSubtotal4;


    @FXML
    ComboBox catComBox1;
    @FXML
    TextField catQtyText1;
    @FXML
    Label catSubtotal1;

    @FXML
    ComboBox catComBox2;
    @FXML
    TextField catQtyText2;
    @FXML
    Label catSubtotal2;

    @FXML
    ComboBox catComBox3;
    @FXML
    TextField catQtyText3;
    @FXML
    Label catSubtotal3;

    @FXML
    ComboBox catComBox4;
    @FXML
    TextField catQtyText4;
    @FXML
    Label catSubtotal4;


    @FXML
    ComboBox flexPipeComBox1;
    @FXML
    TextField flexPipeQtyText1;
    @FXML
    Label flexPipeSubtotal1;

    @FXML
    ComboBox flexPipeComBox2;
    @FXML
    TextField flexPipeQtyText2;
    @FXML
    Label flexPipeSubtotal2;

    @FXML
    ComboBox flexPipeComBox3;
    @FXML
    TextField flexPipeQtyText3;
    @FXML
    Label flexPipeSubtotal3;

    @FXML
    ComboBox flexPipeComBox4;
    @FXML
    TextField flexPipeQtyText4;
    @FXML
    Label flexPipeSubtotal4;


    @FXML
    ComboBox boltComBox1;
    @FXML
    TextField boltQtyText1;
    @FXML
    Label boltSubtotal1;

    @FXML
    ComboBox boltComBox2;
    @FXML
    TextField boltQtyText2;
    @FXML
    Label boltSubtotal2;

    @FXML
    ComboBox boltComBox3;
    @FXML
    TextField boltQtyText3;
    @FXML
    Label boltSubtotal3;

    @FXML
    ComboBox boltComBox4;
    @FXML
    TextField boltQtyText4;
    @FXML
    Label boltSubtotal4;


    @FXML
    ComboBox washerComBox1;
    @FXML
    TextField washerQtyText1;
    @FXML
    Label washerSubtotal1;

    @FXML
    ComboBox washerComBox2;
    @FXML
    TextField washerQtyText2;
    @FXML
    Label washerSubtotal2;

    @FXML
    ComboBox washerComBox3;
    @FXML
    TextField washerQtyText3;
    @FXML
    Label washerSubtotal3;

    @FXML
    ComboBox washerComBox4;
    @FXML
    TextField washerQtyText4;
    @FXML
    Label washerSubtotal4;


    @FXML
    ComboBox rubberComBox1;
    @FXML
    TextField rubberQtyText1;
    @FXML
    Label rubberSubtotal1;

    @FXML
    ComboBox rubberComBox2;
    @FXML
    TextField rubberQtyText2;
    @FXML
    Label rubberSubtotal2;

    @FXML
    ComboBox rubberComBox3;
    @FXML
    TextField rubberQtyText3;
    @FXML
    Label rubberSubtotal3;

    @FXML
    ComboBox rubberComBox4;
    @FXML
    TextField rubberQtyText4;
    @FXML
    Label rubberSubtotal4;


    @FXML
    ComboBox tipComBox1;
    @FXML
    TextField tipQtyText1;
    @FXML
    Label tipSubtotal1;

    @FXML
    ComboBox tipComBox2;
    @FXML
    TextField tipQtyText2;
    @FXML
    Label tipSubtotal2;

    @FXML
    ComboBox tipComBox3;
    @FXML
    TextField tipQtyText3;
    @FXML
    Label tipSubtotal3;

    @FXML
    ComboBox tipComBox4;
    @FXML
    TextField tipQtyText4;
    @FXML
    Label tipSubtotal4;


    @FXML
    ComboBox clampComBox1;
    @FXML
    TextField clampQtyText1;
    @FXML
    Label clampSubtotal1;

    @FXML
    ComboBox clampComBox2;
    @FXML
    TextField clampQtyText2;
    @FXML
    Label clampSubtotal2;

    @FXML
    ComboBox clampComBox3;
    @FXML
    TextField clampQtyText3;
    @FXML
    Label clampSubtotal3;

    @FXML
    ComboBox clampComBox4;
    @FXML
    TextField clampQtyText4;
    @FXML
    Label clampSubtotal4;



    @FXML
    TextField miscPriceText1;
    @FXML
    TextField miscPartText1;
    @FXML
    RadioButton miscRadBtnCAD1;
    @FXML
    RadioButton miscRadBtnUSD1;

    @FXML
    TextField miscPriceText2;
    @FXML
    TextField miscPartText2;
    @FXML
    RadioButton miscRadBtnCAD2;
    @FXML
    RadioButton miscRadBtnUSD2;

    @FXML
    TextField miscPriceText3;
    @FXML
    TextField miscPartText3;
    @FXML
    RadioButton miscRadBtnCAD3;
    @FXML
    RadioButton miscRadBtnUSD3;

    @FXML
    TextField miscPriceText4;
    @FXML
    TextField miscPartText4;
    @FXML
    RadioButton miscRadBtnCAD4;
    @FXML
    RadioButton miscRadBtnUSD4;

    /*
    @FXML
    ComboBox miscPartComBox1;
    @FXML
    ComboBox miscIdComBox1;
    @FXML
    TextField miscQtyText1;
    @FXML
    Label miscSubtotal1;

    @FXML
    ComboBox miscPartComBox2;
    @FXML
    ComboBox miscIdComBox2;
    @FXML
    TextField miscQtyText2;
    @FXML
    Label miscSubtotal2;

    @FXML
    ComboBox miscPartComBox3;
    @FXML
    ComboBox miscIdComBox3;
    @FXML
    TextField miscQtyText3;
    @FXML
    Label miscSubtotal3;

    @FXML
    ComboBox miscPartComBox4;
    @FXML
    ComboBox miscIdComBox4;
    @FXML
    TextField miscQtyText4;
    @FXML
    Label miscSubtotal4;
    */

    @FXML
    TextField labourCostTextCAD;
    @FXML
    TextField labourCostTextUSD;



    @FXML
    Label CADTotalLabel;
    @FXML
    Label USDTotalLabel;


    @FXML
    ComboBox kitIDComBox;
    @FXML
    TextField kitNameText;
    boolean hasBuilt = false;


    public void setModel(NutsTableManager nut, PipeTableManager pipe, ElbowTableManager elbow, FlangeTableManager flange, HangerTableManager hanger, MufflerTableManager muffler, ResonatorTableManager resonator, CatTableManager cat, FlexPipeTableManager flexpipe, BoltTableManager bolt, WasherTableManager washer, RubberTableManager rubber, TipTableManager tip, ClampTableManager clamp, KitTableManager kit)
    {
        nutsTableManager = nut;
        pipeTableManager = pipe;
        elbowTableManager = elbow;
        flangeTableManager = flange;
        hangerTableManager = hanger;
        mufflerTableManager = muffler;
        resonatorTableManager = resonator;
        catTableManager = cat;
        flexPipeTableManager = flexpipe;
        boltTableManager = bolt;
        washerTableManager = washer;
        rubberTableManager = rubber;
        tipTableManager = tip;
        clampTableManager = clamp;
        kitTableManager = kit;

        buildComBoxData();
    }
    public void buildComBoxData()
    {
        try
        {
            ObservableList<String> nutsData = FXCollections.observableArrayList();
            ObservableList<String> pipeData = FXCollections.observableArrayList();
            ObservableList<String> elbowData = FXCollections.observableArrayList();
            ObservableList<String> flangeData = FXCollections.observableArrayList();
            ObservableList<String> hangerData = FXCollections.observableArrayList();
            ObservableList<String> mufflerData = FXCollections.observableArrayList();
            ObservableList<String> resonatorData = FXCollections.observableArrayList();
            ObservableList<String> catData = FXCollections.observableArrayList();
            ObservableList<String> flexPipeData = FXCollections.observableArrayList();
            ObservableList<String> boltData = FXCollections.observableArrayList();
            ObservableList<String> washerData = FXCollections.observableArrayList();
            ObservableList<String> rubberData = FXCollections.observableArrayList();
            ObservableList<String> tipData = FXCollections.observableArrayList();
            ObservableList<String> clampData = FXCollections.observableArrayList();
            ObservableList<String> kitData = FXCollections.observableArrayList();

            nutsData.addAll(nutsTableManager.getIdNames());
            pipeData.addAll(pipeTableManager.getIdNames());
            elbowData.addAll(elbowTableManager.getIdNames());
            flangeData.addAll(flangeTableManager.getIdNames());
            hangerData.addAll(hangerTableManager.getIdNames());
            mufflerData.addAll(mufflerTableManager.getIdNames());
            resonatorData.addAll(resonatorTableManager.getIdNames());
            catData.addAll(catTableManager.getIdNames());
            flexPipeData.addAll(flexPipeTableManager.getIdNames());
            boltData.addAll(boltTableManager.getIdNames());
            washerData.addAll(washerTableManager.getIdNames());
            rubberData.addAll(rubberTableManager.getIdNames());
            tipData.addAll(tipTableManager.getIdNames());
            clampData.addAll(clampTableManager.getIdNames());
            kitData.addAll(kitTableManager.getKitNames());

            Collections.sort(nutsData);
            Collections.sort(pipeData);
            Collections.sort(elbowData);
            Collections.sort(flangeData);
            Collections.sort(hangerData);
            Collections.sort(mufflerData);
            Collections.sort(resonatorData);
            Collections.sort(catData);
            Collections.sort(flexPipeData);
            Collections.sort(boltData);
            Collections.sort(washerData);
            Collections.sort(rubberData);
            Collections.sort(tipData);
            Collections.sort(clampData);
            Collections.sort(kitData);

            nutComBox1.setItems(nutsData);
            pipeComBox1.setItems(pipeData);
            elbowComBox1.setItems(elbowData);
            flangeComBox1.setItems(flangeData);
            hangerComBox1.setItems(hangerData);
            mufflerComBox1.setItems(mufflerData);
            resonatorComBox1.setItems(resonatorData);
            catComBox1.setItems(catData);
            flexPipeComBox1.setItems(flexPipeData);
            boltComBox1.setItems(boltData);
            washerComBox1.setItems(washerData);
            rubberComBox1.setItems(rubberData);
            tipComBox1.setItems(tipData);
            clampComBox1.setItems(clampData);

            nutComBox2.setItems(nutsData);
            pipeComBox2.setItems(pipeData);
            elbowComBox2.setItems(elbowData);
            flangeComBox2.setItems(flangeData);
            hangerComBox2.setItems(hangerData);
            mufflerComBox2.setItems(mufflerData);
            resonatorComBox2.setItems(resonatorData);
            catComBox2.setItems(catData);
            flexPipeComBox2.setItems(flexPipeData);
            boltComBox2.setItems(boltData);
            washerComBox2.setItems(washerData);
            rubberComBox2.setItems(rubberData);
            tipComBox2.setItems(tipData);
            clampComBox2.setItems(clampData);

            nutComBox3.setItems(nutsData);
            pipeComBox3.setItems(pipeData);
            elbowComBox3.setItems(elbowData);
            flangeComBox3.setItems(flangeData);
            hangerComBox3.setItems(hangerData);
            mufflerComBox3.setItems(mufflerData);
            resonatorComBox3.setItems(resonatorData);
            catComBox3.setItems(catData);
            flexPipeComBox3.setItems(flexPipeData);
            boltComBox3.setItems(boltData);
            washerComBox3.setItems(washerData);
            rubberComBox3.setItems(rubberData);
            tipComBox3.setItems(tipData);
            clampComBox3.setItems(clampData);

            nutComBox4.setItems(nutsData);
            pipeComBox4.setItems(pipeData);
            elbowComBox4.setItems(elbowData);
            flangeComBox4.setItems(flangeData);
            hangerComBox4.setItems(hangerData);
            mufflerComBox4.setItems(mufflerData);
            resonatorComBox4.setItems(resonatorData);
            catComBox4.setItems(catData);
            flexPipeComBox4.setItems(flexPipeData);
            boltComBox4.setItems(boltData);
            washerComBox4.setItems(washerData);
            rubberComBox4.setItems(rubberData);
            tipComBox4.setItems(tipData);
            clampComBox4.setItems(clampData);
            kitIDComBox.setItems(kitData);

            if(hasBuilt == false) {
                nutComBox1.getSelectionModel().selectFirst();
                pipeComBox1.getSelectionModel().selectFirst();
                elbowComBox1.getSelectionModel().selectFirst();
                flangeComBox1.getSelectionModel().selectFirst();
                hangerComBox1.getSelectionModel().selectFirst();
                mufflerComBox1.getSelectionModel().selectFirst();
                resonatorComBox1.getSelectionModel().selectFirst();
                catComBox1.getSelectionModel().selectFirst();
                flexPipeComBox1.getSelectionModel().selectFirst();
                boltComBox1.getSelectionModel().selectFirst();
                washerComBox1.getSelectionModel().selectFirst();
                rubberComBox1.getSelectionModel().selectFirst();
                tipComBox1.getSelectionModel().selectFirst();
                clampComBox1.getSelectionModel().selectFirst();

                nutComBox2.getSelectionModel().selectNext();
                pipeComBox2.getSelectionModel().selectNext();
                elbowComBox2.getSelectionModel().selectNext();
                flangeComBox2.getSelectionModel().selectNext();
                hangerComBox2.getSelectionModel().selectNext();
                mufflerComBox2.getSelectionModel().selectNext();
                resonatorComBox2.getSelectionModel().selectNext();
                catComBox2.getSelectionModel().selectNext();
                flexPipeComBox2.getSelectionModel().selectFirst();
                boltComBox2.getSelectionModel().selectFirst();
                washerComBox2.getSelectionModel().selectFirst();
                rubberComBox2.getSelectionModel().selectFirst();
                tipComBox2.getSelectionModel().selectFirst();
                clampComBox2.getSelectionModel().selectFirst();

                nutComBox3.getSelectionModel().selectNext();
                pipeComBox3.getSelectionModel().selectNext();
                elbowComBox3.getSelectionModel().selectNext();
                flangeComBox3.getSelectionModel().selectNext();
                hangerComBox3.getSelectionModel().selectNext();
                mufflerComBox3.getSelectionModel().selectNext();
                resonatorComBox3.getSelectionModel().selectNext();
                catComBox3.getSelectionModel().selectNext();
                flexPipeComBox3.getSelectionModel().selectFirst();
                boltComBox3.getSelectionModel().selectFirst();
                washerComBox3.getSelectionModel().selectFirst();
                rubberComBox3.getSelectionModel().selectFirst();
                tipComBox3.getSelectionModel().selectFirst();
                clampComBox3.getSelectionModel().selectFirst();

                nutComBox4.getSelectionModel().selectNext();
                pipeComBox4.getSelectionModel().selectNext();
                elbowComBox4.getSelectionModel().selectNext();
                flangeComBox4.getSelectionModel().selectNext();
                hangerComBox4.getSelectionModel().selectNext();
                mufflerComBox4.getSelectionModel().selectNext();
                resonatorComBox4.getSelectionModel().selectNext();
                catComBox4.getSelectionModel().selectNext();
                flexPipeComBox4.getSelectionModel().selectFirst();
                boltComBox4.getSelectionModel().selectFirst();
                washerComBox4.getSelectionModel().selectFirst();
                rubberComBox4.getSelectionModel().selectFirst();
                tipComBox4.getSelectionModel().selectFirst();
                clampComBox4.getSelectionModel().selectFirst();

                kitIDComBox.getSelectionModel().selectFirst();

                hasBuilt = true;
            }

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
            double cadTotal = 0;
            double usdTotal = 0;
            calculateSubtotals();

            if(!(nutComBox1.getSelectionModel().isEmpty()))
            {
                if(nutsTableManager.isCad(nutComBox1.getValue().toString()))
                    cadTotal += nutsTableManager.getPrice(nutComBox1.getValue().toString()) * Double.parseDouble(nutQtyText1.getText());
                else
                    usdTotal += nutsTableManager.getPrice(nutComBox1.getValue().toString()) * Double.parseDouble(nutQtyText1.getText());
            }
            if(!(nutComBox2.getSelectionModel().isEmpty()))
            {
                if(nutsTableManager.isCad(nutComBox2.getValue().toString()))
                    cadTotal += nutsTableManager.getPrice(nutComBox2.getValue().toString()) * Double.parseDouble(nutQtyText2.getText());
                else
                    usdTotal += nutsTableManager.getPrice(nutComBox2.getValue().toString()) * Double.parseDouble(nutQtyText2.getText());
            }
            if(!(nutComBox3.getSelectionModel().isEmpty()))
            {
                if(nutsTableManager.isCad(nutComBox3.getValue().toString()))
                    cadTotal += nutsTableManager.getPrice(nutComBox3.getValue().toString()) * Double.parseDouble(nutQtyText3.getText());
                else
                    usdTotal += nutsTableManager.getPrice(nutComBox3.getValue().toString()) * Double.parseDouble(nutQtyText3.getText());
            }
            if(!(nutComBox4.getSelectionModel().isEmpty()))
            {
                if(nutsTableManager.isCad(nutComBox4.getValue().toString()))
                    cadTotal += nutsTableManager.getPrice(nutComBox4.getValue().toString()) * Double.parseDouble(nutQtyText4.getText());
                else
                    usdTotal += nutsTableManager.getPrice(nutComBox4.getValue().toString()) * Double.parseDouble(nutQtyText4.getText());
            }




            if(!(pipeComBox1.getSelectionModel().isEmpty()))
            {
                if(pipeTableManager.isCad(pipeComBox1.getValue().toString()))
                    cadTotal += pipeTableManager.getPrice(pipeComBox1.getValue().toString()) * Double.parseDouble(pipeQtyText1.getText());
                else
                    usdTotal += pipeTableManager.getPrice(pipeComBox1.getValue().toString()) * Double.parseDouble(pipeQtyText1.getText());
            }
            if(!(pipeComBox2.getSelectionModel().isEmpty()))
            {
                if(pipeTableManager.isCad(pipeComBox2.getValue().toString()))
                    cadTotal += pipeTableManager.getPrice(pipeComBox2.getValue().toString()) * Double.parseDouble(pipeQtyText2.getText());
                else
                    usdTotal += pipeTableManager.getPrice(pipeComBox2.getValue().toString()) * Double.parseDouble(pipeQtyText2.getText());
            }
            if(!(pipeComBox3.getSelectionModel().isEmpty()))
            {
                if(pipeTableManager.isCad(pipeComBox3.getValue().toString()))
                    cadTotal += pipeTableManager.getPrice(pipeComBox3.getValue().toString()) * Double.parseDouble(pipeQtyText3.getText());
                else
                    usdTotal += pipeTableManager.getPrice(pipeComBox3.getValue().toString()) * Double.parseDouble(pipeQtyText3.getText());
            }
            if(!(pipeComBox4.getSelectionModel().isEmpty()))
            {
                if(pipeTableManager.isCad(pipeComBox4.getValue().toString()))
                    cadTotal += pipeTableManager.getPrice(pipeComBox4.getValue().toString()) * Double.parseDouble(pipeQtyText4.getText());
                else
                    usdTotal += pipeTableManager.getPrice(pipeComBox4.getValue().toString()) * Double.parseDouble(pipeQtyText4.getText());
            }




            if(!(elbowComBox1.getSelectionModel().isEmpty()))
            {
                if(elbowTableManager.isCad(elbowComBox1.getValue().toString()))
                    cadTotal += elbowTableManager.getPrice(elbowComBox1.getValue().toString()) * Double.parseDouble(elbowQtyText1.getText());
                else
                    usdTotal += elbowTableManager.getPrice(elbowComBox1.getValue().toString()) * Double.parseDouble(elbowQtyText1.getText());
            }
            if(!(elbowComBox2.getSelectionModel().isEmpty()))
            {
                if(elbowTableManager.isCad(elbowComBox2.getValue().toString()))
                    cadTotal += elbowTableManager.getPrice(elbowComBox2.getValue().toString()) * Double.parseDouble(elbowQtyText2.getText());
                else
                    usdTotal += elbowTableManager.getPrice(elbowComBox2.getValue().toString()) * Double.parseDouble(elbowQtyText2.getText());
            }
            if(!(elbowComBox3.getSelectionModel().isEmpty()))
            {
                if(elbowTableManager.isCad(elbowComBox3.getValue().toString()))
                    cadTotal += elbowTableManager.getPrice(elbowComBox3.getValue().toString()) * Double.parseDouble(elbowQtyText3.getText());
                else
                    usdTotal += elbowTableManager.getPrice(elbowComBox3.getValue().toString()) * Double.parseDouble(elbowQtyText3.getText());
            }
            if(!(elbowComBox4.getSelectionModel().isEmpty()))
            {
                if(elbowTableManager.isCad(elbowComBox4.getValue().toString()))
                    cadTotal += elbowTableManager.getPrice(elbowComBox4.getValue().toString()) * Double.parseDouble(elbowQtyText4.getText());
                else
                    usdTotal += elbowTableManager.getPrice(elbowComBox4.getValue().toString()) * Double.parseDouble(elbowQtyText4.getText());
            }




            if(!(flangeComBox1.getSelectionModel().isEmpty()))
            {
                if(flangeTableManager.isCad(flangeComBox1.getValue().toString()))
                    cadTotal += flangeTableManager.getPrice(flangeComBox1.getValue().toString()) * Double.parseDouble(flangeQtyText1.getText());
                else
                    usdTotal += flangeTableManager.getPrice(flangeComBox1.getValue().toString()) * Double.parseDouble(flangeQtyText1.getText());
            }
            if(!(flangeComBox2.getSelectionModel().isEmpty()))
            {
                if(flangeTableManager.isCad(flangeComBox2.getValue().toString()))
                    cadTotal += flangeTableManager.getPrice(flangeComBox2.getValue().toString()) * Double.parseDouble(flangeQtyText2.getText());
                else
                    usdTotal += flangeTableManager.getPrice(flangeComBox2.getValue().toString()) * Double.parseDouble(flangeQtyText2.getText());
            }
            if(!(flangeComBox3.getSelectionModel().isEmpty()))
            {
                if(flangeTableManager.isCad(flangeComBox3.getValue().toString()))
                    cadTotal += flangeTableManager.getPrice(flangeComBox3.getValue().toString()) * Double.parseDouble(flangeQtyText3.getText());
                else
                    usdTotal += flangeTableManager.getPrice(flangeComBox3.getValue().toString()) * Double.parseDouble(flangeQtyText3.getText());
            }
            if(!(flangeComBox4.getSelectionModel().isEmpty()))
            {
                if(flangeTableManager.isCad(flangeComBox4.getValue().toString()))
                    cadTotal += flangeTableManager.getPrice(flangeComBox4.getValue().toString()) * Double.parseDouble(flangeQtyText4.getText());
                else
                    usdTotal += flangeTableManager.getPrice(flangeComBox4.getValue().toString()) * Double.parseDouble(flangeQtyText4.getText());
            }




            if(!(hangerComBox1.getSelectionModel().isEmpty()))
            {
                if(hangerTableManager.isCad(hangerComBox1.getValue().toString()))
                    cadTotal += hangerTableManager.getPrice(hangerComBox1.getValue().toString()) * Double.parseDouble(hangerQtyText1.getText());
                else
                    usdTotal += hangerTableManager.getPrice(hangerComBox1.getValue().toString()) * Double.parseDouble(hangerQtyText1.getText());
            }
            if(!(hangerComBox2.getSelectionModel().isEmpty()))
            {
                if(hangerTableManager.isCad(hangerComBox2.getValue().toString()))
                    cadTotal += hangerTableManager.getPrice(hangerComBox2.getValue().toString()) * Double.parseDouble(hangerQtyText2.getText());
                else
                    usdTotal += hangerTableManager.getPrice(hangerComBox2.getValue().toString()) * Double.parseDouble(hangerQtyText2.getText());
            }
            if(!(hangerComBox3.getSelectionModel().isEmpty()))
            {
                if(hangerTableManager.isCad(hangerComBox3.getValue().toString()))
                    cadTotal += hangerTableManager.getPrice(hangerComBox3.getValue().toString()) * Double.parseDouble(hangerQtyText3.getText());
                else
                    usdTotal += hangerTableManager.getPrice(hangerComBox3.getValue().toString()) * Double.parseDouble(hangerQtyText3.getText());
            }
            if(!(hangerComBox4.getSelectionModel().isEmpty()))
            {
                if(hangerTableManager.isCad(hangerComBox4.getValue().toString()))
                    cadTotal += hangerTableManager.getPrice(hangerComBox4.getValue().toString()) * Double.parseDouble(hangerQtyText4.getText());
                else
                    usdTotal += hangerTableManager.getPrice(hangerComBox4.getValue().toString()) * Double.parseDouble(hangerQtyText4.getText());
            }




            if(!(mufflerComBox1.getSelectionModel().isEmpty()))
            {
                if(mufflerTableManager.isCad(mufflerComBox1.getValue().toString()))
                    cadTotal += mufflerTableManager.getPrice(mufflerComBox1.getValue().toString()) * Double.parseDouble(mufflerQtyText1.getText());
                else
                    usdTotal += mufflerTableManager.getPrice(mufflerComBox1.getValue().toString()) * Double.parseDouble(mufflerQtyText1.getText());
            }
            if(!(mufflerComBox2.getSelectionModel().isEmpty()))
            {
                if(mufflerTableManager.isCad(mufflerComBox2.getValue().toString()))
                    cadTotal += mufflerTableManager.getPrice(mufflerComBox2.getValue().toString()) * Double.parseDouble(mufflerQtyText2.getText());
                else
                    usdTotal += mufflerTableManager.getPrice(mufflerComBox2.getValue().toString()) * Double.parseDouble(mufflerQtyText2.getText());
            }
            if(!(mufflerComBox3.getSelectionModel().isEmpty()))
            {
                if(mufflerTableManager.isCad(mufflerComBox3.getValue().toString()))
                    cadTotal += mufflerTableManager.getPrice(mufflerComBox3.getValue().toString()) * Double.parseDouble(mufflerQtyText3.getText());
                else
                    usdTotal += mufflerTableManager.getPrice(mufflerComBox3.getValue().toString()) * Double.parseDouble(mufflerQtyText3.getText());
            }
            if(!(mufflerComBox4.getSelectionModel().isEmpty()))
            {
                if(mufflerTableManager.isCad(mufflerComBox4.getValue().toString()))
                    cadTotal += mufflerTableManager.getPrice(mufflerComBox4.getValue().toString()) * Double.parseDouble(mufflerQtyText4.getText());
                else
                    usdTotal += mufflerTableManager.getPrice(mufflerComBox4.getValue().toString()) * Double.parseDouble(mufflerQtyText4.getText());
            }




            if(!(resonatorComBox1.getSelectionModel().isEmpty()))
            {
                if(resonatorTableManager.isCad(resonatorComBox1.getValue().toString()))
                    cadTotal += resonatorTableManager.getPrice(resonatorComBox1.getValue().toString()) * Double.parseDouble(resonatorQtyText1.getText());
                else
                    usdTotal += resonatorTableManager.getPrice(resonatorComBox1.getValue().toString()) * Double.parseDouble(resonatorQtyText1.getText());
            }
            if(!(resonatorComBox2.getSelectionModel().isEmpty()))
            {
                if(resonatorTableManager.isCad(resonatorComBox2.getValue().toString()))
                    cadTotal += resonatorTableManager.getPrice(resonatorComBox2.getValue().toString()) * Double.parseDouble(resonatorQtyText2.getText());
                else
                    usdTotal += resonatorTableManager.getPrice(resonatorComBox2.getValue().toString()) * Double.parseDouble(resonatorQtyText2.getText());
            }
            if(!(resonatorComBox3.getSelectionModel().isEmpty()))
            {
                if(resonatorTableManager.isCad(resonatorComBox3.getValue().toString()))
                    cadTotal += resonatorTableManager.getPrice(resonatorComBox3.getValue().toString()) * Double.parseDouble(resonatorQtyText3.getText());
                else
                    usdTotal += resonatorTableManager.getPrice(resonatorComBox3.getValue().toString()) * Double.parseDouble(resonatorQtyText3.getText());
            }
            if(!(resonatorComBox4.getSelectionModel().isEmpty()))
            {
                if(resonatorTableManager.isCad(resonatorComBox4.getValue().toString()))
                    cadTotal += resonatorTableManager.getPrice(resonatorComBox4.getValue().toString()) * Double.parseDouble(resonatorQtyText4.getText());
                else
                    usdTotal += resonatorTableManager.getPrice(resonatorComBox4.getValue().toString()) * Double.parseDouble(resonatorQtyText4.getText());
            }




            if(!(catComBox1.getSelectionModel().isEmpty()))
            {
                if(catTableManager.isCad(catComBox1.getValue().toString()))
                    cadTotal += catTableManager.getPrice(catComBox1.getValue().toString()) * Double.parseDouble(catQtyText1.getText());
                else
                    usdTotal += catTableManager.getPrice(catComBox1.getValue().toString()) * Double.parseDouble(catQtyText1.getText());
            }
            if(!(catComBox2.getSelectionModel().isEmpty()))
            {
                if(catTableManager.isCad(catComBox2.getValue().toString()))
                    cadTotal += catTableManager.getPrice(catComBox2.getValue().toString()) * Double.parseDouble(catQtyText2.getText());
                else
                    usdTotal += catTableManager.getPrice(catComBox2.getValue().toString()) * Double.parseDouble(catQtyText2.getText());
            }
            if(!(catComBox3.getSelectionModel().isEmpty()))
            {
                if(catTableManager.isCad(catComBox3.getValue().toString()))
                    cadTotal += catTableManager.getPrice(catComBox3.getValue().toString()) * Double.parseDouble(catQtyText3.getText());
                else
                    usdTotal += catTableManager.getPrice(catComBox3.getValue().toString()) * Double.parseDouble(catQtyText3.getText());
            }
            if(!(catComBox4.getSelectionModel().isEmpty()))
            {
                if(catTableManager.isCad(catComBox4.getValue().toString()))
                    cadTotal += catTableManager.getPrice(catComBox4.getValue().toString()) * Double.parseDouble(catQtyText4.getText());
                else
                    usdTotal += catTableManager.getPrice(catComBox4.getValue().toString()) * Double.parseDouble(catQtyText4.getText());
            }


            if(!(flexPipeComBox1.getSelectionModel().isEmpty()))
            {
                if(flexPipeTableManager.isCad(flexPipeComBox1.getValue().toString()))
                    cadTotal += flexPipeTableManager.getPrice(flexPipeComBox1.getValue().toString()) * Double.parseDouble(flexPipeQtyText1.getText());
                else
                    usdTotal += flexPipeTableManager.getPrice(flexPipeComBox1.getValue().toString()) * Double.parseDouble(flexPipeQtyText1.getText());
            }
            if(!(flexPipeComBox2.getSelectionModel().isEmpty()))
            {
                if(flexPipeTableManager.isCad(flexPipeComBox2.getValue().toString()))
                    cadTotal += flexPipeTableManager.getPrice(flexPipeComBox2.getValue().toString()) * Double.parseDouble(flexPipeQtyText2.getText());
                else
                    usdTotal += flexPipeTableManager.getPrice(flexPipeComBox2.getValue().toString()) * Double.parseDouble(flexPipeQtyText2.getText());
            }
            if(!(flexPipeComBox3.getSelectionModel().isEmpty()))
            {
                if(flexPipeTableManager.isCad(flexPipeComBox1.getValue().toString()))
                    cadTotal += flexPipeTableManager.getPrice(flexPipeComBox3.getValue().toString()) * Double.parseDouble(flexPipeQtyText3.getText());
                else
                    usdTotal += flexPipeTableManager.getPrice(flexPipeComBox3.getValue().toString()) * Double.parseDouble(flexPipeQtyText3.getText());
            }
            if(!(flexPipeComBox4.getSelectionModel().isEmpty()))
            {
                if(flexPipeTableManager.isCad(flexPipeComBox4.getValue().toString()))
                    cadTotal += flexPipeTableManager.getPrice(flexPipeComBox4.getValue().toString()) * Double.parseDouble(flexPipeQtyText4.getText());
                else
                    usdTotal += flexPipeTableManager.getPrice(flexPipeComBox4.getValue().toString()) * Double.parseDouble(flexPipeQtyText4.getText());
            }



            if(!(boltComBox1.getSelectionModel().isEmpty()))
            {
                if(boltTableManager.isCad(boltComBox1.getValue().toString()))
                    cadTotal += boltTableManager.getPrice(boltComBox1.getValue().toString()) * Double.parseDouble(boltQtyText1.getText());
                else
                    usdTotal += boltTableManager.getPrice(boltComBox1.getValue().toString()) * Double.parseDouble(boltQtyText1.getText());
            }
            if(!(boltComBox2.getSelectionModel().isEmpty()))
            {
                if(boltTableManager.isCad(boltComBox2.getValue().toString()))
                    cadTotal += boltTableManager.getPrice(boltComBox2.getValue().toString()) * Double.parseDouble(boltQtyText2.getText());
                else
                    usdTotal += boltTableManager.getPrice(boltComBox2.getValue().toString()) * Double.parseDouble(boltQtyText2.getText());
            }
            if(!(boltComBox3.getSelectionModel().isEmpty()))
            {
                if(boltTableManager.isCad(boltComBox3.getValue().toString()))
                    cadTotal += boltTableManager.getPrice(boltComBox3.getValue().toString()) * Double.parseDouble(boltQtyText3.getText());
                else
                    usdTotal += boltTableManager.getPrice(boltComBox3.getValue().toString()) * Double.parseDouble(boltQtyText3.getText());
            }
            if(!(boltComBox4.getSelectionModel().isEmpty()))
            {
                if(boltTableManager.isCad(boltComBox4.getValue().toString()))
                    cadTotal += boltTableManager.getPrice(boltComBox4.getValue().toString()) * Double.parseDouble(boltQtyText4.getText());
                else
                    usdTotal += boltTableManager.getPrice(boltComBox4.getValue().toString()) * Double.parseDouble(boltQtyText4.getText());
            }



            if(!(washerComBox1.getSelectionModel().isEmpty()))
            {
                if(washerTableManager.isCad(washerComBox1.getValue().toString()))
                    cadTotal += washerTableManager.getPrice(washerComBox1.getValue().toString()) * Double.parseDouble(washerQtyText1.getText());
                else
                    usdTotal += washerTableManager.getPrice(washerComBox1.getValue().toString()) * Double.parseDouble(washerQtyText1.getText());
            }
            if(!(washerComBox2.getSelectionModel().isEmpty()))
            {
                if(washerTableManager.isCad(washerComBox2.getValue().toString()))
                    cadTotal += washerTableManager.getPrice(washerComBox2.getValue().toString()) * Double.parseDouble(washerQtyText2.getText());
                else
                    usdTotal += washerTableManager.getPrice(washerComBox2.getValue().toString()) * Double.parseDouble(washerQtyText2.getText());
            }
            if(!(washerComBox3.getSelectionModel().isEmpty()))
            {
                if(washerTableManager.isCad(washerComBox3.getValue().toString()))
                    cadTotal += washerTableManager.getPrice(washerComBox3.getValue().toString()) * Double.parseDouble(washerQtyText3.getText());
                else
                    usdTotal += washerTableManager.getPrice(washerComBox3.getValue().toString()) * Double.parseDouble(washerQtyText3.getText());
            }
            if(!(washerComBox4.getSelectionModel().isEmpty()))
            {
                if(washerTableManager.isCad(washerComBox4.getValue().toString()))
                    cadTotal += washerTableManager.getPrice(washerComBox4.getValue().toString()) * Double.parseDouble(washerQtyText4.getText());
                else
                    usdTotal += washerTableManager.getPrice(washerComBox4.getValue().toString()) * Double.parseDouble(washerQtyText4.getText());
            }



            if(!(rubberComBox1.getSelectionModel().isEmpty()))
            {
                if(rubberTableManager.isCad(rubberComBox1.getValue().toString()))
                    cadTotal += rubberTableManager.getPrice(rubberComBox1.getValue().toString()) * Double.parseDouble(rubberQtyText1.getText());
                else
                    usdTotal += rubberTableManager.getPrice(rubberComBox1.getValue().toString()) * Double.parseDouble(rubberQtyText1.getText());
            }
            if(!(rubberComBox2.getSelectionModel().isEmpty()))
            {
                if(rubberTableManager.isCad(rubberComBox2.getValue().toString()))
                    cadTotal += rubberTableManager.getPrice(rubberComBox2.getValue().toString()) * Double.parseDouble(rubberQtyText2.getText());
                else
                    usdTotal += rubberTableManager.getPrice(rubberComBox2.getValue().toString()) * Double.parseDouble(rubberQtyText2.getText());
            }
            if(!(rubberComBox3.getSelectionModel().isEmpty()))
            {
                if(rubberTableManager.isCad(rubberComBox3.getValue().toString()))
                    cadTotal += rubberTableManager.getPrice(rubberComBox3.getValue().toString()) * Double.parseDouble(rubberQtyText3.getText());
                else
                    usdTotal += rubberTableManager.getPrice(rubberComBox3.getValue().toString()) * Double.parseDouble(rubberQtyText3.getText());
            }
            if(!(rubberComBox4.getSelectionModel().isEmpty()))
            {
                if(rubberTableManager.isCad(rubberComBox4.getValue().toString()))
                    cadTotal += rubberTableManager.getPrice(rubberComBox4.getValue().toString()) * Double.parseDouble(rubberQtyText4.getText());
                else
                    usdTotal += rubberTableManager.getPrice(rubberComBox4.getValue().toString()) * Double.parseDouble(rubberQtyText4.getText());
            }



            if(!(tipComBox1.getSelectionModel().isEmpty()))
            {
                if(tipTableManager.isCad(tipComBox1.getValue().toString()))
                    cadTotal += tipTableManager.getPrice(tipComBox1.getValue().toString()) * Double.parseDouble(tipQtyText1.getText());
                else
                    usdTotal += tipTableManager.getPrice(tipComBox1.getValue().toString()) * Double.parseDouble(tipQtyText1.getText());
            }
            if(!(tipComBox2.getSelectionModel().isEmpty()))
            {
                if(tipTableManager.isCad(tipComBox2.getValue().toString()))
                    cadTotal += tipTableManager.getPrice(tipComBox2.getValue().toString()) * Double.parseDouble(tipQtyText2.getText());
                else
                    usdTotal += tipTableManager.getPrice(tipComBox2.getValue().toString()) * Double.parseDouble(tipQtyText2.getText());
            }
            if(!(tipComBox3.getSelectionModel().isEmpty()))
            {
                if(tipTableManager.isCad(tipComBox3.getValue().toString()))
                    cadTotal += tipTableManager.getPrice(tipComBox3.getValue().toString()) * Double.parseDouble(tipQtyText3.getText());
                else
                    usdTotal += tipTableManager.getPrice(tipComBox3.getValue().toString()) * Double.parseDouble(tipQtyText3.getText());
            }
            if(!(tipComBox4.getSelectionModel().isEmpty()))
            {
                if(tipTableManager.isCad(tipComBox4.getValue().toString()))
                    cadTotal += tipTableManager.getPrice(tipComBox4.getValue().toString()) * Double.parseDouble(tipQtyText4.getText());
                else
                    usdTotal += tipTableManager.getPrice(tipComBox4.getValue().toString()) * Double.parseDouble(tipQtyText4.getText());
            }



            if(!(clampComBox1.getSelectionModel().isEmpty()))
            {
                if(clampTableManager.isCad(clampComBox1.getValue().toString()))
                    cadTotal += clampTableManager.getPrice(clampComBox1.getValue().toString()) * Double.parseDouble(clampQtyText1.getText());
                else
                    usdTotal += clampTableManager.getPrice(clampComBox1.getValue().toString()) * Double.parseDouble(clampQtyText1.getText());
            }
            if(!(clampComBox2.getSelectionModel().isEmpty()))
            {
                if(clampTableManager.isCad(clampComBox2.getValue().toString()))
                    cadTotal += clampTableManager.getPrice(clampComBox2.getValue().toString()) * Double.parseDouble(clampQtyText2.getText());
                else
                    usdTotal += clampTableManager.getPrice(clampComBox2.getValue().toString()) * Double.parseDouble(clampQtyText2.getText());
            }
            if(!(clampComBox3.getSelectionModel().isEmpty()))
            {
                if(clampTableManager.isCad(clampComBox3.getValue().toString()))
                    cadTotal += clampTableManager.getPrice(clampComBox3.getValue().toString()) * Double.parseDouble(clampQtyText3.getText());
                else
                    usdTotal += clampTableManager.getPrice(clampComBox3.getValue().toString()) * Double.parseDouble(clampQtyText3.getText());
            }
            if(!(clampComBox4.getSelectionModel().isEmpty()))
            {
                if(clampTableManager.isCad(clampComBox4.getValue().toString()))
                    cadTotal += clampTableManager.getPrice(clampComBox4.getValue().toString()) * Double.parseDouble(clampQtyText4.getText());
                else
                    usdTotal += clampTableManager.getPrice(clampComBox4.getValue().toString()) * Double.parseDouble(clampQtyText4.getText());
            }

            /*
            String temp = miscSubtotal1.getText();
            if(!(temp.equals("")))
            {
                if(temp.substring(temp.length()-3).equals("CAD"))
                {
                    cadTotal += Double.parseDouble(temp.substring(0,temp.length()-5));
                }
                else
                {
                    usdTotal += Double.parseDouble(temp.substring(0,temp.length()-5));
                }
            }
            temp = miscSubtotal2.getText();
            if(!(temp.equals("")))
            {
                if(temp.substring(temp.length()-3).equals("CAD"))
                {
                    cadTotal += Double.parseDouble(temp.substring(0,temp.length()-5));
                }
                else
                {
                    usdTotal += Double.parseDouble(temp.substring(0,temp.length()-5));
                }
            }
            temp = miscSubtotal3.getText();
            if(!(temp.equals("")))
            {
                if(temp.substring(temp.length()-3).equals("CAD"))
                {
                    cadTotal += Double.parseDouble(temp.substring(0,temp.length()-5));
                }
                else
                {
                    usdTotal += Double.parseDouble(temp.substring(0,temp.length()-5));
                }
            }
            temp = miscSubtotal4.getText();
            if(!(temp.equals("")))
            {
                if(temp.substring(temp.length()-3).equals("CAD"))
                {
                    cadTotal += Double.parseDouble(temp.substring(0,temp.length()-5));
                }
                else
                {
                    usdTotal += Double.parseDouble(temp.substring(0,temp.length()-5));
                }
            }
            */

            cadTotal += Double.parseDouble(labourCostTextCAD.getText());
            usdTotal += Double.parseDouble(labourCostTextUSD.getText());

            if(miscRadBtnCAD1.isSelected())
            {
                cadTotal += Double.parseDouble(miscPriceText1.getText());
            }
            else
            {
                usdTotal += Double.parseDouble(miscPriceText1.getText());
            }
            if(miscRadBtnCAD2.isSelected())
            {
                cadTotal += Double.parseDouble(miscPriceText2.getText());
            }
            else
            {
                usdTotal += Double.parseDouble(miscPriceText2.getText());
            }
            if(miscRadBtnCAD3.isSelected())
            {
                cadTotal += Double.parseDouble(miscPriceText3.getText());
            }
            else
            {
                usdTotal += Double.parseDouble(miscPriceText3.getText());
            }
            if(miscRadBtnCAD4.isSelected())
            {
                cadTotal += Double.parseDouble(miscPriceText4.getText());
            }
            else
            {
                usdTotal += Double.parseDouble(miscPriceText4.getText());
            }

            DecimalFormat df = new DecimalFormat("####.##");
            CADTotalLabel.setText(df.format(cadTotal));
            USDTotalLabel.setText(df.format(usdTotal));
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error: "+ e);
            }
            else
            {

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
    public void openNutInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = nutComBox2.getValue().toString();
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
    public void openNutInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = nutComBox3.getValue().toString();
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
    public void openNutInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = nutComBox4.getValue().toString();
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
    public void openPipeInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = pipeComBox2.getValue().toString();
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
    public void openPipeInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = pipeComBox3.getValue().toString();
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
    public void openPipeInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = pipeComBox4.getValue().toString();
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
    public void openElbowInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = elbowComBox2.getValue().toString();
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
    public void openElbowInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = elbowComBox3.getValue().toString();
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
    public void openElbowInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = elbowComBox4.getValue().toString();
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
    public void openFlangeInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = flangeComBox2.getValue().toString();
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
    public void openFlangeInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = flangeComBox3.getValue().toString();
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
    public void openFlangeInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = flangeComBox4.getValue().toString();
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
    public void openHangerInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = hangerComBox2.getValue().toString();
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
    public void openHangerInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = hangerComBox3.getValue().toString();
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
    public void openHangerInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = hangerComBox4.getValue().toString();
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
    public void openMufflerInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = mufflerComBox2.getValue().toString();
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
    public void openMufflerInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = mufflerComBox3.getValue().toString();
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
    public void openMufflerInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = mufflerComBox4.getValue().toString();
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
    public void openResonatorInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = resonatorComBox2.getValue().toString();
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
    public void openResonatorInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = resonatorComBox3.getValue().toString();
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
    public void openResonatorInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = resonatorComBox4.getValue().toString();
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
    public void openCatInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = catComBox2.getValue().toString();
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
    public void openCatInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = catComBox3.getValue().toString();
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
    public void openCatInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = catComBox4.getValue().toString();
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
    public void openFlexPipeInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = flexPipeComBox1.getValue().toString();
            String [] array = flexPipeTableManager.getRow(comValue);
            openInfoSheet("FlexPipe", comValue, array);
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
    public void openFlexPipeInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = flexPipeComBox2.getValue().toString();
            String [] array = flexPipeTableManager.getRow(comValue);
            openInfoSheet("FlexPipe", comValue, array);
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
    public void openFlexPipeInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = flexPipeComBox3.getValue().toString();
            String [] array = flexPipeTableManager.getRow(comValue);
            openInfoSheet("FlexPipe", comValue, array);
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
    public void openFlexPipeInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = flexPipeComBox4.getValue().toString();
            String [] array = flexPipeTableManager.getRow(comValue);
            openInfoSheet("FlexPipe", comValue, array);
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
    public void openBoltInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = boltComBox1.getValue().toString();
            String [] array = boltTableManager.getRow(comValue);
            openInfoSheet("Bolt", comValue, array);
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
    public void openBoltInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = boltComBox2.getValue().toString();
            String [] array = boltTableManager.getRow(comValue);
            openInfoSheet("Bolt", comValue, array);
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
    public void openBoltInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = boltComBox3.getValue().toString();
            String [] array = boltTableManager.getRow(comValue);
            openInfoSheet("Bolt", comValue, array);
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
    public void openBoltInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = boltComBox4.getValue().toString();
            String [] array = boltTableManager.getRow(comValue);
            openInfoSheet("Bolt", comValue, array);
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
    public void openWasherInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = washerComBox1.getValue().toString();
            String [] array = washerTableManager.getRow(comValue);
            openInfoSheet("Washer", comValue, array);
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
    public void openWasherInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = washerComBox2.getValue().toString();
            String [] array = washerTableManager.getRow(comValue);
            openInfoSheet("Washer", comValue, array);
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
    public void openWasherInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = washerComBox3.getValue().toString();
            String [] array = washerTableManager.getRow(comValue);
            openInfoSheet("Washer", comValue, array);
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
    public void openWasherInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = washerComBox4.getValue().toString();
            String [] array = washerTableManager.getRow(comValue);
            openInfoSheet("Washer", comValue, array);
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
    public void openRubberInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = rubberComBox1.getValue().toString();
            String [] array = rubberTableManager.getRow(comValue);
            openInfoSheet("Rubber", comValue, array);
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
    public void openRubberInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = rubberComBox2.getValue().toString();
            String [] array = rubberTableManager.getRow(comValue);
            openInfoSheet("Rubber", comValue, array);
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
    public void openRubberInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = rubberComBox3.getValue().toString();
            String [] array = rubberTableManager.getRow(comValue);
            openInfoSheet("Rubber", comValue, array);
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
    public void openRubberInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = rubberComBox4.getValue().toString();
            String [] array = rubberTableManager.getRow(comValue);
            openInfoSheet("Rubber", comValue, array);
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
    public void openTipInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = tipComBox1.getValue().toString();
            String [] array = tipTableManager.getRow(comValue);
            openInfoSheet("Tip", comValue, array);
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
    public void openTipInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = tipComBox2.getValue().toString();
            String [] array = tipTableManager.getRow(comValue);
            openInfoSheet("Tip", comValue, array);
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
    public void openTipInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = tipComBox3.getValue().toString();
            String [] array = tipTableManager.getRow(comValue);
            openInfoSheet("Tip", comValue, array);
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
    public void openTipInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = tipComBox4.getValue().toString();
            String [] array = tipTableManager.getRow(comValue);
            openInfoSheet("Tip", comValue, array);
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
    public void openClampInfo1(ActionEvent actionEvent)
    {
        try
        {
            String comValue = clampComBox1.getValue().toString();
            String [] array = clampTableManager.getRow(comValue);
            openInfoSheet("Clamp", comValue, array);
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
    public void openClampInfo2(ActionEvent actionEvent)
    {
        try
        {
            String comValue = clampComBox2.getValue().toString();
            String [] array = clampTableManager.getRow(comValue);
            openInfoSheet("Clamp", comValue, array);
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
    public void openClampInfo3(ActionEvent actionEvent)
    {
        try
        {
            String comValue = clampComBox3.getValue().toString();
            String [] array = clampTableManager.getRow(comValue);
            openInfoSheet("Clamp", comValue, array);
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
    public void openClampInfo4(ActionEvent actionEvent)
    {
        try
        {
            String comValue = clampComBox4.getValue().toString();
            String [] array = clampTableManager.getRow(comValue);
            openInfoSheet("Clamp", comValue, array);
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
    /*
    public void openMiscInfo1(ActionEvent actionEvent)
    {
        String part = miscPartComBox1.getValue().toString();
        String comValue = miscIdComBox1.getValue().toString();
        try {
            if (part.equals("Nuts")) {
                String[] array = nutsTableManager.getRow(comValue);
                openInfoSheet("Nut", comValue, array);
            } else if (part.equals("Pipe")) {
                String[] array = pipeTableManager.getRow(comValue);
                openInfoSheet("Pipe", comValue, array);
            } else if (part.equals("Elbow")) {
                String[] array = elbowTableManager.getRow(comValue);
                openInfoSheet("Elbow", comValue, array);
            } else if (part.equals("Flange")) {
                String[] array = flangeTableManager.getRow(comValue);
                openInfoSheet("Flange", comValue, array);
            } else if (part.equals("Hanger")) {
                String[] array = hangerTableManager.getRow(comValue);
                openInfoSheet("Hanger", comValue, array);
            } else if (part.equals("Muffler")) {
                String[] array = mufflerTableManager.getRow(comValue);
                openInfoSheet("Muffler", comValue, array);
            } else if (part.equals("Resonator")) {
                String[] array = resonatorTableManager.getRow(comValue);
                openInfoSheet("Resonator", comValue, array);
            } else if (part.equals("Cat")) {
                String[] array = catTableManager.getRow(comValue);
                openInfoSheet("Cat", comValue, array);
            } else if (part.equals("FlexPipe")) {
                String[] array = flexPipeTableManager.getRow(comValue);
                openInfoSheet("FlexPipe", comValue, array);
            } else if (part.equals("Bolt")) {
                String[] array = boltTableManager.getRow(comValue);
                openInfoSheet("Bolt", comValue, array);
            } else if (part.equals("Washer")) {
                String[] array = washerTableManager.getRow(comValue);
                openInfoSheet("Washer", comValue, array);
            } else if (part.equals("Rubber")) {
                String[] array = rubberTableManager.getRow(comValue);
                openInfoSheet("Rubber", comValue, array);
            } else if (part.equals("Tip")) {
                String[] array = tipTableManager.getRow(comValue);
                openInfoSheet("Tip", comValue, array);
            } else {
                String[] array = clampTableManager.getRow(comValue);
                openInfoSheet("Clamp", comValue, array);
            }
        }
        catch(Exception e)
        {
            displayAlert("Error: "+e);
        }
    }
    public void openMiscInfo2(ActionEvent actionEvent)
    {
        String part = miscPartComBox2.getValue().toString();
        String comValue = miscIdComBox2.getValue().toString();
        try {
            if (part.equals("Nuts")) {
                String[] array = nutsTableManager.getRow(comValue);
                openInfoSheet("Nut", comValue, array);
            } else if (part.equals("Pipe")) {
                String[] array = pipeTableManager.getRow(comValue);
                openInfoSheet("Pipe", comValue, array);
            } else if (part.equals("Elbow")) {
                String[] array = elbowTableManager.getRow(comValue);
                openInfoSheet("Elbow", comValue, array);
            } else if (part.equals("Flange")) {
                String[] array = flangeTableManager.getRow(comValue);
                openInfoSheet("Flange", comValue, array);
            } else if (part.equals("Hanger")) {
                String[] array = hangerTableManager.getRow(comValue);
                openInfoSheet("Hanger", comValue, array);
            } else if (part.equals("Muffler")) {
                String[] array = mufflerTableManager.getRow(comValue);
                openInfoSheet("Muffler", comValue, array);
            } else if (part.equals("Resonator")) {
                String[] array = resonatorTableManager.getRow(comValue);
                openInfoSheet("Resonator", comValue, array);
            } else if (part.equals("Cat")) {
                String[] array = catTableManager.getRow(comValue);
                openInfoSheet("Cat", comValue, array);
            } else if (part.equals("FlexPipe")) {
                String[] array = flexPipeTableManager.getRow(comValue);
                openInfoSheet("FlexPipe", comValue, array);
            } else if (part.equals("Bolt")) {
                String[] array = boltTableManager.getRow(comValue);
                openInfoSheet("Bolt", comValue, array);
            } else if (part.equals("Washer")) {
                String[] array = washerTableManager.getRow(comValue);
                openInfoSheet("Washer", comValue, array);
            } else if (part.equals("Rubber")) {
                String[] array = rubberTableManager.getRow(comValue);
                openInfoSheet("Rubber", comValue, array);
            } else if (part.equals("Tip")) {
                String[] array = tipTableManager.getRow(comValue);
                openInfoSheet("Tip", comValue, array);
            } else {
                String[] array = clampTableManager.getRow(comValue);
                openInfoSheet("Clamp", comValue, array);
            }
        }
        catch(Exception e)
        {
            displayAlert("Error: "+e);
        }
    }
    public void openMiscInfo3(ActionEvent actionEvent)
    {
        String part = miscPartComBox3.getValue().toString();
        String comValue = miscIdComBox3.getValue().toString();
        try {
            if (part.equals("Nuts")) {
                String[] array = nutsTableManager.getRow(comValue);
                openInfoSheet("Nut", comValue, array);
            } else if (part.equals("Pipe")) {
                String[] array = pipeTableManager.getRow(comValue);
                openInfoSheet("Pipe", comValue, array);
            } else if (part.equals("Elbow")) {
                String[] array = elbowTableManager.getRow(comValue);
                openInfoSheet("Elbow", comValue, array);
            } else if (part.equals("Flange")) {
                String[] array = flangeTableManager.getRow(comValue);
                openInfoSheet("Flange", comValue, array);
            } else if (part.equals("Hanger")) {
                String[] array = hangerTableManager.getRow(comValue);
                openInfoSheet("Hanger", comValue, array);
            } else if (part.equals("Muffler")) {
                String[] array = mufflerTableManager.getRow(comValue);
                openInfoSheet("Muffler", comValue, array);
            } else if (part.equals("Resonator")) {
                String[] array = resonatorTableManager.getRow(comValue);
                openInfoSheet("Resonator", comValue, array);
            } else if (part.equals("Cat")) {
                String[] array = catTableManager.getRow(comValue);
                openInfoSheet("Cat", comValue, array);
            } else if (part.equals("FlexPipe")) {
                String[] array = flexPipeTableManager.getRow(comValue);
                openInfoSheet("FlexPipe", comValue, array);
            } else if (part.equals("Bolt")) {
                String[] array = boltTableManager.getRow(comValue);
                openInfoSheet("Bolt", comValue, array);
            } else if (part.equals("Washer")) {
                String[] array = washerTableManager.getRow(comValue);
                openInfoSheet("Washer", comValue, array);
            } else if (part.equals("Rubber")) {
                String[] array = rubberTableManager.getRow(comValue);
                openInfoSheet("Rubber", comValue, array);
            } else if (part.equals("Tip")) {
                String[] array = tipTableManager.getRow(comValue);
                openInfoSheet("Tip", comValue, array);
            } else {
                String[] array = clampTableManager.getRow(comValue);
                openInfoSheet("Clamp", comValue, array);
            }
        }
        catch(Exception e)
        {
            displayAlert("Error: "+e);
        }
    }
    public void openMiscInfo4(ActionEvent actionEvent)
    {
        String part = miscPartComBox4.getValue().toString();
        String comValue = miscIdComBox4.getValue().toString();
        try {
            if (part.equals("Nuts")) {
                String[] array = nutsTableManager.getRow(comValue);
                openInfoSheet("Nut", comValue, array);
            } else if (part.equals("Pipe")) {
                String[] array = pipeTableManager.getRow(comValue);
                openInfoSheet("Pipe", comValue, array);
            } else if (part.equals("Elbow")) {
                String[] array = elbowTableManager.getRow(comValue);
                openInfoSheet("Elbow", comValue, array);
            } else if (part.equals("Flange")) {
                String[] array = flangeTableManager.getRow(comValue);
                openInfoSheet("Flange", comValue, array);
            } else if (part.equals("Hanger")) {
                String[] array = hangerTableManager.getRow(comValue);
                openInfoSheet("Hanger", comValue, array);
            } else if (part.equals("Muffler")) {
                String[] array = mufflerTableManager.getRow(comValue);
                openInfoSheet("Muffler", comValue, array);
            } else if (part.equals("Resonator")) {
                String[] array = resonatorTableManager.getRow(comValue);
                openInfoSheet("Resonator", comValue, array);
            } else if (part.equals("Cat")) {
                String[] array = catTableManager.getRow(comValue);
                openInfoSheet("Cat", comValue, array);
            } else if (part.equals("FlexPipe")) {
                String[] array = flexPipeTableManager.getRow(comValue);
                openInfoSheet("FlexPipe", comValue, array);
            } else if (part.equals("Bolt")) {
                String[] array = boltTableManager.getRow(comValue);
                openInfoSheet("Bolt", comValue, array);
            } else if (part.equals("Washer")) {
                String[] array = washerTableManager.getRow(comValue);
                openInfoSheet("Washer", comValue, array);
            } else if (part.equals("Rubber")) {
                String[] array = rubberTableManager.getRow(comValue);
                openInfoSheet("Rubber", comValue, array);
            } else if (part.equals("Tip")) {
                String[] array = tipTableManager.getRow(comValue);
                openInfoSheet("Tip", comValue, array);
            } else {
                String[] array = clampTableManager.getRow(comValue);
                openInfoSheet("Clamp", comValue, array);
            }
        }
        catch(Exception e)
        {
            displayAlert("Error: "+e);
        }
    }
    */
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
            String id = nutComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(nutsTableManager.isCad(id))
                nutSubtotal1.setText(df.format(nutsTableManager.getPrice(id)*Double.parseDouble(nutQtyText1.getText())) + " CAD");
            else
                nutSubtotal1.setText(df.format(nutsTableManager.getPrice(id)*Double.parseDouble(nutQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateNutSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = nutComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(nutsTableManager.isCad(id))
                nutSubtotal2.setText(df.format(nutsTableManager.getPrice(id)*Double.parseDouble(nutQtyText2.getText())) + " CAD");
            else
                nutSubtotal2.setText(df.format(nutsTableManager.getPrice(id)*Double.parseDouble(nutQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateNutSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = nutComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(nutsTableManager.isCad(id))
                nutSubtotal3.setText(df.format(nutsTableManager.getPrice(id)*Double.parseDouble(nutQtyText3.getText())) + " CAD");
            else
                nutSubtotal3.setText(df.format(nutsTableManager.getPrice(id)*Double.parseDouble(nutQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateNutSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = nutComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(nutsTableManager.isCad(id))
                nutSubtotal4.setText(df.format(nutsTableManager.getPrice(id)*Double.parseDouble(nutQtyText4.getText())) + " CAD");
            else
                nutSubtotal4.setText(df.format(nutsTableManager.getPrice(id)*Double.parseDouble(nutQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculatePipeSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = pipeComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(pipeTableManager.isCad(id))
                pipeSubtotal1.setText(df.format(pipeTableManager.getPrice(id)*Double.parseDouble(pipeQtyText1.getText())) + " CAD");
            else
                pipeSubtotal1.setText(df.format(pipeTableManager.getPrice(id)*Double.parseDouble(pipeQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculatePipeSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = pipeComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(pipeTableManager.isCad(id))
                pipeSubtotal2.setText(df.format(pipeTableManager.getPrice(id)*Double.parseDouble(pipeQtyText2.getText())) + " CAD");
            else
                pipeSubtotal2.setText(df.format(pipeTableManager.getPrice(id)*Double.parseDouble(pipeQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculatePipeSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = pipeComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(pipeTableManager.isCad(id))
                pipeSubtotal3.setText(df.format(pipeTableManager.getPrice(id)*Double.parseDouble(pipeQtyText3.getText())) + " CAD");
            else
                pipeSubtotal3.setText(df.format(pipeTableManager.getPrice(id)*Double.parseDouble(pipeQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculatePipeSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = pipeComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(pipeTableManager.isCad(id))
                pipeSubtotal4.setText(df.format(pipeTableManager.getPrice(id)*Double.parseDouble(pipeQtyText4.getText())) + " CAD");
            else
                pipeSubtotal4.setText(df.format(pipeTableManager.getPrice(id)*Double.parseDouble(pipeQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateElbowSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = elbowComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(elbowTableManager.isCad(id))
                elbowSubtotal1.setText(df.format(elbowTableManager.getPrice(id)*Double.parseDouble(elbowQtyText1.getText())) + " CAD");
            else
                elbowSubtotal1.setText(df.format(elbowTableManager.getPrice(id)*Double.parseDouble(elbowQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateElbowSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = elbowComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(elbowTableManager.isCad(id))
                elbowSubtotal2.setText(df.format(elbowTableManager.getPrice(id)*Double.parseDouble(elbowQtyText2.getText())) + " CAD");
            else
                elbowSubtotal2.setText(df.format(elbowTableManager.getPrice(id)*Double.parseDouble(elbowQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateElbowSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = elbowComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(elbowTableManager.isCad(id))
                elbowSubtotal3.setText(df.format(elbowTableManager.getPrice(id)*Double.parseDouble(elbowQtyText3.getText())) + " CAD");
            else
                elbowSubtotal3.setText(df.format(elbowTableManager.getPrice(id)*Double.parseDouble(elbowQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateElbowSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = elbowComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(elbowTableManager.isCad(id))
                elbowSubtotal4.setText(df.format(elbowTableManager.getPrice(id)*Double.parseDouble(elbowQtyText4.getText())) + " CAD");
            else
                elbowSubtotal4.setText(df.format(elbowTableManager.getPrice(id)*Double.parseDouble(elbowQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateFlangeSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = flangeComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(flangeTableManager.isCad(id))
                flangeSubtotal1.setText(df.format(flangeTableManager.getPrice(id)*Double.parseDouble(flangeQtyText1.getText())) + " CAD");
            else
                flangeSubtotal1.setText(df.format(flangeTableManager.getPrice(id)*Double.parseDouble(flangeQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateFlangeSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = flangeComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(flangeTableManager.isCad(id))
                flangeSubtotal2.setText(df.format(flangeTableManager.getPrice(id)*Double.parseDouble(flangeQtyText2.getText())) + " CAD");
            else
                flangeSubtotal1.setText(df.format(flangeTableManager.getPrice(id)*Double.parseDouble(flangeQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateFlangeSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = flangeComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(flangeTableManager.isCad(id))
                flangeSubtotal3.setText(df.format(flangeTableManager.getPrice(id)*Double.parseDouble(flangeQtyText3.getText())) + " CAD");
            else
                flangeSubtotal3.setText(df.format(flangeTableManager.getPrice(id)*Double.parseDouble(flangeQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateFlangeSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = flangeComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(flangeTableManager.isCad(id))
                flangeSubtotal4.setText(df.format(flangeTableManager.getPrice(id)*Double.parseDouble(flangeQtyText4.getText())) + " CAD");
            else
                flangeSubtotal4.setText(df.format(flangeTableManager.getPrice(id)*Double.parseDouble(flangeQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateHangerSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = hangerComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(hangerTableManager.isCad(id))
                hangerSubtotal1.setText(df.format(hangerTableManager.getPrice(id)*Double.parseDouble(hangerQtyText1.getText())) + " CAD");
            else
                hangerSubtotal1.setText(df.format(hangerTableManager.getPrice(id)*Double.parseDouble(hangerQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateHangerSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = hangerComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(hangerTableManager.isCad(id))
                hangerSubtotal2.setText(df.format(hangerTableManager.getPrice(id)*Double.parseDouble(hangerQtyText2.getText())) + " CAD");
            else
                hangerSubtotal2.setText(df.format(hangerTableManager.getPrice(id)*Double.parseDouble(hangerQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateHangerSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = hangerComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(hangerTableManager.isCad(id))
                hangerSubtotal3.setText(df.format(hangerTableManager.getPrice(id)*Double.parseDouble(hangerQtyText3.getText())) + " CAD");
            else
                hangerSubtotal3.setText(df.format(hangerTableManager.getPrice(id)*Double.parseDouble(hangerQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateHangerSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = hangerComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(hangerTableManager.isCad(id))
                hangerSubtotal4.setText(df.format(hangerTableManager.getPrice(id)*Double.parseDouble(hangerQtyText4.getText())) + " CAD");
            else
                hangerSubtotal4.setText(df.format(hangerTableManager.getPrice(id)*Double.parseDouble(hangerQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateMufflerSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = mufflerComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(mufflerTableManager.isCad(id))
                mufflerSubtotal1.setText(df.format(mufflerTableManager.getPrice(id)*Double.parseDouble(mufflerQtyText1.getText())) + " CAD");
            else
                mufflerSubtotal1.setText(df.format(mufflerTableManager.getPrice(id)*Double.parseDouble(mufflerQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateMufflerSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = mufflerComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(mufflerTableManager.isCad(id))
                mufflerSubtotal2.setText(df.format(mufflerTableManager.getPrice(id)*Double.parseDouble(mufflerQtyText2.getText())) + " CAD");
            else
                mufflerSubtotal2.setText(df.format(mufflerTableManager.getPrice(id)*Double.parseDouble(mufflerQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateMufflerSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = mufflerComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(mufflerTableManager.isCad(id))
                mufflerSubtotal3.setText(df.format(mufflerTableManager.getPrice(id)*Double.parseDouble(mufflerQtyText3.getText())) + " CAD");
            else
                mufflerSubtotal3.setText(df.format(mufflerTableManager.getPrice(id)*Double.parseDouble(mufflerQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateMufflerSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = mufflerComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(mufflerTableManager.isCad(id))
                mufflerSubtotal4.setText(df.format(mufflerTableManager.getPrice(id)*Double.parseDouble(mufflerQtyText4.getText())) + " CAD");
            else
                mufflerSubtotal4.setText(df.format(mufflerTableManager.getPrice(id)*Double.parseDouble(mufflerQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateResonatorSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = resonatorComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(resonatorTableManager.isCad(id))
                resonatorSubtotal1.setText(df.format(resonatorTableManager.getPrice(id)*Double.parseDouble(resonatorQtyText1.getText())) + " CAD");
            else
                resonatorSubtotal1.setText(df.format(resonatorTableManager.getPrice(id)*Double.parseDouble(resonatorQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateResonatorSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = resonatorComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(resonatorTableManager.isCad(id))
                resonatorSubtotal2.setText(df.format(resonatorTableManager.getPrice(id)*Double.parseDouble(resonatorQtyText2.getText())) + " CAD");
            else
                resonatorSubtotal2.setText(df.format(resonatorTableManager.getPrice(id)*Double.parseDouble(resonatorQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateResonatorSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = resonatorComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(resonatorTableManager.isCad(id))
                resonatorSubtotal3.setText(df.format(resonatorTableManager.getPrice(id)*Double.parseDouble(resonatorQtyText3.getText())) + " CAD");
            else
                resonatorSubtotal3.setText(df.format(resonatorTableManager.getPrice(id)*Double.parseDouble(resonatorQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateResonatorSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = resonatorComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(resonatorTableManager.isCad(id))
                resonatorSubtotal4.setText(df.format(resonatorTableManager.getPrice(id)*Double.parseDouble(resonatorQtyText4.getText())) + " CAD");
            else
                resonatorSubtotal4.setText(df.format(resonatorTableManager.getPrice(id)*Double.parseDouble(resonatorQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateCatSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = catComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(catTableManager.isCad(id))
                catSubtotal1.setText(df.format(catTableManager.getPrice(id)*Double.parseDouble(catQtyText1.getText())) + " CAD");
            else
                catSubtotal1.setText(df.format(catTableManager.getPrice(id)*Double.parseDouble(catQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateCatSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = catComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(catTableManager.isCad(id))
                catSubtotal2.setText(df.format(catTableManager.getPrice(id)*Double.parseDouble(catQtyText2.getText())) + " CAD");
            else
                catSubtotal2.setText(df.format(catTableManager.getPrice(id)*Double.parseDouble(catQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateCatSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = catComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(catTableManager.isCad(id))
                catSubtotal3.setText(df.format(catTableManager.getPrice(id)*Double.parseDouble(catQtyText3.getText())) + " CAD");
            else
                catSubtotal3.setText(df.format(catTableManager.getPrice(id)*Double.parseDouble(catQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }public void CalculateCatSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = catComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(catTableManager.isCad(id))
                catSubtotal4.setText(df.format(catTableManager.getPrice(id)*Double.parseDouble(catQtyText4.getText())) + " CAD");
            else
                catSubtotal4.setText(df.format(catTableManager.getPrice(id)*Double.parseDouble(catQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateFlexPipeSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = flexPipeComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(flexPipeTableManager.isCad(id))
                flexPipeSubtotal1.setText(df.format(flexPipeTableManager.getPrice(id)*Double.parseDouble(flexPipeQtyText1.getText())) + " CAD");
            else
                flexPipeSubtotal1.setText(df.format(flexPipeTableManager.getPrice(id)*Double.parseDouble(flexPipeQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateFlexPipeSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = flexPipeComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(flexPipeTableManager.isCad(id))
                flexPipeSubtotal2.setText(df.format(flexPipeTableManager.getPrice(id)*Double.parseDouble(flexPipeQtyText2.getText())) + " CAD");
            else
                flexPipeSubtotal2.setText(df.format(flexPipeTableManager.getPrice(id)*Double.parseDouble(flexPipeQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateFlexPipeSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = flexPipeComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(flexPipeTableManager.isCad(id))
                flexPipeSubtotal3.setText(df.format(flexPipeTableManager.getPrice(id)*Double.parseDouble(flexPipeQtyText3.getText())) + " CAD");
            else
                flexPipeSubtotal3.setText(df.format(flexPipeTableManager.getPrice(id)*Double.parseDouble(flexPipeQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateFlexPipeSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = flexPipeComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(flexPipeTableManager.isCad(id))
                flexPipeSubtotal4.setText(df.format(flexPipeTableManager.getPrice(id)*Double.parseDouble(flexPipeQtyText4.getText())) + " CAD");
            else
                flexPipeSubtotal4.setText(df.format(flexPipeTableManager.getPrice(id)*Double.parseDouble(flexPipeQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateBoltSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = boltComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(boltTableManager.isCad(id))
                boltSubtotal1.setText(df.format(boltTableManager.getPrice(id)*Double.parseDouble(boltQtyText1.getText())) + " CAD");
            else
                boltSubtotal1.setText(df.format(boltTableManager.getPrice(id)*Double.parseDouble(boltQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateBoltSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = boltComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(boltTableManager.isCad(id))
                boltSubtotal2.setText(df.format(boltTableManager.getPrice(id)*Double.parseDouble(boltQtyText2.getText())) + " CAD");
            else
                boltSubtotal2.setText(df.format(boltTableManager.getPrice(id)*Double.parseDouble(boltQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateBoltSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = boltComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(boltTableManager.isCad(id))
                boltSubtotal3.setText(df.format(boltTableManager.getPrice(id)*Double.parseDouble(boltQtyText3.getText())) + " CAD");
            else
                boltSubtotal3.setText(df.format(boltTableManager.getPrice(id)*Double.parseDouble(boltQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateBoltSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = boltComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(boltTableManager.isCad(id))
                boltSubtotal4.setText(df.format(boltTableManager.getPrice(id)*Double.parseDouble(boltQtyText4.getText())) + " CAD");
            else
                boltSubtotal4.setText(df.format(boltTableManager.getPrice(id)*Double.parseDouble(boltQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateWasherSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = washerComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(washerTableManager.isCad(id))
                washerSubtotal1.setText(df.format(washerTableManager.getPrice(id)*Double.parseDouble(washerQtyText1.getText())) + " CAD");
            else
                washerSubtotal1.setText(df.format(washerTableManager.getPrice(id)*Double.parseDouble(washerQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateWasherSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = washerComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(washerTableManager.isCad(id))
                washerSubtotal2.setText(df.format(washerTableManager.getPrice(id)*Double.parseDouble(washerQtyText2.getText())) + " CAD");
            else
                washerSubtotal2.setText(df.format(washerTableManager.getPrice(id)*Double.parseDouble(washerQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateWasherSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = washerComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(washerTableManager.isCad(id))
                washerSubtotal3.setText(df.format(washerTableManager.getPrice(id)*Double.parseDouble(washerQtyText3.getText())) + " CAD");
            else
                washerSubtotal3.setText(df.format(washerTableManager.getPrice(id)*Double.parseDouble(washerQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateWasherSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = washerComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(washerTableManager.isCad(id))
                washerSubtotal4.setText(df.format(washerTableManager.getPrice(id)*Double.parseDouble(washerQtyText4.getText())) + " CAD");
            else
                washerSubtotal4.setText(df.format(washerTableManager.getPrice(id)*Double.parseDouble(washerQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateRubberSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = rubberComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(rubberTableManager.isCad(id))
                rubberSubtotal1.setText(df.format(rubberTableManager.getPrice(id)*Double.parseDouble(rubberQtyText1.getText())) + " CAD");
            else
                rubberSubtotal1.setText(df.format(rubberTableManager.getPrice(id)*Double.parseDouble(rubberQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateRubberSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = rubberComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(rubberTableManager.isCad(id))
                rubberSubtotal2.setText(df.format(rubberTableManager.getPrice(id)*Double.parseDouble(rubberQtyText2.getText())) + " CAD");
            else
                rubberSubtotal2.setText(df.format(rubberTableManager.getPrice(id)*Double.parseDouble(rubberQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateRubberSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = rubberComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(rubberTableManager.isCad(id))
                rubberSubtotal3.setText(df.format(rubberTableManager.getPrice(id)*Double.parseDouble(rubberQtyText3.getText())) + " CAD");
            else
                rubberSubtotal3.setText(df.format(rubberTableManager.getPrice(id)*Double.parseDouble(rubberQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateRubberSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = rubberComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(rubberTableManager.isCad(id))
                rubberSubtotal4.setText(df.format(rubberTableManager.getPrice(id)*Double.parseDouble(rubberQtyText4.getText())) + " CAD");
            else
                rubberSubtotal4.setText(df.format(rubberTableManager.getPrice(id)*Double.parseDouble(rubberQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateTipSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = tipComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(tipTableManager.isCad(id))
                tipSubtotal1.setText(df.format(tipTableManager.getPrice(id)*Double.parseDouble(tipQtyText1.getText())) + " CAD");
            else
                tipSubtotal1.setText(df.format(tipTableManager.getPrice(id)*Double.parseDouble(tipQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateTipSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = tipComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(tipTableManager.isCad(id))
                tipSubtotal2.setText(df.format(tipTableManager.getPrice(id)*Double.parseDouble(tipQtyText2.getText())) + " CAD");
            else
                tipSubtotal2.setText(df.format(tipTableManager.getPrice(id)*Double.parseDouble(tipQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateTipSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = tipComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(tipTableManager.isCad(id))
                tipSubtotal3.setText(df.format(tipTableManager.getPrice(id)*Double.parseDouble(tipQtyText3.getText())) + " CAD");
            else
                tipSubtotal3.setText(df.format(tipTableManager.getPrice(id)*Double.parseDouble(tipQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateTipSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = tipComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(tipTableManager.isCad(id))
                tipSubtotal4.setText(df.format(tipTableManager.getPrice(id)*Double.parseDouble(tipQtyText4.getText())) + " CAD");
            else
                tipSubtotal4.setText(df.format(tipTableManager.getPrice(id)*Double.parseDouble(tipQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateClampSubtotal1(ActionEvent actionEvent)
    {
        try
        {
            String id = clampComBox1.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(clampTableManager.isCad(id))
                clampSubtotal1.setText(df.format(clampTableManager.getPrice(id)*Double.parseDouble(clampQtyText1.getText())) + " CAD");
            else
                clampSubtotal1.setText(df.format(clampTableManager.getPrice(id)*Double.parseDouble(clampQtyText1.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateClampSubtotal2(ActionEvent actionEvent)
    {
        try
        {
            String id = clampComBox2.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(clampTableManager.isCad(id))
                clampSubtotal2.setText(df.format(clampTableManager.getPrice(id)*Double.parseDouble(clampQtyText2.getText())) + " CAD");
            else
                clampSubtotal2.setText(df.format(clampTableManager.getPrice(id)*Double.parseDouble(clampQtyText2.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateClampSubtotal3(ActionEvent actionEvent)
    {
        try
        {
            String id = clampComBox3.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(clampTableManager.isCad(id))
                clampSubtotal3.setText(df.format(clampTableManager.getPrice(id)*Double.parseDouble(clampQtyText3.getText())) + " CAD");
            else
                clampSubtotal3.setText(df.format(clampTableManager.getPrice(id)*Double.parseDouble(clampQtyText3.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    public void CalculateClampSubtotal4(ActionEvent actionEvent)
    {
        try
        {
            String id = clampComBox4.getValue().toString();
            DecimalFormat df = new DecimalFormat("#####.##");
            if(clampTableManager.isCad(id))
                clampSubtotal4.setText(df.format(clampTableManager.getPrice(id)*Double.parseDouble(clampQtyText4.getText())) + " CAD");
            else
                clampSubtotal4.setText(df.format(clampTableManager.getPrice(id)*Double.parseDouble(clampQtyText4.getText())) + " USD");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error :" + e);
            }
            else
            {

            }
        }
    }
    /*
    public void CalculateMiscSubtotal1(ActionEvent actionEvent)
    {
        DecimalFormat df = new DecimalFormat("#####.##");
        String text = "";
        try {
            String part = miscPartComBox1.getValue().toString();
            String id = miscIdComBox1.getValue().toString();
            double qty = Double.parseDouble(miscQtyText1.getText());
            if (part.equals("Nuts")) {
                if(nutsTableManager.isCad(id))
                    text = nutsTableManager.getPrice(id) * qty + " CAD";
                else
                    text = nutsTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Pipe")) {
                if(pipeTableManager.isCad(id))
                    text = pipeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = pipeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Elbow")) {
                if(elbowTableManager.isCad(id))
                    text = elbowTableManager.getPrice(id) * qty + " CAD";
                else
                    text = elbowTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Flange")) {
                if(flangeTableManager.isCad(id))
                    text = flangeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = flangeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Hanger")) {
                if(hangerTableManager.isCad(id))
                    text = hangerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = hangerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Muffler")) {
                if(mufflerTableManager.isCad(id))
                    text = mufflerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = mufflerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Resonator")) {
                if(resonatorTableManager.isCad(id))
                    text = resonatorTableManager.getPrice(id) * qty + " CAD";
                else
                    text = resonatorTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Cat")) {
                if(catTableManager.isCad(id))
                    text = catTableManager.getPrice(id) * qty + " CAD";
                else
                    text = catTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("FlexPipe")) {
                if(flexPipeTableManager.isCad(id))
                    text = flexPipeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = flexPipeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Bolt")) {
                if(boltTableManager.isCad(id))
                    text = boltTableManager.getPrice(id) * qty + " CAD";
                else
                    text = boltTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Washer")) {
                if(washerTableManager.isCad(id))
                    text = washerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = washerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Rubber")) {
                if(rubberTableManager.isCad(id))
                    text = rubberTableManager.getPrice(id) * qty + " CAD";
                else
                    text = rubberTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Tip")) {
                if(tipTableManager.isCad(id))
                    text = tipTableManager.getPrice(id) * qty + " CAD";
                else
                    text = tipTableManager.getPrice(id) * qty + " USD";
            } else {
                if(clampTableManager.isCad(id))
                    text = clampTableManager.getPrice(id) * qty + " CAD";
                else
                    text = clampTableManager.getPrice(id) * qty + " USD";
            }
            miscSubtotal1.setText(text);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            displayAlert("Error :"+e);
        }
    }
    public void CalculateMiscSubtotal2(ActionEvent actionEvent)
    {
        DecimalFormat df = new DecimalFormat("#####.##");
        String text = "";
        try {
            String part = miscPartComBox2.getValue().toString();
            String id = miscIdComBox2.getValue().toString();
            double qty = Double.parseDouble(miscQtyText2.getText());
            if (part.equals("Nuts")) {
                if(nutsTableManager.isCad(id))
                    text = nutsTableManager.getPrice(id) * qty + " CAD";
                else
                    text = nutsTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Pipe")) {
                if(pipeTableManager.isCad(id))
                    text = pipeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = pipeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Elbow")) {
                if(elbowTableManager.isCad(id))
                    text = elbowTableManager.getPrice(id) * qty + " CAD";
                else
                    text = elbowTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Flange")) {
                if(flangeTableManager.isCad(id))
                    text = flangeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = flangeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Hanger")) {
                if(hangerTableManager.isCad(id))
                    text = hangerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = hangerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Muffler")) {
                if(mufflerTableManager.isCad(id))
                    text = mufflerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = mufflerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Resonator")) {
                if(resonatorTableManager.isCad(id))
                    text = resonatorTableManager.getPrice(id) * qty + " CAD";
                else
                    text = resonatorTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Cat")) {
                if(catTableManager.isCad(id))
                    text = catTableManager.getPrice(id) * qty + " CAD";
                else
                    text = catTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("FlexPipe")) {
                if(flexPipeTableManager.isCad(id))
                    text = flexPipeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = flexPipeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Bolt")) {
                if(boltTableManager.isCad(id))
                    text = boltTableManager.getPrice(id) * qty + " CAD";
                else
                    text = boltTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Washer")) {
                if(washerTableManager.isCad(id))
                    text = washerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = washerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Rubber")) {
                if(rubberTableManager.isCad(id))
                    text = rubberTableManager.getPrice(id) * qty + " CAD";
                else
                    text = rubberTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Tip")) {
                if(tipTableManager.isCad(id))
                    text = tipTableManager.getPrice(id) * qty + " CAD";
                else
                    text = tipTableManager.getPrice(id) * qty + " USD";
            } else {
                if(clampTableManager.isCad(id))
                    text = clampTableManager.getPrice(id) * qty + " CAD";
                else
                    text = clampTableManager.getPrice(id) * qty + " USD";
            }
            miscSubtotal2.setText(text);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            displayAlert("Error :"+e);
        }
    }
    public void CalculateMiscSubtotal3(ActionEvent actionEvent)
    {
        DecimalFormat df = new DecimalFormat("#####.##");
        String text = "";
        try {
            String part = miscPartComBox3.getValue().toString();
            String id = miscIdComBox3.getValue().toString();
            double qty = Double.parseDouble(miscQtyText3.getText());
            if (part.equals("Nuts")) {
                if(nutsTableManager.isCad(id))
                    text = nutsTableManager.getPrice(id) * qty + " CAD";
                else
                    text = nutsTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Pipe")) {
                if(pipeTableManager.isCad(id))
                    text = pipeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = pipeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Elbow")) {
                if(elbowTableManager.isCad(id))
                    text = elbowTableManager.getPrice(id) * qty + " CAD";
                else
                    text = elbowTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Flange")) {
                if(flangeTableManager.isCad(id))
                    text = flangeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = flangeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Hanger")) {
                if(hangerTableManager.isCad(id))
                    text = hangerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = hangerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Muffler")) {
                if(mufflerTableManager.isCad(id))
                    text = mufflerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = mufflerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Resonator")) {
                if(resonatorTableManager.isCad(id))
                    text = resonatorTableManager.getPrice(id) * qty + " CAD";
                else
                    text = resonatorTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Cat")) {
                if(catTableManager.isCad(id))
                    text = catTableManager.getPrice(id) * qty + " CAD";
                else
                    text = catTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("FlexPipe")) {
                if(flexPipeTableManager.isCad(id))
                    text = flexPipeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = flexPipeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Bolt")) {
                if(boltTableManager.isCad(id))
                    text = boltTableManager.getPrice(id) * qty + " CAD";
                else
                    text = boltTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Washer")) {
                if(washerTableManager.isCad(id))
                    text = washerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = washerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Rubber")) {
                if(rubberTableManager.isCad(id))
                    text = rubberTableManager.getPrice(id) * qty + " CAD";
                else
                    text = rubberTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Tip")) {
                if(tipTableManager.isCad(id))
                    text = tipTableManager.getPrice(id) * qty + " CAD";
                else
                    text = tipTableManager.getPrice(id) * qty + " USD";
            } else {
                if(clampTableManager.isCad(id))
                    text = clampTableManager.getPrice(id) * qty + " CAD";
                else
                    text = clampTableManager.getPrice(id) * qty + " USD";
            }
            miscSubtotal3.setText(text);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            displayAlert("Error :"+e);
        }
    }
    public void CalculateMiscSubtotal4(ActionEvent actionEvent)
    {
        DecimalFormat df = new DecimalFormat("#####.##");
        String text = "";
        try {
            String part = miscPartComBox4.getValue().toString();
            String id = miscIdComBox4.getValue().toString();
            double qty = Double.parseDouble(miscQtyText4.getText());
            if (part.equals("Nuts")) {
                if(nutsTableManager.isCad(id))
                    text = nutsTableManager.getPrice(id) * qty + " CAD";
                else
                    text = nutsTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Pipe")) {
                if(pipeTableManager.isCad(id))
                    text = pipeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = pipeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Elbow")) {
                if(elbowTableManager.isCad(id))
                    text = elbowTableManager.getPrice(id) * qty + " CAD";
                else
                    text = elbowTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Flange")) {
                if(flangeTableManager.isCad(id))
                    text = flangeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = flangeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Hanger")) {
                if(hangerTableManager.isCad(id))
                    text = hangerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = hangerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Muffler")) {
                if(mufflerTableManager.isCad(id))
                    text = mufflerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = mufflerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Resonator")) {
                if(resonatorTableManager.isCad(id))
                    text = resonatorTableManager.getPrice(id) * qty + " CAD";
                else
                    text = resonatorTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Cat")) {
                if(catTableManager.isCad(id))
                    text = catTableManager.getPrice(id) * qty + " CAD";
                else
                    text = catTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("FlexPipe")) {
                if(flexPipeTableManager.isCad(id))
                    text = flexPipeTableManager.getPrice(id) * qty + " CAD";
                else
                    text = flexPipeTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Bolt")) {
                if(boltTableManager.isCad(id))
                    text = boltTableManager.getPrice(id) * qty + " CAD";
                else
                    text = boltTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Washer")) {
                if(washerTableManager.isCad(id))
                    text = washerTableManager.getPrice(id) * qty + " CAD";
                else
                    text = washerTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Rubber")) {
                if(rubberTableManager.isCad(id))
                    text = rubberTableManager.getPrice(id) * qty + " CAD";
                else
                    text = rubberTableManager.getPrice(id) * qty + " USD";
            } else if (part.equals("Tip")) {
                if(tipTableManager.isCad(id))
                    text = tipTableManager.getPrice(id) * qty + " CAD";
                else
                    text = tipTableManager.getPrice(id) * qty + " USD";
            } else {
                if(clampTableManager.isCad(id))
                    text = clampTableManager.getPrice(id) * qty + " CAD";
                else
                    text = clampTableManager.getPrice(id) * qty + " USD";
            }
            miscSubtotal4.setText(text);
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            displayAlert("Error :"+e);
        }
    }
     */

    public void calculateSubtotals() throws Exception
    {
        CalculateNutSubtotal1(new ActionEvent());
        CalculatePipeSubtotal1(new ActionEvent());
        CalculateElbowSubtotal1(new ActionEvent());
        CalculateFlangeSubtotal1(new ActionEvent());
        CalculateHangerSubtotal1(new ActionEvent());
        CalculateMufflerSubtotal1(new ActionEvent());
        CalculateResonatorSubtotal1(new ActionEvent());
        CalculateCatSubtotal1(new ActionEvent());
        CalculateFlexPipeSubtotal1(new ActionEvent());
        CalculateBoltSubtotal1(new ActionEvent());
        CalculateWasherSubtotal1(new ActionEvent());
        CalculateRubberSubtotal1(new ActionEvent());
        CalculateTipSubtotal1(new ActionEvent());
        CalculateClampSubtotal1(new ActionEvent());

        CalculateNutSubtotal2(new ActionEvent());
        CalculatePipeSubtotal2(new ActionEvent());
        CalculateElbowSubtotal2(new ActionEvent());
        CalculateFlangeSubtotal2(new ActionEvent());
        CalculateHangerSubtotal2(new ActionEvent());
        CalculateMufflerSubtotal2(new ActionEvent());
        CalculateResonatorSubtotal2(new ActionEvent());
        CalculateCatSubtotal2(new ActionEvent());
        CalculateFlexPipeSubtotal2(new ActionEvent());
        CalculateBoltSubtotal2(new ActionEvent());
        CalculateWasherSubtotal2(new ActionEvent());
        CalculateRubberSubtotal2(new ActionEvent());
        CalculateTipSubtotal2(new ActionEvent());
        CalculateClampSubtotal2(new ActionEvent());

        CalculateNutSubtotal3(new ActionEvent());
        CalculatePipeSubtotal3(new ActionEvent());
        CalculateElbowSubtotal3(new ActionEvent());
        CalculateFlangeSubtotal3(new ActionEvent());
        CalculateHangerSubtotal3(new ActionEvent());
        CalculateMufflerSubtotal3(new ActionEvent());
        CalculateResonatorSubtotal3(new ActionEvent());
        CalculateCatSubtotal3(new ActionEvent());
        CalculateFlexPipeSubtotal3(new ActionEvent());
        CalculateBoltSubtotal3(new ActionEvent());
        CalculateWasherSubtotal3(new ActionEvent());
        CalculateRubberSubtotal3(new ActionEvent());
        CalculateTipSubtotal3(new ActionEvent());
        CalculateClampSubtotal3(new ActionEvent());

        CalculateNutSubtotal4(new ActionEvent());
        CalculatePipeSubtotal4(new ActionEvent());
        CalculateElbowSubtotal4(new ActionEvent());
        CalculateFlangeSubtotal4(new ActionEvent());
        CalculateHangerSubtotal4(new ActionEvent());
        CalculateMufflerSubtotal4(new ActionEvent());
        CalculateResonatorSubtotal4(new ActionEvent());
        CalculateCatSubtotal4(new ActionEvent());
        CalculateFlexPipeSubtotal4(new ActionEvent());
        CalculateBoltSubtotal4(new ActionEvent());
        CalculateWasherSubtotal4(new ActionEvent());
        CalculateRubberSubtotal4(new ActionEvent());
        CalculateTipSubtotal4(new ActionEvent());
        CalculateClampSubtotal4(new ActionEvent());

        /*
        CalculateMiscSubtotal1(new ActionEvent());
        CalculateMiscSubtotal2(new ActionEvent());
        CalculateMiscSubtotal3(new ActionEvent());
        CalculateMiscSubtotal4(new ActionEvent());
         */
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

    /*
    public void updateIdComBox1(ActionEvent actionEvent)
    {
        String part = miscPartComBox1.getValue().toString();
        ObservableList data = FXCollections.observableArrayList();
        try {
            if (part.equals("Nuts")) {
                data.addAll(nutsTableManager.getIdNames());
            } else if (part.equals("Pipe")) {
                data.addAll(pipeTableManager.getIdNames());
            } else if (part.equals("Elbow")) {
                data.addAll(elbowTableManager.getIdNames());
            } else if (part.equals("Flange")) {
                data.addAll(flangeTableManager.getIdNames());
            } else if (part.equals("Hanger")) {
                data.addAll(hangerTableManager.getIdNames());
            } else if (part.equals("Muffler")) {
                data.addAll(mufflerTableManager.getIdNames());
            } else if (part.equals("Resonator")) {
                data.addAll(resonatorTableManager.getIdNames());
            } else if (part.equals("Cat")) {
                data.addAll(catTableManager.getIdNames());
            } else if (part.equals("FlexPipe")) {
                data.addAll(flexPipeTableManager.getIdNames());
            } else if (part.equals("Bolt")) {
                data.addAll(boltTableManager.getIdNames());
            } else if (part.equals("Washer")) {
                data.addAll(washerTableManager.getIdNames());
            } else if (part.equals("Rubber")) {
                data.addAll(rubberTableManager.getIdNames());
            } else if (part.equals("Tip")) {
                data.addAll(tipTableManager.getIdNames());
            } else {
                data.addAll(clampTableManager.getIdNames());
            }
            miscIdComBox1.setItems(data);
            miscIdComBox1.getSelectionModel().selectFirst();
        }
        catch(Exception e)
        {
            displayAlert("Error: " + e);
        }
    }
    public void updateIdComBox2(ActionEvent actionEvent)
    {
        String part = miscPartComBox2.getValue().toString();
        ObservableList data = FXCollections.observableArrayList();
        try {
            if (part.equals("Nuts")) {
                data.addAll(nutsTableManager.getIdNames());
            } else if (part.equals("Pipe")) {
                data.addAll(pipeTableManager.getIdNames());
            } else if (part.equals("Elbow")) {
                data.addAll(elbowTableManager.getIdNames());
            } else if (part.equals("Flange")) {
                data.addAll(flangeTableManager.getIdNames());
            } else if (part.equals("Hanger")) {
                data.addAll(hangerTableManager.getIdNames());
            } else if (part.equals("Muffler")) {
                data.addAll(mufflerTableManager.getIdNames());
            } else if (part.equals("Resonator")) {
                data.addAll(resonatorTableManager.getIdNames());
            } else if (part.equals("Cat")) {
                data.addAll(catTableManager.getIdNames());
            } else if (part.equals("FlexPipe")) {
                data.addAll(flexPipeTableManager.getIdNames());
            } else if (part.equals("Bolt")) {
                data.addAll(boltTableManager.getIdNames());
            } else if (part.equals("Washer")) {
                data.addAll(washerTableManager.getIdNames());
            } else if (part.equals("Rubber")) {
                data.addAll(rubberTableManager.getIdNames());
            } else if (part.equals("Tip")) {
                data.addAll(tipTableManager.getIdNames());
            } else {
                data.addAll(clampTableManager.getIdNames());
            }
            miscIdComBox2.setItems(data);
            miscIdComBox2.getSelectionModel().selectFirst();

        }
        catch(Exception e)
        {
            displayAlert("Error :" + e);
        }
    }

    public void updateIdComBox3(ActionEvent actionEvent)
    {
        String part = miscPartComBox3.getValue().toString();
        ObservableList data = FXCollections.observableArrayList();
        try {
            if (part.equals("Nuts")) {
                data.addAll(nutsTableManager.getIdNames());
            } else if (part.equals("Pipe")) {
                data.addAll(pipeTableManager.getIdNames());
            } else if (part.equals("Elbow")) {
                data.addAll(elbowTableManager.getIdNames());
            } else if (part.equals("Flange")) {
                data.addAll(flangeTableManager.getIdNames());
            } else if (part.equals("Hanger")) {
                data.addAll(hangerTableManager.getIdNames());
            } else if (part.equals("Muffler")) {
                data.addAll(mufflerTableManager.getIdNames());
            } else if (part.equals("Resonator")) {
                data.addAll(resonatorTableManager.getIdNames());
            } else if (part.equals("Cat")) {
                data.addAll(catTableManager.getIdNames());
            } else if (part.equals("FlexPipe")) {
                data.addAll(flexPipeTableManager.getIdNames());
            } else if (part.equals("Bolt")) {
                data.addAll(boltTableManager.getIdNames());
            } else if (part.equals("Washer")) {
                data.addAll(washerTableManager.getIdNames());
            } else if (part.equals("Rubber")) {
                data.addAll(rubberTableManager.getIdNames());
            } else if (part.equals("Tip")) {
                data.addAll(tipTableManager.getIdNames());
            } else {
                data.addAll(clampTableManager.getIdNames());
            }
            miscIdComBox3.setItems(data);
            miscIdComBox3.getSelectionModel().selectFirst();
        }
        catch(Exception e)
        {
            displayAlert("Error: " + e);
        }
    }

    public void updateIdComBox4(ActionEvent actionEvent)
    {
        String part = miscPartComBox4.getValue().toString();
        ObservableList data = FXCollections.observableArrayList();
        try {
            if (part.equals("Nuts")) {
                data.addAll(nutsTableManager.getIdNames());
            } else if (part.equals("Pipe")) {
                data.addAll(pipeTableManager.getIdNames());
            } else if (part.equals("Elbow")) {
                data.addAll(elbowTableManager.getIdNames());
            } else if (part.equals("Flange")) {
                data.addAll(flangeTableManager.getIdNames());
            } else if (part.equals("Hanger")) {
                data.addAll(hangerTableManager.getIdNames());
            } else if (part.equals("Muffler")) {
                data.addAll(mufflerTableManager.getIdNames());
            } else if (part.equals("Resonator")) {
                data.addAll(resonatorTableManager.getIdNames());
            } else if (part.equals("Cat")) {
                data.addAll(catTableManager.getIdNames());
            } else if (part.equals("FlexPipe")) {
                data.addAll(flexPipeTableManager.getIdNames());
            } else if (part.equals("Bolt")) {
                data.addAll(boltTableManager.getIdNames());
            } else if (part.equals("Washer")) {
                data.addAll(washerTableManager.getIdNames());
            } else if (part.equals("Rubber")) {
                data.addAll(rubberTableManager.getIdNames());
            } else if (part.equals("Tip")) {
                data.addAll(tipTableManager.getIdNames());
            } else {
                data.addAll(clampTableManager.getIdNames());
            }
            miscIdComBox4.setItems(data);
            miscIdComBox4.getSelectionModel().selectFirst();
        }
        catch(Exception e)
        {
            displayAlert("Error: " + e);
        }
    }
     */

    public void clickRadBtnCAD1(ActionEvent actionEvent)
    {
        miscRadBtnCAD1.setSelected(true);
        miscRadBtnUSD1.setSelected(false);
    }
    public void clickRadBtnUSD1(ActionEvent actionEvent)
    {
        miscRadBtnCAD1.setSelected(false);
        miscRadBtnUSD1.setSelected(true);
    }
    public void clickRadBtnCAD2(ActionEvent actionEvent)
    {
        miscRadBtnCAD2.setSelected(true);
        miscRadBtnUSD2.setSelected(false);
    }
    public void clickRadBtnUSD2(ActionEvent actionEvent)
    {
        miscRadBtnCAD2.setSelected(false);
        miscRadBtnUSD2.setSelected(true);
    }
    public void clickRadBtnCAD3(ActionEvent actionEvent)
    {
        miscRadBtnCAD3.setSelected(true);
        miscRadBtnUSD3.setSelected(false);
    }
    public void clickRadBtnUSD3(ActionEvent actionEvent)
    {
        miscRadBtnCAD3.setSelected(false);
        miscRadBtnUSD3.setSelected(true);
    }
    public void clickRadBtnCAD4(ActionEvent actionEvent)
    {
        miscRadBtnCAD4.setSelected(true);
        miscRadBtnUSD4.setSelected(false);
    }
    public void clickRadBtnUSD4(ActionEvent actionEvent)
    {
        miscRadBtnCAD4.setSelected(false);
        miscRadBtnUSD4.setSelected(true);
    }
    public void openKitInfo()
    {
        try {
            String[][] array = kitTableManager.getKitInfo(kitIDComBox.getValue().toString());
            boltComBox1.getEditor().setText(array[1][0]);
            boltComBox2.getEditor().setText(array[2][0]);
            boltComBox3.getEditor().setText(array[3][0]);
            boltComBox4.getEditor().setText(array[4][0]);
            catComBox1.getEditor().setText(array[5][0]);
            catComBox2.getEditor().setText(array[6][0]);
            catComBox3.getEditor().setText(array[7][0]);
            catComBox4.getEditor().setText(array[8][0]);
            clampComBox1.getEditor().setText(array[9][0]);
            clampComBox2.getEditor().setText(array[10][0]);
            clampComBox3.getEditor().setText(array[11][0]);
            clampComBox4.getEditor().setText(array[12][0]);
            elbowComBox1.getEditor().setText(array[13][0]);
            elbowComBox2.getEditor().setText(array[14][0]);
            elbowComBox3.getEditor().setText(array[15][0]);
            elbowComBox4.getEditor().setText(array[16][0]);
            flangeComBox1.getEditor().setText(array[17][0]);
            flangeComBox2.getEditor().setText(array[18][0]);
            flangeComBox3.getEditor().setText(array[19][0]);
            flangeComBox4.getEditor().setText(array[20][0]);
            flexPipeComBox1.getEditor().setText(array[21][0]);
            flexPipeComBox2.getEditor().setText(array[22][0]);
            flexPipeComBox3.getEditor().setText(array[23][0]);
            flexPipeComBox4.getEditor().setText(array[24][0]);
            hangerComBox1.getEditor().setText(array[25][0]);
            hangerComBox2.getEditor().setText(array[26][0]);
            hangerComBox3.getEditor().setText(array[27][0]);
            hangerComBox4.getEditor().setText(array[28][0]);
            mufflerComBox1.getEditor().setText(array[29][0]);
            mufflerComBox2.getEditor().setText(array[30][0]);
            mufflerComBox3.getEditor().setText(array[31][0]);
            mufflerComBox4.getEditor().setText(array[32][0]);
            nutComBox1.getEditor().setText(array[33][0]);
            nutComBox2.getEditor().setText(array[34][0]);
            nutComBox3.getEditor().setText(array[35][0]);
            nutComBox4.getEditor().setText(array[36][0]);
            pipeComBox1.getEditor().setText(array[37][0]);
            pipeComBox2.getEditor().setText(array[38][0]);
            pipeComBox3.getEditor().setText(array[39][0]);
            pipeComBox4.getEditor().setText(array[40][0]);
            resonatorComBox1.getEditor().setText(array[41][0]);
            resonatorComBox2.getEditor().setText(array[42][0]);
            resonatorComBox3.getEditor().setText(array[43][0]);
            resonatorComBox4.getEditor().setText(array[44][0]);
            rubberComBox1.getEditor().setText(array[45][0]);
            rubberComBox2.getEditor().setText(array[46][0]);
            rubberComBox3.getEditor().setText(array[47][0]);
            rubberComBox4.getEditor().setText(array[48][0]);
            tipComBox1.getEditor().setText(array[49][0]);
            tipComBox2.getEditor().setText(array[50][0]);
            tipComBox3.getEditor().setText(array[51][0]);
            tipComBox4.getEditor().setText(array[52][0]);
            washerComBox1.getEditor().setText(array[53][0]);
            washerComBox2.getEditor().setText(array[54][0]);
            washerComBox3.getEditor().setText(array[55][0]);
            washerComBox4.getEditor().setText(array[56][0]);
            miscPartText1.setText(array[57][0]);
            miscPartText2.setText(array[58][0]);
            miscPartText3.setText(array[59][0]);
            miscPartText4.setText(array[60][0]);


            boltQtyText1.setText(array[1][1]);
            boltQtyText2.setText(array[2][1]);
            boltQtyText3.setText(array[3][1]);
            boltQtyText4.setText(array[4][1]);
            catQtyText1.setText(array[5][1]);
            catQtyText2.setText(array[6][1]);
            catQtyText3.setText(array[7][1]);
            catQtyText4.setText(array[8][1]);
            clampQtyText1.setText(array[9][1]);
            clampQtyText2.setText(array[10][1]);
            clampQtyText3.setText(array[11][1]);
            clampQtyText4.setText(array[12][1]);
            elbowQtyText1.setText(array[13][1]);
            elbowQtyText2.setText(array[14][1]);
            elbowQtyText3.setText(array[15][1]);
            elbowQtyText4.setText(array[16][1]);
            flangeQtyText1.setText(array[17][1]);
            flangeQtyText2.setText(array[18][1]);
            flangeQtyText3.setText(array[19][1]);
            flangeQtyText4.setText(array[20][1]);
            flexPipeQtyText1.setText(array[21][1]);
            flexPipeQtyText2.setText(array[22][1]);
            flexPipeQtyText3.setText(array[23][1]);
            flexPipeQtyText4.setText(array[24][1]);
            hangerQtyText1.setText(array[25][1]);
            hangerQtyText2.setText(array[26][1]);
            hangerQtyText3.setText(array[27][1]);
            hangerQtyText4.setText(array[28][1]);
            mufflerQtyText1.setText(array[29][1]);
            mufflerQtyText2.setText(array[30][1]);
            mufflerQtyText3.setText(array[31][1]);
            mufflerQtyText4.setText(array[32][1]);
            nutQtyText1.setText(array[33][1]);
            nutQtyText2.setText(array[34][1]);
            nutQtyText3.setText(array[35][1]);
            nutQtyText4.setText(array[36][1]);
            pipeQtyText1.setText(array[37][1]);
            pipeQtyText2.setText(array[38][1]);
            pipeQtyText3.setText(array[39][1]);
            pipeQtyText4.setText(array[40][1]);
            resonatorQtyText1.setText(array[41][1]);
            resonatorQtyText2.setText(array[42][1]);
            resonatorQtyText3.setText(array[43][1]);
            resonatorQtyText4.setText(array[44][1]);
            rubberQtyText1.setText(array[45][1]);
            rubberQtyText2.setText(array[46][1]);
            rubberQtyText3.setText(array[47][1]);
            rubberQtyText4.setText(array[48][1]);
            tipQtyText1.setText(array[49][1]);
            tipQtyText2.setText(array[50][1]);
            tipQtyText3.setText(array[51][1]);
            tipQtyText4.setText(array[52][1]);
            washerQtyText1.setText(array[53][1]);
            washerQtyText2.setText(array[54][1]);
            washerQtyText3.setText(array[55][1]);
            washerQtyText4.setText(array[56][1]);
            miscPartText1.setText(array[57][1]);
            miscPartText2.setText(array[58][1]);
            miscPartText3.setText(array[59][1]);
            miscPartText4.setText(array[60][1]);

            if(array[57][3].trim().equals("CAD"))
            {
                clickRadBtnCAD1(new ActionEvent());
            }
            else
            {
                clickRadBtnUSD1(new ActionEvent());
            }
            if(array[58][3].trim().equals("CAD"))
            {
                clickRadBtnCAD1(new ActionEvent());
            }
            else
            {
                clickRadBtnUSD1(new ActionEvent());
            }
            if(array[59][3].trim().equals("CAD"))
            {
                clickRadBtnCAD1(new ActionEvent());
            }
            else
            {
                clickRadBtnUSD1(new ActionEvent());
            }
            if(array[60][3].trim().equals("CAD"))
            {
                clickRadBtnCAD1(new ActionEvent());
            }
            else
            {
                clickRadBtnUSD1(new ActionEvent());
            }

            kitNameText.setText(kitIDComBox.getValue().toString().trim());

        }
        catch(Exception e)
        {
            displayAlert("Loading data failed");
        }
    }

    public void saveAsKit()
    {
        calculateTotals();
        String bolts = boltComBox1.getEditor().getText().trim() + "," + boltComBox2.getEditor().getText().trim() + "," + boltComBox3.getEditor().getText().trim() + "," + boltComBox4.getEditor().getText().trim();
        String cats = catComBox1.getEditor().getText().trim() + "," + catComBox2.getEditor().getText().trim() + "," + catComBox3.getEditor().getText().trim() + "," + catComBox4.getEditor().getText().trim();
        String clamps = clampComBox1.getEditor().getText().trim() + "," + clampComBox2.getEditor().getText().trim() + "," + clampComBox3.getEditor().getText().trim() + "," + clampComBox4.getEditor().getText().trim();
        String elbows = elbowComBox1.getEditor().getText().trim() + "," + elbowComBox2.getEditor().getText().trim() + "," + elbowComBox3.getEditor().getText().trim() + "," + elbowComBox4.getEditor().getText().trim();
        String flanges = flangeComBox1.getEditor().getText().trim() + "," + flangeComBox2.getEditor().getText().trim() + "," + flangeComBox3.getEditor().getText().trim() + "," + flangeComBox4.getEditor().getText().trim();
        String flexs = flexPipeComBox1.getEditor().getText().trim() + "," + flexPipeComBox2.getEditor().getText().trim() + "," + flexPipeComBox3.getEditor().getText().trim() + "," + flexPipeComBox4.getEditor().getText().trim();
        String hangers = hangerComBox1.getEditor().getText().trim() + "," + hangerComBox2.getEditor().getText().trim() + "," + hangerComBox3.getEditor().getText().trim() + "," + hangerComBox4.getEditor().getText().trim();
        String mufflers = mufflerComBox1.getEditor().getText().trim() + "," + mufflerComBox2.getEditor().getText().trim() + "," + mufflerComBox3.getEditor().getText().trim() + "," + mufflerComBox4.getEditor().getText().trim();
        String nuts = nutComBox1.getEditor().getText().trim() + "," + nutComBox2.getEditor().getText().trim() + "," + nutComBox3.getEditor().getText().trim() + "," + nutComBox4.getEditor().getText().trim();
        String pipes = pipeComBox1.getEditor().getText().trim() + "," + pipeComBox2.getEditor().getText().trim() + "," + pipeComBox3.getEditor().getText().trim() + "," + pipeComBox4.getEditor().getText().trim();
        String resonators = resonatorComBox1.getEditor().getText().trim() + "," + resonatorComBox2.getEditor().getText().trim() + "," + resonatorComBox3.getEditor().getText().trim() + "," + resonatorComBox4.getEditor().getText().trim();
        String rubbers = rubberComBox1.getEditor().getText().trim() + "," + rubberComBox2.getEditor().getText().trim() + "," + rubberComBox3.getEditor().getText().trim() + "," + rubberComBox4.getEditor().getText().trim();
        String tips = tipComBox1.getEditor().getText().trim() + "," + tipComBox2.getEditor().getText().trim() + "," + tipComBox3.getEditor().getText().trim() + "," + tipComBox4.getEditor().getText().trim();
        String washers = washerComBox1.getEditor().getText().trim() + "," + washerComBox2.getEditor().getText().trim() + "," + washerComBox3.getEditor().getText().trim() + "," + washerComBox4.getEditor().getText().trim();
        String miscs = miscPartText1.getText() + "," + miscPartText2.getText() + "," + miscPartText3.getText() + "," + miscPartText4.getText();

        String boltsQTY = boltQtyText1.getText() + "," + boltQtyText2.getText() + "," + boltQtyText3.getText() + "," + boltQtyText4.getText();
        String catsQTY = catQtyText1.getText() + "," + catQtyText2.getText() + "," + catQtyText3.getText() + "," + catQtyText4.getText();
        String clampsQTY = clampQtyText1.getText() + "," + clampQtyText2.getText() + "," + clampQtyText3.getText() + "," + clampQtyText4.getText();
        String elbowsQTY = elbowQtyText1.getText() + "," + elbowQtyText2.getText() + "," + elbowQtyText3.getText() + "," + elbowQtyText4.getText();
        String flangesQTY = flangeQtyText1.getText() + "," + flangeQtyText2.getText() + "," + flangeQtyText3.getText() + "," + flangeQtyText4.getText();
        String flexsQTY = flexPipeQtyText1.getText() + "," + flexPipeQtyText2.getText() + "," + flexPipeQtyText3.getText() + "," + flexPipeQtyText4.getText();
        String hangersQTY = hangerQtyText1.getText() + "," + hangerQtyText2.getText() + "," + hangerQtyText3.getText() + "," + hangerQtyText4.getText();
        String mufflersQTY = mufflerQtyText1.getText() + "," + mufflerQtyText2.getText() + "," + mufflerQtyText3.getText() + "," + mufflerQtyText4.getText();
        String nutsQTY = nutQtyText1.getText() + "," + nutQtyText2.getText() + "," + nutQtyText3.getText() + "," + nutQtyText4.getText();
        String pipesQTY = pipeQtyText1.getText() + "," + pipeQtyText2.getText() + "," + pipeQtyText3.getText() + "," + pipeQtyText4.getText();
        String resonatorsQTY = resonatorQtyText1.getText() + "," + resonatorQtyText2.getText() + "," + resonatorQtyText3.getText() + "," + resonatorQtyText4.getText();
        String rubbersQTY = rubberQtyText1.getText() + "," + rubberQtyText2.getText() + "," + rubberQtyText3.getText() + "," + rubberQtyText4.getText();
        String tipsQTY = tipQtyText1.getText() + "," + tipQtyText2.getText() + "," + tipQtyText3.getText() + "," + tipQtyText4.getText();
        String washersQTY = washerQtyText1.getText() + "," + washerQtyText2.getText() + "," + washerQtyText3.getText() + "," + washerQtyText4.getText();
        String miscPrice = miscPriceText1.getText() + "," + miscPriceText2.getText() + "," + miscPriceText3.getText() + "," + miscPriceText4.getText();

        String cur1, cur2, cur3, cur4;

        if(miscRadBtnCAD1.isSelected())
        {
            cur1 = "CAD";
        }
        else
        {
            cur1 = "USD";
        }
        if(miscRadBtnCAD2.isSelected())
        {
            cur2 = "CAD";
        }
        else
        {
            cur2 = "USD";
        }
        if(miscRadBtnCAD3.isSelected())
        {
            cur3 = "CAD";
        }
        else
        {
            cur3 = "USD";
        }
        if(miscRadBtnCAD4.isSelected())
        {
            cur4 = "CAD";
        }
        else
        {
            cur4 = "USD";
        }

        String miscCurr = cur1 + "," + cur2 + "," + cur3 + "," + cur4;

        try {
            if(!(kitNameText.getText().equals(""))) {
                kitTableManager.add(kitNameText.getText().trim(), bolts, boltsQTY, cats, catsQTY, clamps, clampsQTY, elbows, elbowsQTY, flanges, flangesQTY, flexs, flexsQTY, hangers, hangersQTY, mufflers, mufflersQTY,
                        nuts, nutsQTY, pipes, pipesQTY, resonators, resonatorsQTY, rubbers, rubbersQTY, tips, tipsQTY, washers, washersQTY, miscs, miscPrice, miscCurr,
                        Double.parseDouble(labourCostTextCAD.getText()), Double.parseDouble(labourCostTextUSD.getText()), Double.parseDouble(CADTotalLabel.getText()), Double.parseDouble(USDTotalLabel.getText()));
                displayAlert("Kit Added!");
            }
            else {
                displayAlert("Name the Kit!");
            }
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Kit Names must be unique //"+ e);
            }
            else
            {
                displayAlert("Error :" + e);
            }
        }
    }

    public void overwriteKit()
    {
        try {
            kitTableManager.delete(kitNameText.getText().trim());
        }
        catch(Exception e)
        {
            displayAlert("Delete Failed");
        }

        calculateTotals();
        String bolts = boltComBox1.getEditor().getText().trim() + "," + boltComBox2.getEditor().getText().trim() + "," + boltComBox3.getEditor().getText().trim() + "," + boltComBox4.getEditor().getText().trim();
        String cats = catComBox1.getEditor().getText().trim() + "," + catComBox2.getEditor().getText().trim() + "," + catComBox3.getEditor().getText().trim() + "," + catComBox4.getEditor().getText().trim();
        String clamps = clampComBox1.getEditor().getText().trim() + "," + clampComBox2.getEditor().getText().trim() + "," + clampComBox3.getEditor().getText().trim() + "," + clampComBox4.getEditor().getText().trim();
        String elbows = elbowComBox1.getEditor().getText().trim() + "," + elbowComBox2.getEditor().getText().trim() + "," + elbowComBox3.getEditor().getText().trim() + "," + elbowComBox4.getEditor().getText().trim();
        String flanges = flangeComBox1.getEditor().getText().trim() + "," + flangeComBox2.getEditor().getText().trim() + "," + flangeComBox3.getEditor().getText().trim() + "," + flangeComBox4.getEditor().getText().trim();
        String flexs = flexPipeComBox1.getEditor().getText().trim() + "," + flexPipeComBox2.getEditor().getText().trim() + "," + flexPipeComBox3.getEditor().getText().trim() + "," + flexPipeComBox4.getEditor().getText().trim();
        String hangers = hangerComBox1.getEditor().getText().trim() + "," + hangerComBox2.getEditor().getText().trim() + "," + hangerComBox3.getEditor().getText().trim() + "," + hangerComBox4.getEditor().getText().trim();
        String mufflers = mufflerComBox1.getEditor().getText().trim() + "," + mufflerComBox2.getEditor().getText().trim() + "," + mufflerComBox3.getEditor().getText().trim() + "," + mufflerComBox4.getEditor().getText().trim();
        String nuts = nutComBox1.getEditor().getText().trim() + "," + nutComBox2.getEditor().getText().trim() + "," + nutComBox3.getEditor().getText().trim() + "," + nutComBox4.getEditor().getText().trim();
        String pipes = pipeComBox1.getEditor().getText().trim() + "," + pipeComBox2.getEditor().getText().trim() + "," + pipeComBox3.getEditor().getText().trim() + "," + pipeComBox4.getEditor().getText().trim();
        String resonators = resonatorComBox1.getEditor().getText().trim() + "," + resonatorComBox2.getEditor().getText().trim() + "," + resonatorComBox3.getEditor().getText().trim() + "," + resonatorComBox4.getEditor().getText().trim();
        String rubbers = rubberComBox1.getEditor().getText().trim() + "," + rubberComBox2.getEditor().getText().trim() + "," + rubberComBox3.getEditor().getText().trim() + "," + rubberComBox4.getEditor().getText().trim();
        String tips = tipComBox1.getEditor().getText().trim() + "," + tipComBox2.getEditor().getText().trim() + "," + tipComBox3.getEditor().getText().trim() + "," + tipComBox4.getEditor().getText().trim();
        String washers = washerComBox1.getEditor().getText().trim() + "," + washerComBox2.getEditor().getText().trim() + "," + washerComBox3.getEditor().getText().trim() + "," + washerComBox4.getEditor().getText().trim();
        String miscs = miscPartText1.getText() + "," + miscPartText2.getText() + "," + miscPartText3.getText() + "," + miscPartText4.getText();

        String boltsQTY = boltQtyText1.getText() + "," + boltQtyText2.getText() + "," + boltQtyText3.getText() + "," + boltQtyText4.getText();
        String catsQTY = catQtyText1.getText() + "," + catQtyText2.getText() + "," + catQtyText3.getText() + "," + catQtyText4.getText();
        String clampsQTY = clampQtyText1.getText() + "," + clampQtyText2.getText() + "," + clampQtyText3.getText() + "," + clampQtyText4.getText();
        String elbowsQTY = elbowQtyText1.getText() + "," + elbowQtyText2.getText() + "," + elbowQtyText3.getText() + "," + elbowQtyText4.getText();
        String flangesQTY = flangeQtyText1.getText() + "," + flangeQtyText2.getText() + "," + flangeQtyText3.getText() + "," + flangeQtyText4.getText();
        String flexsQTY = flexPipeQtyText1.getText() + "," + flexPipeQtyText2.getText() + "," + flexPipeQtyText3.getText() + "," + flexPipeQtyText4.getText();
        String hangersQTY = hangerQtyText1.getText() + "," + hangerQtyText2.getText() + "," + hangerQtyText3.getText() + "," + hangerQtyText4.getText();
        String mufflersQTY = mufflerQtyText1.getText() + "," + mufflerQtyText2.getText() + "," + mufflerQtyText3.getText() + "," + mufflerQtyText4.getText();
        String nutsQTY = nutQtyText1.getText() + "," + nutQtyText2.getText() + "," + nutQtyText3.getText() + "," + nutQtyText4.getText();
        String pipesQTY = pipeQtyText1.getText() + "," + pipeQtyText2.getText() + "," + pipeQtyText3.getText() + "," + pipeQtyText4.getText();
        String resonatorsQTY = resonatorQtyText1.getText() + "," + resonatorQtyText2.getText() + "," + resonatorQtyText3.getText() + "," + resonatorQtyText4.getText();
        String rubbersQTY = rubberQtyText1.getText() + "," + rubberQtyText2.getText() + "," + rubberQtyText3.getText() + "," + rubberQtyText4.getText();
        String tipsQTY = tipQtyText1.getText() + "," + tipQtyText2.getText() + "," + tipQtyText3.getText() + "," + tipQtyText4.getText();
        String washersQTY = washerQtyText1.getText() + "," + washerQtyText2.getText() + "," + washerQtyText3.getText() + "," + washerQtyText4.getText();
        String miscPrice = miscPriceText1.getText() + "," + miscPriceText2.getText() + "," + miscPriceText3.getText() + "," + miscPriceText4.getText();

        String cur1, cur2, cur3, cur4;

        if(miscRadBtnCAD1.isSelected())
        {
            cur1 = "CAD";
        }
        else
        {
            cur1 = "USD";
        }
        if(miscRadBtnCAD2.isSelected())
        {
            cur2 = "CAD";
        }
        else
        {
            cur2 = "USD";
        }
        if(miscRadBtnCAD3.isSelected())
        {
            cur3 = "CAD";
        }
        else
        {
            cur3 = "USD";
        }
        if(miscRadBtnCAD4.isSelected())
        {
            cur4 = "CAD";
        }
        else
        {
            cur4 = "USD";
        }

        String miscCurr = cur1 + "," + cur2 + "," + cur3 + "," + cur4;

        try {
            if(!(kitNameText.getText().equals(""))) {
                kitTableManager.add(kitNameText.getText().trim(), bolts, boltsQTY, cats, catsQTY, clamps, clampsQTY, elbows, elbowsQTY, flanges, flangesQTY, flexs, flexsQTY, hangers, hangersQTY, mufflers, mufflersQTY,
                        nuts, nutsQTY, pipes, pipesQTY, resonators, resonatorsQTY, rubbers, rubbersQTY, tips, tipsQTY, washers, washersQTY, miscs, miscPrice, miscCurr,
                        Double.parseDouble(labourCostTextCAD.getText()), Double.parseDouble(labourCostTextUSD.getText()), Double.parseDouble(CADTotalLabel.getText()), Double.parseDouble(USDTotalLabel.getText()));
                displayAlert("Kit Added!");
            }
            else {
                displayAlert("Name the Kit!");
            }
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Kit Names must be unique");
            }
            else
            {
                displayAlert("Error :" + e);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        /*
        ObservableList miscData = FXCollections.observableArrayList();
        miscData.add("Nuts");
        miscData.add("Pipe");
        miscData.add("Elbow");
        miscData.add("Flange");
        miscData.add("Hanger");
        miscData.add("Muffler");
        miscData.add("Resonator");
        miscData.add("Cat");
        miscData.add("FlexPipe");
        miscData.add("Bolt");
        miscData.add("Washer");
        miscData.add("Rubber");
        miscData.add("Tip");
        miscData.add("Clamp");
        miscPartComBox1.setItems(miscData);
        miscPartComBox2.setItems(miscData);
        miscPartComBox3.setItems(miscData);
        miscPartComBox4.setItems(miscData);
         */

        nutQtyText1.setText("0");
        pipeQtyText1.setText("0");
        elbowQtyText1.setText("0");
        flangeQtyText1.setText("0");
        hangerQtyText1.setText("0");
        mufflerQtyText1.setText("0");
        resonatorQtyText1.setText("0");
        catQtyText1.setText("0");
        flexPipeQtyText1.setText("0");
        boltQtyText1.setText("0");
        washerQtyText1.setText("0");
        rubberQtyText1.setText("0");
        tipQtyText1.setText("0");
        clampQtyText1.setText("0");

        nutQtyText2.setText("0");
        pipeQtyText2.setText("0");
        elbowQtyText2.setText("0");
        flangeQtyText2.setText("0");
        hangerQtyText2.setText("0");
        mufflerQtyText2.setText("0");
        resonatorQtyText2.setText("0");
        catQtyText2.setText("0");
        flexPipeQtyText2.setText("0");
        boltQtyText2.setText("0");
        washerQtyText2.setText("0");
        rubberQtyText2.setText("0");
        tipQtyText2.setText("0");
        clampQtyText2.setText("0");

        nutQtyText3.setText("0");
        pipeQtyText3.setText("0");
        elbowQtyText3.setText("0");
        flangeQtyText3.setText("0");
        hangerQtyText3.setText("0");
        mufflerQtyText3.setText("0");
        resonatorQtyText3.setText("0");
        catQtyText3.setText("0");
        flexPipeQtyText3.setText("0");
        boltQtyText3.setText("0");
        washerQtyText3.setText("0");
        rubberQtyText3.setText("0");
        tipQtyText3.setText("0");
        clampQtyText3.setText("0");

        nutQtyText4.setText("0");
        pipeQtyText4.setText("0");
        elbowQtyText4.setText("0");
        flangeQtyText4.setText("0");
        hangerQtyText4.setText("0");
        mufflerQtyText4.setText("0");
        resonatorQtyText4.setText("0");
        catQtyText4.setText("0");
        flexPipeQtyText4.setText("0");
        boltQtyText4.setText("0");
        washerQtyText4.setText("0");
        rubberQtyText4.setText("0");
        tipQtyText4.setText("0");
        clampQtyText4.setText("0");

        /*
        miscQtyText1.setText("0");
        miscQtyText2.setText("0");
        miscQtyText3.setText("0");
        miscQtyText4.setText("0");
         */

        miscPriceText1.setText("0");
        miscPriceText2.setText("0");
        miscPriceText3.setText("0");
        miscPriceText4.setText("0");

        labourCostTextCAD.setText("0");
        labourCostTextUSD.setText("0");



    }
}
