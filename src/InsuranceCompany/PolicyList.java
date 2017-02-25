package InsuranceCompany;
import java.util.*;

/**
 * a class to model a collection of Policies 
 * 
 * @author Ioakim Ioakim (100134028) 
 * @version 2016
 */

public class PolicyList {
    private ArrayList<Policy> policyCollection;


    /**
     * constructing a new ArrayList
     */
    public PolicyList()
    {
        policyCollection = new ArrayList<Policy>();
    }
    
    /**
     * @return the collection of the policy objects
     */
    public ArrayList<Policy> getCollection(){
        return policyCollection;
    }
    
    /**
     * a method to add a new policy in the list
     * @param newPolicy a policy to be added to the list
     */
    public void addPolicy(Policy newPolicy)
    {
        policyCollection.add(newPolicy);
    }
    
    /**
     * @return the number of policy objects in this list
     */
    public int numberOfPolicies()
    {
        return policyCollection.size();
    }
    
    /**
     * a method to print out all the policy objects in this list
     * @return a string format of the string builder class used
     */
    @Override
    public String toString(){
       StringBuilder policyList = new StringBuilder();
       for (Policy nextPolicy : policyCollection){
           policyList.append(nextPolicy + "\n");
       }
        return policyList.toString();
    }
}
