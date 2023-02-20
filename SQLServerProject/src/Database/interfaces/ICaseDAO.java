/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.interfaces;

import java.util.ArrayList;
import model.Case;



/**
 *
 * @author parve
 */
public interface ICaseDAO {
    
    void createCase (Case case_);
    void createJoinedCaseTable(Case case_);
    void createCaseTableForMyFolder(Case case_);
   void createCaseTableByCategory(Case case_);
   void createCaseTableByLocation(Case case_);
}
