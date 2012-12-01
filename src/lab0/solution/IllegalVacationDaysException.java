package lab0.solution;

/**
 * Exception class that provides an error message for incorrect number of
 * vacation days
 * 
 * @author Emma Edgar
 */

public class IllegalVacationDaysException extends Exception{
    private static final String MSG = "Days must be between 0 and 28";
    
    /**
     * Gets the error message
     * @return 
     */
    @Override
    public String getMessage(){
        return MSG;
    }
    
    /**
     * Creates an IllegalVacationDaysException object without assigned values.
     */
    IllegalVacationDaysException(){
        
    }
    
    /**
     * Creates an IllegalVacationDaysException object without assigned values.
     * @param message - is not used
     */
    IllegalVacationDaysException(String message){
        super(MSG);
    }
    
    /**
     * Creates an IllegalVacationDaysException object with the given Throwable
     * object
     * @param message - is not used
     * @param t - Throwable
     */
    IllegalVacationDaysException(String message, Throwable t){
        super(MSG, t);
    }
    
    IllegalVacationDaysException(Throwable t){
        super(t);
    }
    
    
    /*
     * Methods
     */
    public String getLocalizedMessage(){
        return MSG;
    }
}
