package lab0.solution;

/**
 * 
 * 
 * 
 * @author eedgar
 * @version 1.o
 * 
 */
public class Startup {
    public static void main(String[] args) {
        
        Gui gui = new Gui();
        gui.setVacationDays(days);
        EmployeeService es = new EmployeeService();
        es.assignVacationDays(654);
        
        
    }
}
