
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author parvez
 */
public class ConnectMSSQL {

    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            /* URL GIVEN IN THE INSTRUCTION .
             String url = "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor\""
             HASN'T WORKED FOR ME . 
             SO I UPDATED THE URL LIKE BELOW
             */
            
            String port = "1433"; // The tcp port number that was setted on the SQL SERVER NETWORK CONFIGURATION -> TCP/IP -> IP ADDRESSESS -> IPAIII
            String server = "localhost"; // AS THE PROJECT IS RUNNING IN lOCALHOST
            String databaseName = "ProjectDB"; // The name of the database that you created using the MSSQL STUDIO
            String password = "123456"; // The password you had setted for sa
            
            
            String url = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true;";
            

            Connection connection = DriverManager.getConnection(url, "sa", password);
            System.out.println("DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select FirstName from Customer");

            while (resultSet.next()) {
                System.out.println("Customer NAME:"
                        + resultSet.getString("FirstName"));
            }
            connection.close();

            System.out.println("Connection Closed. Thank you");

        } catch (ClassNotFoundException ex) {

            ex.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }

    }

}
