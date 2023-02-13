/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.ITaskDAO;
import model.Task;

/**
 *
 * @author parve
 */
public class TaskDao extends Executioner implements ITaskDAO {
    
    @Override
    public void createAdvocate(Task task) {
        String query = "INSERT into Advocate (TaskDetails,Deadline,TaskPriority,LawyerId,TaskStatus,CreatedTime) Values"
                + " ('" + task.getTaskDetails() + "','" + task.getDeadline() + "','" + task.getTaskPriority() + "','" + task.getLawyerId()
                + "','" + task.getTaskStatus() + "','" + task.getCreatedTime() + "' )";
        String successMessage = "Task added!!";
        String failedMessage = "Task adding failed";

       executeInsertQuery(query, successMessage, failedMessage);
    }
    
}
