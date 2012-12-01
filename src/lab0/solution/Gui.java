/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0.solution;

import javax.swing.JOptionPane;

/**
 *
 * @author eedgar
 */
public class Gui {
    private int vacationDays = 0;
    EmployeeService es;
    
    
    public Gui(){
        es = new EmployeeService();
    }
    public void setVacationDays() {
        es. = Integer.parseInt(JOptionPane.showInputDialog("Enter days"));
        try{
           es.assignVacationDays(vacationDays); 
        } catch (IllegalVacationDaysException ivde){
            System.out.println(ivde);
        
        }
        
        
    }
    
    public void assignVacationDays(){
        setVacationDays();
        
    }
    
    public int getVacationDays(){
        return this.vacationDays;
    }
    
    
}
