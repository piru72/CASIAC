/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import DatabaseCredentials.DatabaseCredentials;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parve
 */
public class Executioner {

    private Connection connection;

    DatabaseCredentials dbc = new DatabaseCredentials();
    String databaseUrl = dbc.getDatabaseUrl();
    String AdminPassword = "123456";
    PreparedStatement prepareStatement = null;
    ResultSet result = null;
    Statement statement = null;

    void executeInsertQuery(String query, String successMessage, String failureMessage) {
        try {
            connection = DriverManager.getConnection(databaseUrl, "sa", AdminPassword);
            Statement statement;
            statement = connection.createStatement();
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null, successMessage,
                    "Success", JOptionPane.OK_OPTION);
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

    void executeFindQuery(String query, String successMessage, String failureMessage, String userInput) {
        boolean flag = false;
        try {
            connection = DriverManager.getConnection(databaseUrl, "sa", AdminPassword);
            PreparedStatement prepareStatement = connection.prepareStatement(query);
            result = prepareStatement.executeQuery();
            while (result.next()) {
                int retrievedID = result.getInt("ClientId");
                String ID = Integer.toString(retrievedID);
                if (ID.equals(userInput)) {
                    flag = true;
                    //     break;
                }

            }

        } catch (SQLException ex) {

        }
        if (flag != true) {
            JOptionPane.showMessageDialog(null, failureMessage,
                    "Failure!!", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, failureMessage,
                    "DONE!!", JOptionPane.OK_OPTION);
        }
    }

    int executeFindClientID(String query, String successMessage, String failureMessage, String userInput) {
        boolean flag = false;
        int savedID = -1;
        try {
            connection = DriverManager.getConnection(query);
            PreparedStatement prepareStatement = connection.prepareStatement(query);

            prepareStatement.setString(1, userInput);
            result = prepareStatement.executeQuery();
            if (result.next()) {
                savedID = result.getInt("ClientId");
            }

        } catch (SQLException ex) {
        }
        return savedID;
    }

    void executeTable(String query, String successMessage, String failedMessage,JTable jt) {
       

        try {
            connection = DriverManager.getConnection(databaseUrl, "sa", "123456");
            statement = connection.createStatement();
            result = statement.executeQuery(query);

            while (result.next()) {
                String SID = result.getString("AdvocateId");
                String FirstName = result.getString("FirstName");
                String LastName = result.getString("LastName");
                String Email = result.getString("Email");
                String phoneNumber = result.getString("PhoneNumber");
                String BirthDate = result.getString("DateOfBirth");
                String Gender = result.getString("Gender");
                String address = result.getString("Address_");
                String tbData[] = {SID, FirstName, LastName, Email, phoneNumber, BirthDate, Gender, address};
                DefaultTableModel tblModel = (DefaultTableModel) jt.getModel();
                tblModel.addRow(tbData);
            }
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
    }

}
