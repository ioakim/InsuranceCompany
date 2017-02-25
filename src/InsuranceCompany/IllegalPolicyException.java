
package InsuranceCompany;

/**
 * The exception class to be thrown when errors occur
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class IllegalPolicyException extends Exception
{    
    /** 
     * Creates an IllegalPolicyException with a given message
     * @param message a given message to appear in the exception
     */
    public IllegalPolicyException(String message) {
        super(message);
    }
    
}
