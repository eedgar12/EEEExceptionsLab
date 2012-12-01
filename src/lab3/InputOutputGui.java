package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    
    /**
     * Initializes a new NameService object
     */
    public InputOutputGui() {
        nameService = new NameService();
    }

    /**
     * Gets the user's full name and outputs the last name
     */
    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        
        try {
            lastName = nameService.extractLastName(fullName);
        } catch (NullPointerException npe){
            System.out.println(npe.getMessage());
        } catch (EmptyStringException ese){
            System.out.println(ese.getMSG());
        } catch (IllegalNameException ine){
            System.out.println(ine.getMSG());
        } 
        
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
