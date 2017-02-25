package InsuranceCompany;

/**
 * The parent class for the policies
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public abstract class Policy {
    
    protected String policyNo;    
               // 1 character, indicating the type of the policy
               //(B for a building, C for content, L for life and V for vehicle),
               // followed by 8 decimal digits
    
    protected int yearOfIssue;
              
    /**
     * constructing the basic details of a policy which are common to all policies
     * @param aPolicyNo     a given policy no. to be given to the new policy
     * @param aYearOfIssue  a given year of issue to be given to the new policy
     * @throws IllegalPolicyException in case the given date is not between 1990
     *                                and 2013 and if the given policy no. is
     *                                not of correct format
     */
    public Policy(String aPolicyNo,int aYearOfIssue)
                                        throws IllegalPolicyException{
        if (aYearOfIssue<1990 || aYearOfIssue>2013)
            throw new IllegalPolicyException("Invalid year of issue");
        else
            yearOfIssue = aYearOfIssue;
        
        if (isPolicyNoLegal(aPolicyNo)== true)
            policyNo = aPolicyNo;
        else
            throw new IllegalPolicyException("Invalid Policy Number");     
    }
    
   /**
   * @return the policyNo for this policy
   */
    public String getPolicyNo(){
        return policyNo;
    }
    
   /**
   * @return the date of issue of this policy
   */
    public int getYearOfIssue(){
        return yearOfIssue;
    }
    
    /**
     * a method to update the policy no. of this policy
     * @param aPolicyNo  a policy no. to update the existing one
     * @throws IllegalPolicyException if the given policy no. is
     *                                not of correct format
     */
    public void setPolicyNo(String aPolicyNo) throws IllegalPolicyException{
        if (isPolicyNoLegal(aPolicyNo)== true)
            policyNo = aPolicyNo;
        else
            throw new IllegalPolicyException("Invalid Policy Number");
    }
    
    /**
     * a method to update the year of issue of this policy
     * @param aYearOfIssue  a year of issue to replace the existing one
     * @throws IllegalPolicyException in case the given date is not between 1990
     *                                and 2013
     */
    public void setYearOfIssue(int aYearOfIssue) throws IllegalPolicyException{
        if (aYearOfIssue<1990 || aYearOfIssue>2013)
            throw new IllegalPolicyException("Invalid year of issue");
        else
            yearOfIssue = aYearOfIssue;
    }
    
    /**
     * @return this policy's premium
     */
    public abstract double getPremium();
    
    /**
     * a method to determine if the given policy no. is of correct format
     * @param aPolicyNo a given policy no. to be checked and then set
     * @return true if the given policy no. is of correct format and 
     *              false otherwise
     */
    public boolean isPolicyNoLegal(String aPolicyNo){
        if (aPolicyNo.length()>9)
            return false;
        
        if (!aPolicyNo.substring(0,1).matches("[B,C,L,V]"))
            return false;
        else{
            for (int i=1; i<=aPolicyNo.length(); i++){
                if (Character.isLetter(i))
                    return false;
                }
            }
        return true;
    }
    
    /**
     * a method to print out the basic details of this policy
     * @return a string format of the string builder class used
     */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\tPolicy No.:\t");
        str.append(policyNo).append("\n\tYear of Issue:\t");
        str.append(yearOfIssue).append("\n\tPremium:\t");
        return str.toString();
    } 
}
