package ultimateInventory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
                        + "NutID CHAR(15),"
                        + "Price INT,"
                        + "Manufacturer CHAR(30)" + ")");
            }
        }
    }
    public void addNewNut()
    {

    }
    public void editNut()
    {

    }
    public void deleteNut()
    {

    }
}
