/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author eedgar
 */
public class IllegalNameException extends Exception{
    
    private static final String MSG = "Legal full name not found.  " + 
            "There must be more than one word";

    
    public String getMSG(){
        return this.MSG;
    }
    
    public IllegalNameException() {
    }

    public IllegalNameException(String message) {
        super(MSG);
    }

    public IllegalNameException(String message, Throwable cause) {
        super(MSG, cause);
    }

    public IllegalNameException(Throwable cause) {
        super(cause);
    }
    
    
    
    
}
