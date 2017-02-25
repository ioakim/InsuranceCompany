package InsuranceCompany;

/**
 * a class to model a Life Policy
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class LifePolicy extends Policy{
    
    private static int holderAge;
    private static int coverAmount;
    private static double risk;
    private static int ageThreshold;
    
    /**
     * constructing a new LifePolicy instance
     * @param aPolicyNo     a policy no. to be given to the new policy
     * @param aYearOfIssue  a year of issue to be given to the new policy
     * @param aHolderAge    the age of this policy's holder
     * @param aCoverAmount  the amount this client is covered for
     * @param aRisk         a risk between 0 and 5
     * @throws IllegalPolicyException if the given risk is not between 0 and 5
     */
    public LifePolicy(String aPolicyNo,int aYearOfIssue,int aHolderAge,
                                                 int aCoverAmount, double aRisk)
                                                  throws IllegalPolicyException{
        super(aPolicyNo, aYearOfIssue);
        
        holderAge= aHolderAge;
        coverAmount= aCoverAmount;
        
        if (aRisk>=0 && aRisk<=5)
            risk=aRisk;
        else
            throw new IllegalPolicyException("The risk must be between 0 and 5");
        
        ageThreshold=25;
    }
    
    /**
     * @return the holder's age
     */
    public int getHolderAge(){
        return holderAge;
    }
    
    /**
     * @return the cover amount of this policy 
     */
    public int getCoverAmount(){
        return coverAmount;
    }
    
    /**
     * @return the risk of this policy
     */
    public double getRisk(){
        return risk;
    }
    
    /**
     * a method to update the holder's age
     * @param aHolderAge  an age to update the existing one
     */
    public void setHolderAge(int aHolderAge){
        holderAge=aHolderAge;
    }
    
    /**
     * a method to update the cover amount of this policy
     * @param aCoverAmount a given amount to update the existing one
     */
    public void setCoverAmount(int aCoverAmount){
        coverAmount=aCoverAmount;
    }
    
    /**
     * a method to update the existing risk of this policy
     * @param aRisk a given risk to update the existing one
     * @throws IllegalPolicyException if the given risk is not between 0 and 5
     */
    public void setRisk(double aRisk)throws IllegalPolicyException{
        if (aRisk>=0 && aRisk<=5)
            risk=aRisk;
        else
            throw new IllegalPolicyException("The risk must be between 0 and 5");
    }
    
    /**
     * a method to calculate and return the premium of this policy
     * @return the calculated premium of this policy
     */
    @Override
    public double getPremium(){
        double premium;
        
        if (holderAge<=ageThreshold)
            premium=1000*(1+risk);
        else 
            premium=(1000*(1+risk))*holderAge/ageThreshold;
        
        return premium;
    }
    
    /**
     * a method to print out the details of this policy
     * @return a string format of the string builder class used 
     */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\tPolicy No.:\t");
        str.append(policyNo).append("\n\tYear of Issue:\t");
        str.append(yearOfIssue).append("\n\tHolder's age:\t");
        str.append(holderAge).append("\n\tCover Amount:\t");
        str.append(coverAmount).append("\n\tRisk:\t");
        str.append(risk).append("\n\tPremium:\t");
        str.append(getPremium());
        return str.toString();
    } 
}
