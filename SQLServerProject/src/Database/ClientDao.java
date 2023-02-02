/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.IClientDAO;
import DatabaseCredentials.DatabaseCredentials;
import java.sql.Connection;
import model.Client;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author parve
 */
public class  ClientDao extends Executioner implements IClientDAO {

    @Override
    public void createClient(Client client) {
        String query = "INSERT into Advocate (FirstName,LastName,Email,PhoneNumber,Location) Values"
                + " ('" + client.getFirstName() + "','" + client.getLastName() + "','" + client.getEmail() + "','" + client.getPhoneNumber()
                + "','" + client.getLocation() + "' )";
        String successMessage = "Client Added!!";
        String failedMessage = "Client adding failed!!";

        executeInsertQuery(query, successMessage, failedMessage);
    }

}
