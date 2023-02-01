/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author parve
 */
public class Task {
    
    private String TaskId;
    private String TaskDetails;
    private String Deadline;
    private String TaskPriority;
    private String LawyerId;
    private String TaskStatus;
    private String CompeletedTime;
    private String CreatedTime;

    public Task() {
      
    }

    public String getTaskId() {
        return TaskId;
    }

    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public String getTaskDetails() {
        return TaskDetails;
    }

    public void setTaskDetails(String TaskDetails) {
        this.TaskDetails = TaskDetails;
    }

    public String getDeadline() {
        return Deadline;
    }

    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    public String getTaskPriority() {
        return TaskPriority;
    }

    public void setTaskPriority(String TaskPriority) {
        this.TaskPriority = TaskPriority;
    }

    public String getLawyerId() {
        return LawyerId;
    }

    public void setLawyerId(String LawyerId) {
        this.LawyerId = LawyerId;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public String getCompeletedTime() {
        return CompeletedTime;
    }

    public void setCompeletedTime(String CompeletedTime) {
        this.CompeletedTime = CompeletedTime;
    }

    public String getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }
    
    
    
}
