/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.interfaces;

import javax.swing.JTable;
import model.Advocate;

/**
 *
 * @author parve
 */
public interface IAdvocateDAO {
    
    
    void createAdvocate (Advocate advocate);
    void createAdvocateTable(Advocate advocate);
}
