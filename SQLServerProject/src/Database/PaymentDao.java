/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.IPaymentDAO;
import model.Payment;


/**
 *
 * @author parve
 */
public class PaymentDao extends Executioner implements IPaymentDAO {
    

    @Override
    public void createPayment(Payment payment) {

        String query = "INSERT into Advocate (ClientId,CreatedTime,UpdatedTime,Status,Amount,Detail) Values"
                + " ('" + payment.getClientId() + "','" + payment.getCreatedTime() + "','" + payment.getUpdatedTime() + "','" + payment.getStatus()
                + "','" + payment.getAmount() + "','" + payment.getDetail() + "' )";
        String successMessage = "Payment added";
        String failedMessage = "Payment adding failed";
        
        executeInsertQuery(query, successMessage, failedMessage);
    }
    
}
