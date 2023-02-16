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
import model.Advocate;

/**
 *
 * @author parve
 */
public class TaskDao extends Executioner implements ITaskDAO {
    
    @Override
    public void createAdvocate(Task task) {
        String query = "INSERT into Tasks (TaskDetails,Deadline,TaskPriority,LawyerId,TaskStatus,CreatedTime) Values"
                + " ('" + task.getTaskDetails() + "','" + task.getDeadline() + "','" + task.getTaskPriority() + "','" + task.getLawyerId()
                + "','" + task.getTaskStatus() + "','"+ task.getCreatedTime() + "' )";
        String successMessage = "Task added!!";
        String failedMessage = "Task adding failed";

       executeInsertQuery(query, successMessage, failedMessage);
    }
      
}
