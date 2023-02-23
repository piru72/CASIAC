/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.interfaces;

import model.Case;
import model.Payment;

/**
 *
 * @author parve
 */
public interface IPaymentDAO {
    void createPayment (Payment payment);
    void FindPaymentID(Payment payment);
    void viewAllMyPayments(Payment payment,Case case_);
    void viewAllMyPendingPayments(Payment payment,Case case_);
}
