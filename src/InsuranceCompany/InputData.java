package InsuranceCompany;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * A class containing a static methods to read the client details and policies 
 * data from a file
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class InputData {
    
    /**
     * a method to read and return the details of some clients and their policies
     * @param inputFile a file to be read
     * @return a new ClientDetailsList with the data from the file
     * @throws IOException  throws Input/Output exception for errors
     * @throws IllegalPolicyException if the policy no. read from the file does
     *                                not begin with the appropriate letters
     */
    public static ClientDetailsList readFile( File inputFile ) 
                                    throws IOException, IllegalPolicyException{
         
        
        
        ClientDetailsList detailsList = new ClientDetailsList();
        ClientDetails newClient = null;
        Policy newPolicy = null;
        
        try{
            final String DELIMITER1 ="#";
            final String DELIMITER2 = "/|#";
            
            //scanner to separate each client
            Scanner fileScan = new Scanner(inputFile);
            fileScan.useDelimiter(DELIMITER1);
            
            //looping through the file while it has another client's details
            while(fileScan.hasNext()){
                //creating a new policy list for each client
                PolicyList newPolicyList=new PolicyList();
                
                // Jump to the start of the next line of the input file
                String nextClientScan = fileScan.nextLine();
                
                //scanner to separate each client's piece of data
                Scanner clientDetailsScan = new Scanner(nextClientScan);
                clientDetailsScan.useDelimiter(DELIMITER2);
            
                String clientID = clientDetailsScan.next();                    
            
                String title= clientDetailsScan.next();
                String initials= clientDetailsScan.next();
                String surname= clientDetailsScan.next();
                //creating a name instance for the read data
                Name clientName = new Name(title,initials,surname);
            
                String street= clientDetailsScan.next();
                String townOrCity= clientDetailsScan.next();
                String postcode= clientDetailsScan.next();
                //creating an address instance for the read data
                Address clientAddress = new Address(street,townOrCity,postcode);
                
                //after reading the address of the client's address the program
                //loops until it reads all the policies held by this client 
                //before jumping to the next client
                while(clientDetailsScan.hasNext()){
                
                    int yearOfIssue = clientDetailsScan.nextInt();
                    String policyNo = clientDetailsScan.next();
                    String initial = policyNo.substring(0,1);
                    
                    //dependimg on the initial of the policy no. it reads the 
                    //appropriate data and creates the appropriate type
                    //of policy
                    switch(initial){
                        case "C":   double contentValue = 
                                                 clientDetailsScan.nextDouble();
                                    double risk = clientDetailsScan.nextDouble();
                                    newPolicy= new ContentPolicy(policyNo,
                                                 yearOfIssue,risk,contentValue);
                                    break;
                                    
                        case "V":   double carValue=clientDetailsScan.nextDouble();
                                    int driverAge = clientDetailsScan.nextInt();
                                    int noClaimYears=clientDetailsScan.nextInt();
                                    int fullyTest= clientDetailsScan.nextInt();
                                    boolean fullyComprehensive;
                                    if (fullyTest==1)
                                        fullyComprehensive=true;
                                    else
                                        fullyComprehensive=false;
                                    newPolicy=new CarPolicy(policyNo,yearOfIssue,
                                    carValue,driverAge,noClaimYears,fullyComprehensive);
                                    break;
                                    
                        case "L":   int coverAmount= clientDetailsScan.nextInt();
                                    int holderAge=clientDetailsScan.nextInt();
                                    risk = clientDetailsScan.nextDouble();
                                    newPolicy=new LifePolicy(policyNo,yearOfIssue,
                                                        holderAge,coverAmount,risk);
                                    break;
                                    
                        case "B":   double rebuildCost=clientDetailsScan.nextDouble();
                                    risk=clientDetailsScan.nextDouble();
                                    newPolicy= new BuildingPolicy(policyNo,
                                                    yearOfIssue,risk,rebuildCost);
                                    break;
                                    
                        default:    throw new IllegalPolicyException("The"
                             + " policy no. must start with 'C','B','L' or'V'");
                    }
                    //adding the new policy to the policy list for this client
                    newPolicyList.addPolicy(newPolicy); 
                }
                //creating a new ClientDeatils instance with all the data read
                //from the file
                newClient= new ClientDetails(clientID,clientName,
                                                    clientAddress,newPolicyList); 
                //adding the new ClientDetails object to the ArrayList
                detailsList.addClientDetails(newClient);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return detailsList;        
    }
}