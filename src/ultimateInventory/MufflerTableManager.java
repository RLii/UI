package ultimateInventory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class MufflerTableManager {
    Connection connection;
    public MufflerTableManager(Connection conn, boolean reset) throws SQLException {
        connection = conn;
        if(reset)
        {
            Statement stmt = connection.createStatement();
            try
            {
                stmt.execute("DROP TABLE Mufflers");
            }
            catch(SQLException ex)
            {

            }
            finally
            {
                stmt.execute("CREATE TABLE Mufflers ("
                        + "ID CHAR(254) NOT NULL PRIMARY KEY,"
                        + "VendorName CHAR(254),"
                        + "VendorEmail CHAR(254),"
                        + "VendorContact CHAR(254),"
                        + "VendorWebsite CHAR(254),"
                        + "Price DOUBLE,"
                        + "PayMethod CHAR(254),"
                        + "PayTerm CHAR(254),"
                        + "PurchaseDate CHAR(10),"
                        + "Currency CHAR(3),"
                        + "Note VARCHAR (20000)"+ ")");
            }
        }
    }
    public void add(String id, String vName, String vEmail, String vContact, String vWebsite, double price, String pMethod, String pTerm, String date, String curr, String Note) throws SQLException
    {
        String sql = "INSERT INTO Mufflers(ID, VendorName, VendorEmail, VendorContact, VendorWebsite, Price, PayMethod, PayTerm, PurchaseDate, Currency, Note) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement prep = connection.prepareStatement(sql);
        prep.setString(1,id);
        prep.setString(2,vName);
        prep.setString(3,vEmail);
        prep.setString(4,vContact);
        prep.setString(5,vWebsite);
        prep.setDouble(6,price);
        prep.setString(7,pMethod);
        prep.setString(8,pTerm);
        prep.setString(9,date);
        prep.setString(10,curr);
        prep.setString(11,Note);
        prep.executeUpdate();
    }
    public void edit(String id, String vName, String vEmail, String vContact, String vWebsite, double price, String pMethod, String pTerm, String date, String curr, String Note)throws SQLException
    {
        String sql ="UPDATE Mufflers SET VendorName = ?, VendorEmail = ?, VendorContact = ?, VendorWebsite = ?, Price = ?, PayMethod = ?, PayTerm = ?, PurchaseDate = ?, Currency = ?, Note = ? WHERE ID = ?";
        PreparedStatement prep = connection.prepareStatement(sql);
        prep.setString(1,vName);
        prep.setString(2,vEmail);
        prep.setString(3,vContact);
        prep.setString(4,vWebsite);
        prep.setDouble(5,price);
        prep.setString(6,pMethod);
        prep.setString(7,pTerm);
        prep.setString(8,date);
        prep.setString(9,curr);
        prep.setString(10,Note);
        prep.setString(11,id);
        prep.executeUpdate();


    }
    public void delete(String id) throws SQLException
    {
        String sql = "DELETE FROM Mufflers WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,id);
        stmt.executeUpdate();
    }
    public ObservableList<String> getIdNames() throws SQLException
    {
        ObservableList<String> list = FXCollections.observableArrayList();
        ResultSet rs;
        Statement stmt = connection.createStatement();
        rs = stmt.executeQuery("SELECT ID FROM Mufflers");
        while(rs.next())
        {
            list.add(rs.getString(1).trim());
        }

        return list;
    }
    public String [] getRow(String id) throws SQLException
    {
        String sql = "SELECT * FROM Mufflers WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        String [] array = new String [10];
        for(int x = 0; x< 10; x++)
        {
            array[x] = rs.getString(x+2);
        }
        return array;
    }
    public double getPrice(String id) throws SQLException
    {
        String sql = "SELECT Price FROM Mufflers WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getDouble(1);
    }
    public boolean isCad(String id) throws SQLException
    {
        String sql = "SELECT Currency FROM Mufflers WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        String curr = rs.getString(1);
        if(curr.equals("CAD"))
        {
            return true;
        }
        return false;
    }
}
