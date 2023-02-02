/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import DatabaseCredentials.DatabaseCredentials;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author parve
 */
public class Executioner {
    
     private Connection connection;

    DatabaseCredentials dbc = new DatabaseCredentials();
    String databaseUrl = dbc.getDatabaseUrl();
    String AdminPassword = "123456";
    
    void executeInsertQuery (String query , String successMessage , String failureMessage)
    {
         try {
            connection = DriverManager.getConnection(databaseUrl, "sa", AdminPassword);
            Statement statement;
            statement = connection.createStatement();
            statement.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, successMessage,
                    "Success", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, failureMessage,
                    "Failure!!", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Connection closing failed",
                        "Failure!!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
}
