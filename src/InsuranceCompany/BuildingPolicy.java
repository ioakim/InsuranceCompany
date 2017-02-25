package InsuranceCompany;

/**
 * a class to model a building policy
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class BuildingPolicy extends Policy{
    
    private static final double REBUILD_FACTOR=0.001;
    private static double risk;
    private static double rebuildCost;
    
    /**
     * Constructing a new Building Policy instance
     * @param aPolicyNo     a given policy no. to be given to the new policy
     * @param aYearOfIssue  a year of issue to be given to the new policy
     * @param aRisk         a number representing the risk of insuring the 
     *                      property
     * @param aRebuildCost  an estimated rebuild cost of the property to be 
     *                      insured
     * @throws IllegalPolicyException in case risk in not between 0 and 1
     */
    public BuildingPolicy(String aPolicyNo,int aYearOfIssue, double aRisk, 
                                                            double aRebuildCost)
                                        throws IllegalPolicyException{
        super(aPolicyNo, aYearOfIssue);
        
        if (aRisk>=0 && aRisk<=1)
            risk=aRisk;
        else
            throw new IllegalPolicyException("The risk must be between 0 and 1");
        
        rebuildCost=aRebuildCost;
    }
    
    /**
     * 
     * @return the risk of insuring the property
     */
    public double getRisk(){
        return risk;
    }
    
    /**
     * @return the rebuild cost of this property
     */
    public double getRebuildCost(){
        return rebuildCost;
    }
    
    /**
     * a method to update the risk of the property
     * @param aRisk a given risk to update the existing risk of insuring 
     *              this property
     * @throws IllegalPolicyException in case the given risk is not between
     *                                0 and 1
     */
    public void setRisk(double aRisk) throws IllegalPolicyException{
        if (aRisk>=0 && aRisk<=1)
            risk=aRisk;
        else
            throw new IllegalPolicyException("The risk must be between 0 and 1");
    }
    
    /**
     * a method to update the rebuild cost of this property
     * @param aRebuildCost a given cost to update the existing one
     */
    public void setRebuildCost(double aRebuildCost){
        rebuildCost=aRebuildCost;
    }
    
    /**
     * a method to calculate the premium of this policy
     * @return the premium of the policy
     */
    @Override
    public double getPremium(){
        double premium = rebuildCost*REBUILD_FACTOR*(1+risk);
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
        str.append(risk).append("\n\tRebuild Cost:\t");
        str.append(rebuildCost).append("\n\tPremium:\t");
        str.append(getPremium());
        return str.toString();
    } 
}
