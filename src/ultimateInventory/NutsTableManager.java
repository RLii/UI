package ultimateInventory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.apache.derby.client.am.SqlException;

import javax.xml.transform.Result;
import java.sql.*;

public class NutsTableManager {
    Connection connection;
    public NutsTableManager(Connection conn, boolean reset) throws SQLException {
        connection = conn;
        if(reset)
        {
            Statement stmt = connection.createStatement();
            try
            {
                stmt.execute("DROP TABLE Nuts");
            }
            catch(SQLException ex)
            {

            }
            finally
            {
                stmt.execute("CREATE TABLE Nuts ("
                        + "ID CHAR(30) NOT NULL PRIMARY KEY,"
                        + "VendorName CHAR(30),"
                        + "VendorEmail CHAR (30),"
                        + "VendorContact CHAR (30),"
                        + "VendorWebsite CHAR (30),"
                        + "Price INT,"
                        + "PayMethod CHAR(30),"
                        + "PayTerm CHAR(30),"
                        + "PurchaseDate CHAR(10),"
                        + "Currency CHAR(3),"
                        + "Note VARCHAR (20000)"+ ")");
            }
        }
    }
    public void add(String id, String vName, String vEmail, String vContact, String vWebsite, int price, String pMethod, String pTerm, String date, String curr, String Note) throws SQLException
    {
        String sql = "INSERT INTO Nuts(ID, VendorName, VendorEmail, VendorContact, VendorWebsite, Price, PayMethod, PayTerm, PurchaseDate, Currency, Note) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement prep = connection.prepareStatement(sql);
        prep.setString(1,id);
        prep.setString(2,vName);
        prep.setString(3,vEmail);
        prep.setString(4,vContact);
        prep.setString(5,vWebsite);
        prep.setInt(6,price);
        prep.setString(7,pMethod);
        prep.setString(8,pTerm);
        prep.setString(9,date);
        prep.setString(10,curr);
        prep.setString(11,Note);
        prep.executeUpdate();
    }
    public void edit(String id, String vName, String vEmail, String vContact, String vWebsite, int price, String pMethod, String pTerm, String date, String curr, String Note)throws SQLException
    {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("UPDATE Nuts SET Price ="+price+"," +
                "VendorName ="+vName+"," +
                "VendorEmail = "+vEmail+"," +
                "VendorContact ="+vContact+"," +
                "VendowWebsite ="+vWebsite+"," +
                "Currency ="+curr+"," +
                "PurchaseDate="+date+"," +
                "PayTerm = "+pTerm+"," +
                "PayMethod ="+pMethod+"," +
                "Note ="+Note+"" +
                " WHERE ID = '"+id+"'");


    }
    public void delete(String id) throws SQLException
    {
        String sql = "DELETE FROM Nuts WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,id);
        stmt.executeUpdate();
    }
    public ObservableList<String> getIdNames() throws SQLException
    {
        ObservableList<String> list = FXCollections.observableArrayList();
        ResultSet rs;
        Statement stmt = connection.createStatement();
        rs = stmt.executeQuery("SELECT ID FROM Nuts");
        while(rs.next())
        {
            list.add(rs.getString(1));
        }

        return list;
    }
    public String [] getRow(String id) throws SQLException
    {
        String sql = "SELECT * FROM Nuts WHERE ID = ?";
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
}
