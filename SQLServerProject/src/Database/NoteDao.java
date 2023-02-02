/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.INoteDAO;
import DatabaseCredentials.DatabaseCredentials;
import java.sql.Connection;
import model.Note;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author parve
 */
public class NoteDao implements INoteDAO {
    private Connection connection;

    DatabaseCredentials dbc = new DatabaseCredentials();
    String databaseUrl = dbc.getDatabaseUrl();
    String AdminPassword = "123456";

    @Override
    public void createNote(Note note) {
//         String query = "INSERT into Advocate (FirstName,LastName,Email,PhoneNumber,AdvocatePassword,DateOfBirth,Gender,Address_) Values"
//                + " ('" + advocate.getFirstName() + "','" + advocate.getLastName() + "','" + advocate.getEmail() + "','" + advocate.getPhoneNumber()
//                + "','" + advocate.getAdvocatePassword() + "','" + advocate.getDateOfbirth() + "','" + advocate.getGender() + "','" + advocate.getAddress__()+ "' )";
//
//        try {
//            connection = DriverManager.getConnection(databaseUrl, "sa", AdminPassword);
//            Statement statement;
//            statement = connection.createStatement();
//            statement.executeUpdate(query);
//            JOptionPane.showMessageDialog(null, "Signed up for casiac",
//                    "Success", JOptionPane.WARNING_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Sign up failed!!",
//                    "Failure!!", JOptionPane.WARNING_MESSAGE);
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, "Connection closing failed",
//                        "Failure!!", JOptionPane.WARNING_MESSAGE);
//            }
//        }
    }
    
}
