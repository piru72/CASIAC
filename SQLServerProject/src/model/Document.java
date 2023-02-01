/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author parve
 */
public class Document {
    private String DocumentId;
    private String DocumentType;
    private String ClientId;
    private String DocumentLocation;

    public Document() {
    }

    public String getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    public String getDocumentType() {
        return DocumentType;
    }

    public void setDocumentType(String DocumentType) {
        this.DocumentType = DocumentType;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getDocumentLocation() {
        return DocumentLocation;
    }

    public void setDocumentLocation(String DocumentLocation) {
        this.DocumentLocation = DocumentLocation;
    }
    
}
