/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.IClientDAO;
import model.Client;

/**
 *
 * @author parve
 */
public class ClientDao extends Executioner implements IClientDAO {

    @Override
    public void createClient(Client client) {
        String query = "INSERT into Client (FirstName,LastName,Email,PhoneNumber,Location) Values"
                + " ('" + client.getFirstName() + "','" + client.getLastName() + "','" + client.getEmail() + "','" + client.getPhoneNumber()
                + "','" + client.getLocation() + "' )";
        String successMessage = "Client Added!!";
        String failedMessage = "Client adding failed!!";

        executeInsertQuery(query, successMessage, failedMessage);
    }

    @Override
    public void FindClient(Client client) {
        //This method is for CasejPanel
        String query = "Select ClientId From CLIENT";
        String successMessage = "User Exists.";
        String failedMessage = "User Doesn't Exist";
        String userInput = client.getClientId();

        executeFindQuery(query, successMessage, failedMessage, userInput);
    }
    @Override
    public int FindClientID(Client client)
    {
        //This method is for ClientjPanel 
        String query ="SELECT ClientId FROM Client where Email = ?";
        String successMessage = "User Exists.";
        String failedMessage = "User Doesn't Exist";
        String userInput = client.getEmail();
        int retrievedID = executeFindClientID(query,successMessage,failedMessage,userInput);
        return retrievedID;
    }
}
