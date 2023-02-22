/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.IPaymentDAO;
import javax.swing.JTable;
import model.Case;
import model.Payment;


/**
 *
 * @author parve
 */
public class PaymentDao extends Executioner implements IPaymentDAO {
    
    static int countForAllPayments = 1;

    static int countForAllPendingPayments = 1;
    @Override
    public void createPayment(Payment payment) {

        String query = "INSERT into Advocate (ClientId,CreatedTime,UpdatedTime,Status,Amount,Detail) Values"
                + " ('" + payment.getClientId() + "','" + payment.getCreatedTime() + "','" + payment.getUpdatedTime() + "','" + payment.getStatus()
                + "','" + payment.getAmount() + "','" + payment.getDetail() + "' )";
        String successMessage = "Payment added";
        String failedMessage = "Payment adding failed";
        
        executeInsertQuery(query, successMessage, failedMessage);
    
    }
    
    @Override
    public void FindPaymentID(Payment payment)
    {
        String query ="SELECT PaymentId FROM PAYMENT";
        String successMessage = "User Exists.";
        String failedMessage = "User Doesn't Exist";
        String userInput = payment.getPaymentId();

        executeFindQuery(query, successMessage, failedMessage, userInput);

    }
    
    @Override
    public void viewAllMyPayments(Payment payment,Case case_)
    {
        String query = "SELECT P.PaymentId,P.CreatedTime,P.UpdatedTime,P.Status,P.Amount,P.Detail,"
               +"Client.FirstName+' '+Client.LastName AS 'Client Name'"
 + "FROM PAYMENT P INNER JOIN CLIENT Client ON  P.ClientId = Client.ClientId INNER JOIN CASES C ON C.PaymentId = P.PaymentId AND C.CaseWorker =  '" + case_.getCaseWorker() + "' AND C.CaseStatus = 'Active'";
               // + "AND C.CaseWorker =  '" + case_.getCaseWorker() + "' AND C.CaseStatus = 'Active'";
           String successMessage = "Table showed for All Payments.";
        String failedMessage = "Failed";
        JTable jtable = payment.getJtable();
       executeCreateTableForAllPayments(query,successMessage,failedMessage,jtable,countForAllPayments);
        countForAllPayments = countForAllPayments + 1;
        
    }
    @Override
    public void viewAllMyPendingPayments(Payment payment,Case case_)
    {
        String query = "SELECT P.PaymentId,P.CreatedTime,P.UpdatedTime,P.Status,P.Amount,P.Detail,"
               +"Client.FirstName+' '+Client.LastName AS 'Client Name'"
 + "FROM PAYMENT P INNER JOIN CLIENT Client ON  P.ClientId = Client.ClientId INNER JOIN CASES C ON C.PaymentId = P.PaymentId AND C.CaseWorker =  '" + case_.getCaseWorker() + "' AND C.CaseStatus = 'Active' AND P.Status = 'Pending'";
               // + "AND C.CaseWorker =  '" + case_.getCaseWorker() + "' AND C.CaseStatus = 'Active'";
           String successMessage = "Table showed for All Payments.";
        String failedMessage = "Failed";
        JTable jtable = payment.getJtable();
        
        executeCreateTableForAllPendingPayments(query,successMessage,failedMessage,jtable,countForAllPayments);
        countForAllPendingPayments =countForAllPendingPayments + 1;
    }
}
