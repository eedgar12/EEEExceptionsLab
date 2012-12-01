package lab0.solution;

/**
 * Provides various services that an employee or other domain object might use.
 * OR 
 * Serves as a facade for all employee services.
 * CAUTION: currently not all methods are validate. Check method documentation
 * for more info.
 * 
 *
 * @author Emma Edgar
 */
public class EmployeeService {
    
    /**
     * Assign the days of vacation allowed for an employee
     * @param days - integer required
     * @throws IllegalVacationDaysException - throws exception if the number of
     * days are illegal
     * 
     */
    public void assignVacationDays(int days){
        Employee emp = new Employee();
        emp.setDaysVacationAllowed(days);
    }
}
