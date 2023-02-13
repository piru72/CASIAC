/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.ICaseDAO;
import model.Case;





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

    @Override
    public void createJoinedCaseTable(Case case_) {

        String testQuery1 = "SELECT CaseId,AdvocateId,Category,FirstName,CaseLocation,OpeningDate From CASES c INNER JOIN ADVOCATE a ON c.IntroducedBy =a.AdvocateId";

               String Query = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category, C.CaseLocation,C.OpeningDate,"
                + "Aw.FirstName+' '+Aw.LastName AS 'Case Worker',"
                + "Ai.FirstName+' '+Ai.LastName AS 'Case Introducer',"
                       + "P.Amount"
                       
      + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId INNER JOIN Advocate Ai ON C.IntroducedBy = Ai.AdvocateId INNER JOIN PAYMENT P ON C.PaymentId = P.PaymentId";

       
        String Query1 = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category, C.CaseLocation,C.OpeningDate,"
                + "Aw.FirstName+' '+Aw.LastName AS 'Case Worker',"
                + "Ai.FirstName+' '+Ai.LastName AS 'Case Introducer'"
                + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId INNER JOIN Advocate Ai ON C.IntroducedBy = Ai.AdvocateId";

        
        String Query2 = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category, C.CaseLocation,C.OpeningDate,"
                + "Aw.FirstName+' '+Aw.LastName AS 'Case Worker'"
                + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId";

        
        
        String paymentQuery = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category, C.CaseLocation,C.OpeningDate,"
                + "Aw.FirstName+' '+Aw.LastName AS 'Case Worker',"
                + "Ai.FirstName+' '+Ai.LastName AS 'Case Introducer',"
                + "P.Amount"
                + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId INNER JOIN Advocate Ai ON C.IntroducedBy = Ai.AdvocateId INNER JOIN PAYMENT P ON P.PaymentId = C.PaymentId";
        
        //Query2 working
        //Query1 working
        String successMessage = "Data Showed";
        String failedMessage = "Failed!";
        JTable jtable = case_.getjTable();

        executeCaseTable(paymentQuery, successMessage, failedMessage, jtable);

    }

}
//From. error ashle comma extra last e
//ClientIdInner Invalid column ashle same line e inner join operation korte hobe
/*
  String paymentQuery = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category, C.CaseLocation,C.OpeningDate,"
                + "Aw.FirstName+' '+Aw.LastName AS 'Case Worker',"
                + "P.Amount"
                + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId INNER JOIN PAYMENT P ON P.PaymentId = C.PaymentId";
*/
