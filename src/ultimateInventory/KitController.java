package ultimateInventory;
import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.*;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class KitController implements Initializable {

    KitTableManager kitTableManager;

    @FXML
    ComboBox kitNameComBox;
    @FXML
    TextField pathText;

    public void setModel(KitTableManager kit)
    {
        kitTableManager = kit;
        buildComBoxData();
        try{
            pathText.setText(kitTableManager.getOutputPath().trim());
        }
        catch(Exception e)
        {
            displayAlert("No Paths Saved!");
        }
    }
    public void buildComBoxData()
    {
        ObservableList list = FXCollections.observableArrayList();
        try
        {
            list.addAll(kitTableManager.getKitNames());
        }
        catch(Exception e)
        {

        }
        Collections.sort(list);
        kitNameComBox.setItems(list);
        kitNameComBox.getSelectionModel().selectFirst();
    }
    public void exportKitInfo()
    {
        try
        {
            //Create blank workbook
            XSSFWorkbook workbook = new XSSFWorkbook();

            //Create a blank sheet
            XSSFSheet spreadsheet = workbook.createSheet( String.format("%s Info", kitNameComBox.getValue().toString()));

            //Create row object
            XSSFRow row;

            String [][] array = kitTableManager.getKitInfo(kitNameComBox.getValue().toString().trim());

            //This data needs to be written (Object[])
            Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
            empinfo.put( "1", new Object[] {
                    "Part Type", "Part ID", "Quantity" , "Price per unit", "Subtotal", "Currency", String.format("KitName: %s", kitNameComBox.getValue().toString()) });

            empinfo.put( "2", new Object[] {
                    "Bolt1", array[1][0], array[1][1], array[1][2], array[1][3] ,array[1][4] });

            empinfo.put( "3", new Object[] {
                    "Bolt2", array[2][0], array[2][1], array[2][2], array[2][3] ,array[2][4] });

            empinfo.put( "4", new Object[] {
                    "Bolt3", array[3][0], array[3][1], array[3][2], array[3][3] ,array[3][4] });

            empinfo.put( "5", new Object[] {
                    "Bolt4", array[4][0], array[4][1], array[4][2], array[4][3] ,array[4][4] });

            empinfo.put( "6", new Object[] {
                    "Cat1", array[5][0], array[5][1], array[5][2], array[5][3] ,array[5][4] });

            empinfo.put( "7", new Object[] {
                    "Cat2", array[6][0], array[6][1], array[6][2], array[6][3] ,array[6][4] });

            empinfo.put( "8", new Object[] {
                    "Cat3", array[7][0], array[7][1], array[7][2], array[7][3] ,array[7][4] });

            empinfo.put( "9", new Object[] {
                    "Cat4", array[8][0], array[8][1], array[8][2], array[8][3] ,array[8][4] });

            empinfo.put( "10", new Object[] {
                    "Clamp1", array[9][0], array[9][1], array[9][2], array[9][3] ,array[9][4] });

            empinfo.put( "11", new Object[] {
                    "Clamp2", array[10][0], array[10][1], array[10][2], array[10][3] ,array[10][4] });

            empinfo.put( "12", new Object[] {
                    "Clamp3", array[11][0], array[11][1], array[11][2], array[11][3] ,array[11][4] });

            empinfo.put( "13", new Object[] {
                    "Clamp4", array[12][0], array[12][1], array[12][2], array[12][3] ,array[12][4] });

            empinfo.put( "14", new Object[] {
                    "Elbow1", array[13][0], array[13][1], array[13][2], array[13][3] ,array[13][4] });

            empinfo.put( "15", new Object[] {
                    "Elbow2", array[14][0], array[14][1], array[14][2], array[14][3] ,array[14][4] });

            empinfo.put( "16", new Object[] {
                    "Elbow3", array[15][0], array[15][1], array[15][2], array[15][3] ,array[15][4] });

            empinfo.put( "17", new Object[] {
                    "Elbow4", array[16][0], array[16][1], array[16][2], array[16][3] ,array[16][4] });

            empinfo.put( "18", new Object[] {
                    "Flange1", array[17][0], array[17][1], array[17][2], array[17][3] ,array[17][4] });

            empinfo.put( "19", new Object[] {
                    "Flange2", array[18][0], array[18][1], array[18][2], array[18][3] ,array[18][4] });

            empinfo.put( "20", new Object[] {
                    "Flange3", array[19][0], array[19][1], array[19][2], array[19][3] ,array[19][4] });

            empinfo.put( "21", new Object[] {
                    "Flange4", array[20][0], array[20][1], array[20][2], array[20][3] ,array[20][4] });

            empinfo.put( "22", new Object[] {
                    "FlexPipe1", array[21][0], array[21][1], array[21][2], array[21][3] , array[21][4] });

            empinfo.put( "23", new Object[] {
                    "FlexPipe2", array[22][0], array[22][1], array[22][2], array[22][3] , array[22][4] });

            empinfo.put( "24", new Object[] {
                    "FlexPipe3", array[23][0], array[23][1], array[23][2], array[23][3] , array[23][4] });

            empinfo.put( "25", new Object[] {
                    "FlexPipe4", array[24][0], array[24][1], array[24][2], array[24][3] , array[24][4] });

            empinfo.put( "26", new Object[] {
                    "Hanger1", array[25][0], array[25][1], array[25][2], array[25][3] ,array[25][4] });

            empinfo.put( "27", new Object[] {
                    "Hanger2", array[26][0], array[26][1], array[26][2], array[26][3] ,array[26][4] });

            empinfo.put( "28", new Object[] {
                    "Hanger3", array[27][0], array[27][1], array[27][2], array[27][3] ,array[27][4] });

            empinfo.put( "29", new Object[] {
                    "Hanger4", array[28][0], array[28][1], array[28][2], array[28][3] ,array[28][4] });

            empinfo.put( "30", new Object[] {
                    "Muffler1", array[29][0], array[29][1], array[29][2], array[29][3] , array[29][4] });

            empinfo.put( "31", new Object[] {
                    "Muffler2", array[30][0], array[30][1], array[30][2], array[30][3] , array[30][4] });

            empinfo.put( "32", new Object[] {
                    "Muffler3", array[31][0], array[31][1], array[31][2], array[31][3] , array[31][4] });

            empinfo.put( "33", new Object[] {
                    "Muffler4", array[32][0], array[32][1], array[32][2], array[32][3] , array[32][4] });

            empinfo.put( "34", new Object[] {
                    "Nut1", array[33][0], array[33][1], array[33][2], array[33][3] ,array[33][4] });

            empinfo.put( "35", new Object[] {
                    "Nut2", array[34][0], array[34][1], array[34][2], array[34][3] ,array[34][4] });

            empinfo.put( "36", new Object[] {
                    "Nut3", array[35][0], array[35][1], array[35][2], array[35][3] ,array[35][4] });

            empinfo.put( "37", new Object[] {
                    "Nut4", array[36][0], array[36][1], array[36][2], array[36][3] ,array[36][4] });

            empinfo.put( "38", new Object[] {
                    "Pipe1", array[37][0], array[37][1], array[37][2], array[37][3] ,array[37][4] });

            empinfo.put( "39", new Object[] {
                    "Pipe2", array[38][0], array[38][1], array[38][2], array[38][3] ,array[38][4] });

            empinfo.put( "40", new Object[] {
                    "Pipe3", array[39][0], array[39][1], array[39][2], array[39][3] ,array[39][4] });

            empinfo.put( "41", new Object[] {
                    "Pipe4", array[40][0], array[40][1], array[40][2], array[40][3] ,array[40][4] });

            empinfo.put( "42", new Object[] {
                    "Resonator1", array[41][0], array[41][1], array[41][2], array[41][3] , array[41][4] });

            empinfo.put( "43", new Object[] {
                    "Resonator2", array[42][0], array[42][1], array[42][2], array[42][3] , array[42][4] });

            empinfo.put( "44", new Object[] {
                    "Resonator3", array[43][0], array[43][1], array[43][2], array[43][3] , array[43][4] });

            empinfo.put( "45", new Object[] {
                    "Resonator4", array[44][0], array[44][1], array[44][2], array[44][3] , array[44][4] });

            empinfo.put( "46", new Object[] {
                    "Rubber1", array[45][0], array[45][1], array[45][2], array[45][3] ,array[45][4] });

            empinfo.put( "47", new Object[] {
                    "Rubber2", array[46][0], array[46][1], array[46][2], array[46][3] ,array[46][4] });

            empinfo.put( "48", new Object[] {
                    "Rubber3", array[47][0], array[47][1], array[47][2], array[47][3] ,array[47][4] });

            empinfo.put( "49", new Object[] {
                    "Rubber4", array[48][0], array[48][1], array[48][2], array[48][3] ,array[48][4] });

            empinfo.put( "50", new Object[] {
                    "Tip1", array[49][0], array[49][1], array[49][2], array[49][3] ,array[49][4] });

            empinfo.put( "51", new Object[] {
                    "Tip2", array[50][0], array[50][1], array[50][2], array[50][3] ,array[50][4] });

            empinfo.put( "52", new Object[] {
                    "Tip3", array[51][0], array[51][1], array[51][2], array[51][3] ,array[51][4] });

            empinfo.put( "53", new Object[] {
                    "Tip4", array[52][0], array[52][1], array[52][2], array[52][3] ,array[52][4] });

            empinfo.put( "54", new Object[] {
                    "Washer1", array[53][0], array[53][1], array[53][2], array[53][3] ,array[53][4] });

            empinfo.put( "55", new Object[] {
                    "Washer2", array[54][0], array[54][1], array[54][2], array[54][3] ,array[54][4] });

            empinfo.put( "56", new Object[] {
                    "Washer3", array[55][0], array[55][1], array[55][2], array[55][3] ,array[55][4] });

            empinfo.put( "57", new Object[] {
                    "Washer4", array[56][0], array[56][1], array[56][2], array[56][3] ,array[56][4] });

            empinfo.put( "58", new Object[] {
                    "Misc1", array[57][0], array[57][1], array[57][2], array[57][3] ,array[57][4] });

            empinfo.put( "59", new Object[] {
                    "Misc2", array[58][0], array[58][1], array[58][2], array[58][3] ,array[58][4] });

            empinfo.put( "60", new Object[] {
                    "Misc3", array[59][0], array[59][1], array[59][2], array[59][3] ,array[59][4] });

            empinfo.put( "61", new Object[] {
                    "Misc4", array[60][0], array[60][1], array[60][2], array[60][3] ,array[60][4] });

            empinfo.put( "62", new Object[] {
                    "", array[0][0],"", array[0][1] });

            empinfo.put( "63", new Object[] {
                    "", array[0][2],"", array[0][3] });

            //Iterate over data and write to sheet
            int rowid = 0;

            for (int key = 1; key < 58; key ++) {
                Object [] objectArr = empinfo.get(Integer.toString(key));
                int cellid = 0;

                if(!(Objects.toString(objectArr[2]).trim().equals("0"))) {
                    row = spreadsheet.createRow(rowid++);
                    for (Object obj : objectArr) {
                            Cell cell = row.createCell(cellid++);
                            cell.setCellValue((String) obj);
                    }
                }
            }
            for(int key = 58; key < 62; key++)
            {
                Object [] objectArr = empinfo.get(Integer.toString(key));
                int cellid = 0;

                if(!((Objects.toString(objectArr[4]).trim().equals("0")) || (Objects.toString(objectArr[1]).trim().equals("")))) {
                    row = spreadsheet.createRow(rowid++);
                    for (Object obj : objectArr) {
                        Cell cell = row.createCell(cellid++);
                        cell.setCellValue((String) obj);
                    }
                }
            }
            for(int key = 62; key < 64; key++)
            {
                Object [] objectArr = empinfo.get(Integer.toString(key));
                int cellid = 0;
                row = spreadsheet.createRow(rowid++);
                for (Object obj : objectArr) {
                    Cell cell = row.createCell(cellid++);
                    cell.setCellValue((String) obj);
                }
            }


            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(
                        new File(String.format(String.format("%s",pathText.getText())+"\\%s.xlsx",kitNameComBox.getValue().toString().trim())));

            workbook.write(out);
            out.close();
            displayAlert("Kit Exported");
        }
        catch(Exception e)
        {
            if(e instanceof SQLException)
            {
                displayAlert("Error : "+e);
            }
            else
            {
                displayAlert("Error : "+e);
            }
        }
    }

    public void savePath()
    {
        try
        {
            kitTableManager.setOutputPath(pathText.getText());
            displayAlert("Path Saved!");
        }
        catch(Exception e)
        {
            displayAlert("Error: "+e);
        }
    }

    public void deleteKit()
    {
        try {
            kitTableManager.delete(kitNameComBox.getValue().toString().trim());
            buildComBoxData();
            kitNameComBox.getSelectionModel().selectFirst();
            displayAlert("Deleted");
        }
        catch(Exception e)
        {
            displayAlert("delete failed");
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
