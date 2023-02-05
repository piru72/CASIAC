/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.ICaseDAO;
import DatabaseCredentials.DatabaseCredentials;
import java.sql.Connection;
import model.Case;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author parve
 */
public class CaseDao extends Executioner implements ICaseDAO {
    

    @Override
    public void createCase(Case case_) {
        
        String query = "INSERT into CASES (ClientId,Category,CaseWorker,IntroducedBy,CaseLocation,OpeningDate,PaymentId) Values"
                + " ('" + case_.getClientId() + "','" + case_.getCategory() + "','" + case_.getCaseWorker() + "','" + case_.getIntroducedBy()
                + "','" + case_.getLocation() + "','" + case_.getOpeningDate() + "','" + case_.getPaymentId() + "' )";
      

        String successMessage = "Case Added!!";
        String failedMessage = "Case adding failed!!";
        
        executeInsertQuery(query, successMessage, failedMessage);

    }
   
}
