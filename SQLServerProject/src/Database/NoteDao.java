/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.INoteDAO;
import model.Note;


/**
 *
 * @author parve
 */
public class NoteDao extends Executioner implements INoteDAO {
    

    @Override
    public void createNote(Note note) {

        String query = "INSERT into NOTE (ClientId,ModifiedBy,CreatedBy,Note) Values"
                + " ('" + note.getClientId() + "','" + note.getModifiedBy() + "','" + note.getCreatedBy() + "','" + note.getNote() +  "' )";
        String successMessage = "Note added for client!!";
        String failedMessage = "Note adding failed!!";
        
        executeInsertQuery(query, successMessage, failedMessage);
    }
    
}
