/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.IDocumentDAO;
import model.Document;


/**
 *
 * @author parve
 */
public class DocumentDao extends Executioner implements IDocumentDAO {

    @Override
    public void createDocument(Document document) {

        String query = "INSERT into Document (DocumentType,ClientId,DocumentLocation) Values"
                + " ('" + document.getDocumentType()+ "','" + document.getClientId() + "','" + document.getDocumentLocation()+ "' )";
        String successMessage = "Document Added!!";
        String failedMessage = "Document adding failed!!";
        
        executeInsertQuery(query, successMessage, failedMessage);
    }
    
}
