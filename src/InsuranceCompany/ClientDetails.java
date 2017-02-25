package InsuranceCompany;

import java.util.*;

/**
 * A class to model a client's details
 * 
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class ClientDetails {
    
    private String clientID;
    private Name clientName;
    private Address clientAddress;
    private PolicyList clientPolicyList;
    //counters to keep track of how many policies of each type this client has
    int cCount =0 , bCount=0, lCount=0, vCount=0;
    
    /** Creates a new instance of ClientDetails
     * @param clientID          a given ID to be given to the new client
     * @param clientName        a given name to be given to the new client
     * @param clientAddress     an address  to be given to the new client
     * @param clientPolicyList  a list of policies to be given to the new client
     * @throws IllegalPolicyException in case a client has more than one policy
     *                                of each type
     */
    public ClientDetails(String clientID, Name clientName, Address clientAddress, 
                         PolicyList clientPolicyList) throws IllegalPolicyException{
        
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientAddress =  clientAddress;
        
        Iterator<Policy> it = clientPolicyList.getCollection().iterator();
        while ( it.hasNext()){
            Policy  polList = it.next();
            String policyNo = polList.getPolicyNo();
            
            String initial = policyNo.substring(0);
            
            switch(initial){
                case "C": cCount++;
                case "V": vCount++;
                case "L": lCount++;
                case "B": bCount++;                        
            }
        }
        if (cCount>1 || bCount>1 || lCount>1 || vCount>1)
            throw new IllegalPolicyException("You can't have more than 1 policy of each kind");
        else 
            this.clientPolicyList =  clientPolicyList;
    }
    
    /** 
     * @return the ID of this client
     */
    public String getClientID(){
        return clientID;
    }
    
    /** 
     * @return the name of this client
     */
    public Name getName(){
        return clientName;
    }
    
    /** 
     * @return the address of this client
     */
    public Address getAddress(){
        return clientAddress;
    }
    
    /** 
     * @return the list of policies of this client
     */
    public PolicyList getPolicyList(){
        return clientPolicyList;
    }
    
    
    /**
     * method to update a client's ID
     * @param aClientID a given ID to update the existing one
     */
    public void setClientID(String aClientID){
        this.clientID= aClientID;
    }
    
    /**
     * method to update a client's name
     * @param aClientName a name to update the existing one
     */
    public void setClientName(Name aClientName){
        this.clientName=aClientName;
    }
    
    /**
     * method to update a client's address
     * @param aClientAddress an address to update the existing one
     */
    public void setClientAddress(Address aClientAddress){
        this.clientAddress=aClientAddress;
    }
    
    /**
     * method to update a client's list of policies
     * @param aClientPolicyList a list of policies to update the existing one
     * @throws IllegalPolicyException in case the given policy list has more 
     *                                than one policy of each type
     */
    public void setPolicyList(PolicyList aClientPolicyList)
                                                  throws IllegalPolicyException{
        
        Iterator<Policy> it = aClientPolicyList.getCollection().iterator();
        while ( it.hasNext()){
            Policy  polList = it.next();
            String policyNo = polList.getPolicyNo();
            
            String initial = policyNo.substring(0,1);
            
            switch(initial){
                case "C": cCount++;
                case "V": vCount++;
                case "L": lCount++;
                case "B": bCount++;                        
            }
        }
        if (cCount>1 || bCount>1 || lCount>1 || vCount>1)
            throw new IllegalPolicyException("You can't have more than 1 policy of each kind");
        else 
            this.clientPolicyList=aClientPolicyList;  
    }
    
    /**
     * a method to print out the details of this policy
     * @return a string format of the string builder class used 
     */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\tClient's ID:\t");
        str.append(clientID).append("\n\tClient's Name:\t");
        str.append(clientName).append("\n\tClient's Address:\t");
        str.append(clientAddress).append("\n\tClient's Policy list:\t");
        str.append(clientPolicyList);
        return str.toString();
    } 



}
