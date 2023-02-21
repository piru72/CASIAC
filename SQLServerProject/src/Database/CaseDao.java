/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Database.interfaces.ICaseDAO;
import javax.swing.JTable;
import model.Case;

/**
 *
 * @author parve
 */
public class CaseDao extends Executioner implements ICaseDAO {

    static int count = 1;
    static int countForMyFolder = 1;
    static int countForMyFolderCategory = 1;
    static int countForMyFolderLocation = 1;

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

        String Query = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category, C.CaseLocation,C.OpeningDate,"
                + "Aw.FirstName+' '+Aw.LastName AS 'Case Worker',"
                + "Ai.FirstName+' '+Ai.LastName AS 'Case Introducer',"
                + "P.Amount"
                + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId INNER JOIN Advocate Ai ON C.IntroducedBy = Ai.AdvocateId INNER JOIN PAYMENT P ON P.PaymentId = C.PaymentId";

        //Query2 working
        //Query1 working
        String successMessage = "Data Showed";
        String failedMessage = "Failed!";
        JTable jtable = case_.getjTable();

        executeCaseTable(Query, successMessage, failedMessage, jtable, count);
        count = count + 1;

    }

    @Override
    public void createCaseTableForMyFolder(Case case_) {
        // System.out.println("Id"+case_.getCaseWorker());
        String Query = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category,"
                + "Ai.FirstName+' '+Ai.LastName AS 'Case Introducer',"
                + "C.CaseLocation,C.OpeningDate,"
                + "P.Amount"
                + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Ai ON C.IntroducedBy = Ai.AdvocateId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId INNER JOIN PAYMENT P ON P.PaymentId = C.PaymentId"
                + " AND C.CaseWorker ='" + case_.getCaseWorker() + "' ";
        String successMessage = "Data Showed For My Folder";
        String failedMessage = "Failed";
        JTable jtable = case_.getjTable();

        executeCaseTableForMyFolder(Query, successMessage, failedMessage, jtable, countForMyFolder);
        countForMyFolder = countForMyFolder + 1;

    }

    public void createCaseTableByCategory(Case case_) {
        
        
        String Query = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category,"
                + "Ai.FirstName+' '+Ai.LastName AS 'Case Introducer',"
                +"Aw.FirstName+' '+Aw.LastName AS 'Case Worker',"
                + "C.CaseLocation,C.OpeningDate,"
                + "P.Amount"
                + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId INNER JOIN Advocate Ai ON C.IntroducedBy = Ai.AdvocateId INNER JOIN PAYMENT P ON P.PaymentId = C.PaymentId"
                + " AND C.Category ='" + case_.getCategory() + "' ";

        String successMessage = "Data Showed For My Folder By Category";
        String failedMessage = "Failed";
        JTable jtable = case_.getjTable();
        
        executeCaseTableForMyFolderCategory(Query, successMessage, failedMessage, jtable, countForMyFolderCategory);
        countForMyFolderCategory +=1;
    }
    @Override
    public void createCaseTableByLocation(Case case_)
{
    String Query = "SELECT C.CaseId, Client.FirstName+' '+Client.LastName AS 'Client Name',C.Category,"
                + "Ai.FirstName+' '+Ai.LastName AS 'Case Introducer',"
                +"Aw.FirstName+' '+Aw.LastName AS 'Case Worker',"
                + "C.CaseLocation,C.OpeningDate,"
                + "P.Amount"
                + " From CASES C INNER JOIN CLIENT Client ON Client.ClientId = C.ClientId INNER JOIN Advocate Aw ON C.CaseWorker = Aw.AdvocateId INNER JOIN Advocate Ai ON C.IntroducedBy = Ai.AdvocateId INNER JOIN PAYMENT P ON P.PaymentId = C.PaymentId"
                + " AND C.CaseLocation ='" + case_.getLocation() + "' ";

        String successMessage = "Data Showed For My Folder By Category";
        String failedMessage = "Failed";
        JTable jtable = case_.getjTable();
        
        executeCaseTableForMyFolderLocation(Query, successMessage, failedMessage, jtable, countForMyFolderLocation);
        countForMyFolderLocation +=1;
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
