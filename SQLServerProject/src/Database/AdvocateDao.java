/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.IAdvocateDAO;
import DatabaseCredentials.DatabaseCredentials;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Advocate;

/**
 *
 * @author parve
 */
public class AdvocateDao extends Executioner implements IAdvocateDAO  {

    
    @Override
    public void createAdvocate(Advocate advocate) {

        String query = "INSERT into Advocate (FirstName,LastName,Email,PhoneNumber,AdvocatePassword,DateOfBirth,Gender,Address_) Values"
                + " ('" + advocate.getFirstName() + "','" + advocate.getLastName() + "','" + advocate.getEmail() + "','" + advocate.getPhoneNumber()
                + "','" + advocate.getAdvocatePassword() + "','" + advocate.getDateOfbirth() + "','" + advocate.getGender() + "','" + advocate.getAddress__()+ "' )";
        String successMessage = "Signed up for casiac!!";
        String failedMessage = "Sign up failed!!";
        
        executeInsertQuery(query, successMessage, failedMessage);
    }

    @Override
   public   void createAdvocateTable(Advocate advocate)  
   {
       String query ="Select AdvocateId,FirstName,LastName,Email,PhoneNumber,DateOfBirth,Gender,Address_ From Advocate";
        String successMessage = "Table created Successfully!";
        String failedMessage = "Failed!!";
        JTable jTable = advocate.getjTable();
        executeTable(query,successMessage,failedMessage,jTable);
     
   }
    @Override
   public void FindAdvocateID(Advocate advocate)
   {
       String query = "Select AdvocateId From Advocate";
         String successMessage = "Successfull!";
        String failedMessage = "Failed!!";
      String userInput = advocate.getAdvocateId();
      executeFindAdvocate(query,successMessage,failedMessage,userInput);
   }
}
