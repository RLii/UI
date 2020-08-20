package ultimateInventory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.xml.transform.Result;
import java.sql.*;

public class KitTableManager {

    Connection connection;

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

    public KitTableManager(Connection conn, boolean reset) throws SQLException {
        connection = conn;

        nutsTableManager = new NutsTableManager(connection,false);
        pipeTableManager = new PipeTableManager(connection,false);
        elbowTableManager = new ElbowTableManager(connection, false);
        flangeTableManager = new FlangeTableManager(connection, false);
        hangerTableManager = new HangerTableManager(connection, false);
        mufflerTableManager = new MufflerTableManager(connection, false);
        resonatorTableManager = new ResonatorTableManager(connection, false);
        catTableManager = new CatTableManager(connection, false);
        flexPipeTableManager = new FlexPipeTableManager(connection, false);
        boltTableManager = new BoltTableManager(connection, false);
        washerTableManager = new WasherTableManager(connection, false);
        rubberTableManager = new RubberTableManager(connection, false);
        tipTableManager = new TipTableManager(connection, false);
        clampTableManager = new ClampTableManager(connection, false);
        if(reset)
        {
            Statement stmt = connection.createStatement();
            try
            {
                stmt.execute("DROP TABLE Kits");
            }
            catch(SQLException ex)
            {

            }
            finally
            {
                stmt.execute("CREATE TABLE Kits ("
                        + "ID CHAR(30) NOT NULL PRIMARY KEY,"
                        + "Bolt CHAR(30),"
                        + "BoltQTY CHAR(30),"
                        + "Cat CHAR (30),"
                        + "CatQTY CHAR (30),"
                        + "Clamp CHAR (30),"
                        + "ClampQTY CHAR (30),"
                        + "Elbow CHAR (30),"
                        + "ElbowQTY CHAR (30),"
                        + "Flange CHAR (30),"
                        + "FlangeQTY CHAR (30),"
                        + "FlexPipe CHAR(30),"
                        + "FlexPipeQTY CHAR(30),"
                        + "Hanger CHAR(30),"
                        + "HangerQTY CHAR(30),"
                        + "Muffler CHAR(30),"
                        + "MufflerQTY CHAR(30),"
                        + "Nut CHAR(30),"
                        + "NutQTY CHAR(30),"
                        + "Pipe CHAR(30),"
                        + "PipeLENGTH CHAR(30),"
                        + "Resonator CHAR(30),"
                        + "ResonatorQTY CHAR(30),"
                        + "Rubber CHAR(30),"
                        + "RubberQTY CHAR(30),"
                        + "Tip CHAR(30),"
                        + "TipQTY CHAR(30),"
                        + "Washer CHAR (30),"
                        + "WasherQTY CHAR (30),"
                        + "Misc CHAR (30),"
                        + "MiscPrice CHAR (30),"
                        + "labourCAD DOUBLE ,"
                        + "labourUSD DOUBLE,"
                        + "CostCAD DOUBLE,"
                        + "CostUSD DOUBLE" +")");
            }
        }
    }
    public void add(String name, String bolt, String boltQTY, String cat, String catQTY, String clamp, String clampQTY, String elbow, String elbowQTY, String flange, String flangeQTY, String flex, String flexQTY,
    String hanger, String hangerQTY, String muffler, String mufflerQTY, String nut, String nutQTY, String pipe, String pipeLENGTH, String resonator, String resonatorQTY, String rubber, String rubberQTY,
                    String tip, String tipQTY, String washer, String washerQTY, String misc, String miscPRICE, double cadLabour, double usdLabour, double costCad, double costUsd) throws SQLException
    {
        String sql = "INSERT INTO Kits(ID, Bolt, BoltQTY, Cat, CatQTY, Clamp, clampQTY, Elbow, ElbowQTY, Flange, FlangeQTY, FlexPipe, FlexPipeQTY, Hanger, HangerQTY, Muffler, MufflerQTY," +
                "Nut, NutQTY, Pipe, PipeLENGTH, Resonator, ResonatorQTY, Rubber, RubberQTY, Tip, TipQTY, Washer, WasherQTY, Misc, MiscPrice, labourCAD, labourUSD, CostCAD, CostUSD) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement prep = connection.prepareStatement(sql);
        prep.setString(1, name);
        prep.setString(2, bolt);
        prep.setString(3, boltQTY);
        prep.setString(4, cat);
        prep.setString(5, catQTY);
        prep.setString(6, clamp);
        prep.setString(7, clampQTY);
        prep.setString(8, elbow);
        prep.setString(9, elbowQTY);
        prep.setString(10, flange);
        prep.setString(11, flangeQTY);
        prep.setString(12, flex);
        prep.setString(13, flexQTY);
        prep.setString(14, hanger);
        prep.setString(15, hangerQTY);
        prep.setString(16, muffler);
        prep.setString(17, mufflerQTY);
        prep.setString(18, nut);
        prep.setString(19, nutQTY);
        prep.setString(20, pipe);
        prep.setString(21, pipeLENGTH);
        prep.setString(22, resonator);
        prep.setString(23, resonatorQTY);
        prep.setString(24, rubber);
        prep.setString(25, rubberQTY);
        prep.setString(26, tip);
        prep.setString(27, tipQTY);
        prep.setString(28, washer);
        prep.setString(29, washerQTY);
        prep.setString(30, misc);
        prep.setString(31, miscPRICE);
        prep.setDouble(32, cadLabour);
        prep.setDouble(33, usdLabour);
        prep.setDouble(34, costCad);
        prep.setDouble(35, costUsd);
        prep.executeUpdate();
    }
    public void delete(String name) throws SQLException
    {
        String sql = "DELETE FROM Kits WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.executeUpdate();
    }
    public ObservableList<String> getKitNames() throws SQLException
    {
        ObservableList<String> list = FXCollections.observableArrayList();
        ResultSet rs;
        Statement stmt = connection.createStatement();
        rs = stmt.executeQuery("SELECT ID FROM Kits");
        while(rs.next())
        {
            list.add(rs.getString(1));
        }

        return list;
    }
    public String [][] getKitInfo(String name)throws SQLException
    {
        String [][] array = new String[61][5];
        String sql = "SELECT * FROM Kits WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);
        ResultSet rs = stmt.executeQuery();
        rs.next();

        int counter = 1;

        for(int x = 2 ; x<30 ; x = x+2)
        {
            int temp = counter + 4;
            String ids = rs.getString(x);
            String qty = rs.getString(x+1);


            while(counter < temp) {
                int commaPos = ids.indexOf(",");
                if (commaPos != -1) {
                    array[counter][0] = ids.substring(0, commaPos);
                    ids = ids.substring(commaPos + 1, ids.length());
                } else {
                    array[counter][0] = ids;
                }

                commaPos = qty.indexOf(",");
                if (commaPos != -1) {
                    array[counter][1] = qty.substring(0, commaPos);
                    qty = qty.substring(commaPos + 1, qty.length());
                } else {
                    array[counter][1] = qty;
                }

                if(!(array[counter][0].trim().equals(""))){
                    if (counter < 5) {
                        array[counter][2] = Double.toString(boltTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(boltTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(boltTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 9) {
                        array[counter][2] = Double.toString(catTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(catTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(catTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 13) {
                        array[counter][2] = Double.toString(clampTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(clampTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(clampTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 17) {
                        array[counter][2] = Double.toString(elbowTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(elbowTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(elbowTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 21) {
                        array[counter][2] = Double.toString(flangeTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(flangeTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(flangeTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 25) {
                        array[counter][2] = Double.toString(flexPipeTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(flexPipeTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(flexPipeTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 29) {
                        array[counter][2] = Double.toString(hangerTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(hangerTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(hangerTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 33) {
                        array[counter][2] = Double.toString(mufflerTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(mufflerTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(mufflerTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 37) {
                        array[counter][2] = Double.toString(nutsTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(nutsTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(nutsTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 41) {
                        array[counter][2] = Double.toString(pipeTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(pipeTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(pipeTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 45) {
                        array[counter][2] = Double.toString(resonatorTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(resonatorTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(resonatorTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 49) {
                        array[counter][2] = Double.toString(rubberTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(rubberTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(rubberTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 53) {
                        array[counter][2] = Double.toString(tipTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(tipTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(tipTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    } else if (counter < 57) {
                        array[counter][2] = Double.toString(washerTableManager.getPrice(array[counter][0]));
                        array[counter][3] = Double.toString(washerTableManager.getPrice(array[counter][0]) * Double.parseDouble(array[counter][1]));
                        if(washerTableManager.isCad(array[counter][0]))
                        {
                            array[counter][4] = "CAD";
                        }
                        else
                        {
                            array[counter][4] = "USD";
                        }
                    }
                }
                else
                {
                    array[counter][2] = "";
                    array[counter][3] = "";
                    array[counter][4] = "";
                }
                counter++;
            }
        }
        String ids = rs.getString(30);
        String qty = rs.getString(31);

        for(int x = 0; x < 4; x++) {
            int commaPos = ids.indexOf(",");
            if (commaPos != -1) {
                array[counter][0] = ids.substring(0, commaPos);
                ids = ids.substring(commaPos + 1, ids.length());
            } else {
                array[counter][3] = ids;
            }

            commaPos = qty.indexOf(",");
            if (commaPos != -1) {
                array[counter][2] = qty.substring(0, commaPos);
                qty = qty.substring(commaPos + 1, qty.length());
            } else {
                array[counter][3] = qty;
            }
            array[counter][1] = "";
            array[counter][2] = "";
            counter++;

        }
        array[0][0] = Double.toString(rs.getDouble(32)) + " cad Labour";
        array[0][1] = Double.toString(rs.getDouble(33)) + " usd Labour";
        array[0][2] = Double.toString(rs.getDouble(34)) + " cad Total";
        array[0][3] = Double.toString(rs.getDouble(35)) + " usd Total";

        return array;
    }
}
