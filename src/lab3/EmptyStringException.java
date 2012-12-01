/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author eedgar
 */
public class EmptyStringException extends Throwable {
    
    private static final String MSG = "Empty String found";
    
    public String getMSG(){
        return this.MSG;
    }
    
    public EmptyStringException(){
        
    }
    
    public EmptyStringException(String s){
        super(MSG);
    }
    
    public EmptyStringException(String s, Throwable t){
        super(MSG,t);
    }
    
    public EmptyStringException(Throwable t){
        super(t);
    }
    
}
