package InsuranceCompany;

/**
 * a class to model a content policy
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class ContentPolicy extends Policy{
    
    private static final double CONTENTS_FACTOR=0.001;    
    private static double risk;
    private static double contentValue;
    
    /**
     * constructing a new instance of Content policy
     * @param aPolicyNo         a given policy no. to be given to the new policy
     * @param aYearOfIssue      a year of issue to be given to the new policy
     * @param aRisk             a risk to be given to the new policy
     * @param aContentValue     a value of the  contents to be insured 
     * @throws IllegalPolicyException  in case the given value of risk is not
     *                                 between 0 and 1
     */
    public ContentPolicy(String aPolicyNo,int aYearOfIssue, double aRisk, 
                                                           double aContentValue)
                                                  throws IllegalPolicyException{
        super(aPolicyNo, aYearOfIssue);
        
        if (aRisk>=0 && aRisk<=1)
            risk=aRisk;
        else
            throw new IllegalPolicyException("The risk must be between 0 and 1");
        
        contentValue=aContentValue;
    }
    
    /**
     * @return the risk of this policy
     */
    public double getRisk(){
        return risk;
    }
    
    /**
     * @return  the value of content in this policy
     */
    public double getContentValue(){
        return contentValue;
    }
    
    /**
     * a method to update the risk of this policy
     * @param aRisk a value to update the the existing risk
     * @throws IllegalPolicyException in case the given value is not between
     *                                0 and 1
     */
    public void setRisk(double aRisk)throws IllegalPolicyException{
        if (aRisk>=0 && aRisk<=1)
            risk=aRisk;
        else
            throw new IllegalPolicyException("The risk must be between 0 and 1");
    }
    
    /**
     * a method to update the value of content of this policy
     * @param aContentValue a given value to update the existing one
     */    
    public void setContentValue(double aContentValue){
        contentValue=aContentValue;
    }
    
    /**
     * a method to calculate the premium of this policy
     * @return the calculated premium of this policy
     */
    @Override
    public double getPremium(){
        double premium = contentValue*CONTENTS_FACTOR*(1+risk);
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
        str.append(yearOfIssue).append("\n\tRisk:\t");
        str.append(risk).append("\n\tContent Value:\t");
        str.append(contentValue).append("\n\tPremium:\t");
        str.append(getPremium());
        return str.toString();
    } 
}
