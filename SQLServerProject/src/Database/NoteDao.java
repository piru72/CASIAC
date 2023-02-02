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
public class NoteDao extends Executioner implements INoteDAO {
    

    @Override
    public void createNote(Note note) {

        String query = "INSERT into Advocate (ClientId,ModifiedBy,CreatedBy,Note) Values"
                + " ('" + note.getClientId() + "','" + note.getModifiedBy() + "','" + note.getCreatedBy() + "','" + note.getNote() +  "' )";
        String successMessage = "Note added for client!!";
        String failedMessage = "Note adding failed!!";
        
        executeInsertQuery(query, successMessage, failedMessage);
    }
    
}
