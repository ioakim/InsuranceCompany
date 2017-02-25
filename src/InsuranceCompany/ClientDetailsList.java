package InsuranceCompany;
import java.util.*;

/**
 * a class to model a collection of Client Details 
 * 
 * @author Ioakim Ioakim (100134028) 
 * @version 2016
 */

public class ClientDetailsList {
    private ArrayList<ClientDetails> clientDetailsCollection;


    /**
     * constructing a new ArrayList for ClientDetails objects
     */
    public ClientDetailsList()
    {
        clientDetailsCollection = new ArrayList<ClientDetails>();
    }
    
    /**
     * a method to add a new ClientDetails to the list
     * @param newClientDetails an instance of ClientDetails to be added
     */
    public void addClientDetails(ClientDetails newClientDetails)
    {
        clientDetailsCollection.add(newClientDetails);
    }
    
    /**
     * @return the number of ClientDetails objects in this list 
     */
    public int numberOfClientDetails()
    {
        return clientDetailsCollection.size();
    }
    
    /**
    * A method to determine whether or not a given person, identified by a
    * surname and a postcode is a client of the Insurance company.
    * If so, the client’s ID should be returned.
    * @param lastName   the surname of the person to be searched for.
    * @param code       the postcode of the address of the person to be
    *                   searched for.
    * @return           the Client ID if the person has at least one policy
    *                   with the company, null otherwise.
    */
    public String findClient(String lastName, String code){
        
        Iterator<ClientDetails> it = clientDetailsCollection.iterator();
        while ( it.hasNext()){
            ClientDetails  cDetails = it.next();
            String surname = cDetails.getName().getSurname();
            String postCode = cDetails.getAddress().getPostcode();
            
            if ( surname.equals(lastName) && postCode.equals(code))
                return cDetails.toString();
        }
        return null;
    }
    
    /**
    * A method to get the client details corresponding to a given client ID
    *
    * @param givenID    the client ID whose details are required.
    *
    * @return           the required ClientDetails if found,
    *                   null otherwise.
    */
    public ClientDetails getClientDetails(String givenID){
        
        Iterator<ClientDetails> it = clientDetailsCollection.iterator();
        while ( it.hasNext()){
            ClientDetails  cDetails = it.next();
            String clientID = cDetails.getClientID();
            
            if ( clientID.equals(givenID))
                return cDetails;
        }
        return null;
    }

    /**
    * A method to determine another client who has the same address as
    * the client whose details are given.
    *
    * @param cDetails   the client details whose address is to be
    *                   searched for.
    * @return           the ClientDetails of a client with the same
    *                   address if there is one, null otherwise.
    */
    public ClientDetails sameAddressCheck(ClientDetails cDetails){
        
        Iterator<ClientDetails> it = clientDetailsCollection.iterator();
        while ( it.hasNext()){
            ClientDetails  clientDetails = it.next();
            
            if ( clientDetails.getAddress().compareTo(cDetails.getAddress())==0 
                && !cDetails.getClientID().equals(clientDetails.getClientID()))
                return clientDetails;
        }
        return null;
    }

    /**
     * a method to print out the details of this policy
     * @return a string format of the string builder class used 
     */
   @Override
    public String toString(){
       StringBuilder clientDetailsList = new StringBuilder();
       for (ClientDetails nextClientDetails : clientDetailsCollection){
           clientDetailsList.append(nextClientDetails + "\n");
       }
        return clientDetailsList.toString();
    }
}
