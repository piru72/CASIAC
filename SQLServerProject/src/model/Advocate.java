/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.swing.JTable;

/**
 *
 * @author parve
 */
public class Advocate {

    private String advocateId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String AdvocatePassword;
    private String dateOfbirth;
    private String Gender;
    private String address__;
   private JTable jTable;
    public Advocate() {

    }

    public void setAdvocateId(String advocateId) {
        this.advocateId = advocateId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAdvocatePassword(String AdvocatePassword) {
        this.AdvocatePassword = AdvocatePassword;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress__(String address__) {
        this.address__ = address__;
    }

    public String getAdvocateId() {
        return advocateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdvocatePassword() {
        return AdvocatePassword;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress__() {
        return address__;
    }

    public JTable getjTable() {
        return jTable;
    }

    public void setjTable(JTable jTable) {
        this.jTable = jTable;
    }
 
          
}
