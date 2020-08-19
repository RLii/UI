package ultimateInventory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class KitTableManager {

    Connection connection;
    public KitTableManager(Connection conn, boolean reset) throws SQLException {
        connection = conn;
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
                        + "Name CHAR(30) NOT NULL PRIMARY KEY,"
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
                        + "CostCAD DOUBLE,"
                        + "CostUSD DOUBLE" +")");
            }
        }
    }
    public void add(String name, String bolt, String boltQTY, String cat, String catQTY, String clamp, String clampQTY, String elbow, String elbowQTY, String flange, String flangeQTY, String flex, String flexQTY,
    String hanger, String hangerQTY, String muffler, String mufflerQTY, String nut, String nutQTY, String pipe, String pipeLENGTH, String resonator, String resonatorQTY, String rubber, String rubberQTY,
                    String tip, String tipQTY, String washer, String washerQTY, String misc, String miscPRICE, double costCad, double costUsd) throws SQLException
    {
        String sql = "INSERT INTO Kits(Name, Bolt, BoltQTY, Cat, CatQTY, Clamp, clampQTY, Elbow, ElbowQTY, Flange, FlangeQTY, FlexPipe, FlexPipeQTY, Hanger, HangerQTY, Muffler, MufflerQTY," +
                "Nut, NutQTY, Pipe, PipeLENGTH, Resonator, ResonatorQTY, Rubber, RubberQTY, Tip, TipQTY, Washer, WasherQTY, Misc, MiscPrice, CostCAD, CostUSD) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        prep.setDouble(32, costCad);
        prep.setDouble(33, costUsd);
        prep.executeUpdate();
    }
    public void delete(String name) throws SQLException
    {
        String sql = "DELETE FROM Kits WHERE Name = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.executeUpdate();
    }
    public ObservableList<String> getKitNames() throws SQLException
    {
        ObservableList<String> list = FXCollections.observableArrayList();
        ResultSet rs;
        Statement stmt = connection.createStatement();
        rs = stmt.executeQuery("SELECT Name FROM Kits");
        while(rs.next())
        {
            list.add(rs.getString(1));
        }

        return list;
    }
}
