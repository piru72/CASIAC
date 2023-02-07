/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.IAdvocateDAO;
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

}
