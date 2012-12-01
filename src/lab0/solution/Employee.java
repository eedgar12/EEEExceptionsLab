package lab0.solution;

import java.util.Calendar;
import lab0.*;
import java.util.Date;

/**
 * This is a domain object in the HRSuperPorgram application, and represents a
 * simulation of a real world employee.
 *
 * @author Emma Edgar
 * @version 1.0
 */
public class Employee {

    /**
     * Constant for maximum vacation days allowed
     */
    public static final int MAX_VACATION_DAYS = 28;
    /**
     * Constant for minimum vacation days allowed
     */
    public static final int MIN_VACATION_DAYS = 0;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacationAllowed;

    /**
     * Creates an Employee object with default values
     */
    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacationAllowed = 0;
    }

    /**
     * Creates Employee object with given values
     *
     * @param firstName - first name of employee
     * @param lastName - last name of employee
     * @param ssn - social security number of employee
     * @param hireDate - date on which the employee was hired
     * @param daysVacation - number of vacation days allowed
     */
    public Employee(String firstName, String lastName, String ssn,
            Date hireDate, int daysVacation) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacationAllowed = daysVacation;
    }

    /**
     * Gets days of vacation allowed.
     *
     * @return daysVacationAllowed
     */
    public int getDaysVacation() {
        return daysVacationAllowed;
    }

    /**
     * Sets the days of vacation allowed
     *
     * @param daysVacationAllowed - int number of days of vacation allowed
     * @throws IllegalVacationDaysException - throws exception if the number of
     * days entered is not within the specified range
     */
    public void setDaysVacationAllowed(int daysVacationAllowed)
            throws IllegalVacationDaysException {

        if (daysVacationAllowed < MIN_VACATION_DAYS
                || daysVacationAllowed > MAX_VACATION_DAYS) {
            throw new IllegalVacationDaysException();
        }
        this.daysVacationAllowed = daysVacationAllowed;
    }

    /**
     * Gets first name of employee
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the employee
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the date on which the employee was hired
     *
     * @return
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * Sets the date on which the employee was hired
     *
     * @param hireDate
     */
    public void setHireDate(Date hireDate) {

        Calendar calMin = Calendar.getInstance();
        calMin.set(2011, Calendar.NOVEMBER, 15);
        Date minDate = calMin.getTime();
        Date today = new Date();

        if (hireDate == null) {
            throw new NullPointerException();
        } else if (hireDate.before(minDate)){
            
        } else if (hireDate.after(today)){
            
        }
        
        this.hireDate = hireDate;
    }

    /**
     * Gets the last name of the employee
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the employee
     *
     * @param lastName
     */
    public void setLastName(String lastName) {


        this.lastName = lastName;
    }

    /**
     * Gets the social security number for the employee
     *
     * @return ssn
     */
    public final String getSsn() {
        return ssn;
    }

    /**
     * Sets the social security number for the employee
     *
     * @param ssn
     */
    public void setSsn(String ssn) {
        //array of bad values
        
        if (ssn == null || ssn.length() < 9 || ssn.length() > 9){
            //throw illegal argument
        }
        
        char[] chars = ssn.toCharArray();
        for (char c : chars){
            if (!Character.isDigit(c)){
                throw new IllegalArgumentException();
            }
        }
        //loop through the bad values
        //for (String bad : badValues)
        //
        this.ssn = ssn;
    }
}
