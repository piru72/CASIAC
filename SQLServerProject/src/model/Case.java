/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author parve
 */
public class Case {
    
        private String CaseId ;
	private String ClientId ;
	private String Category ;
	private String CaseWorker;
	private String IntroducedBy ;
	private String Location ;
	private String OpeningDate;
	private String PaymentId ;

    public Case() {
    }

    public String getCaseId() {
        return CaseId;
    }

    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getCaseWorker() {
        return CaseWorker;
    }

    public void setCaseWorker(String CaseWorker) {
        this.CaseWorker = CaseWorker;
    }

    public String getIntroducedBy() {
        return IntroducedBy;
    }

    public void setIntroducedBy(String IntroducedBy) {
        this.IntroducedBy = IntroducedBy;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getOpeningDate() {
        return OpeningDate;
    }

    public void setOpeningDate(String OpeningDate) {
        this.OpeningDate = OpeningDate;
    }

    public String getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(String PaymentId) {
        this.PaymentId = PaymentId;
    }
        
        
    
}
