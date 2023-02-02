/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.ITaskDAO;
import DatabaseCredentials.DatabaseCredentials;
import java.sql.Connection;
import model.Task;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author parve
 */
public class TaskDao implements ITaskDAO {
    private Connection connection;

    DatabaseCredentials dbc = new DatabaseCredentials();
    String databaseUrl = dbc.getDatabaseUrl();
    String AdminPassword = "123456";

    @Override
    public void createAdvocate(Task task) {
        String query = "INSERT into Advocate (TaskDetails,Deadline,TaskPriority,LawyerId,TaskStatus,CreatedTime) Values"
                + " ('" + task.getTaskDetails() + "','" + task.getDeadline() + "','" + task.getTaskPriority() + "','" + task.getLawyerId()
                + "','" + task.getTaskStatus() + "','" + task.getCreatedTime() + "' )";
        String successMessage = "Task added!!";
        String failedMessage = "Task adding failed";

        try {
            connection = DriverManager.getConnection(databaseUrl, "sa", AdminPassword);
            Statement statement;
            statement = connection.createStatement();
            statement.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, successMessage,
                    "Success", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sign up failed!!",
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
