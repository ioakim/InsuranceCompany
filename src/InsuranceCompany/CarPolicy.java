package InsuranceCompany;

import static java.lang.Double.max;

/**
 * a class to model a car policy
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class CarPolicy extends Policy{
    
    private static double carValue;
    private static int driverAge;
    private static int noClaimYears;
    private static boolean fullyComprehensive;
    private static final int BASIC_COVER=100;
    
    /**
     * constructing a new instance for a car policy
     * @param aPolicyNo             a policy no. to be given to the new policy
     * @param aYearOfIssue          a year of issue to be given to the new policy
     * @param aCarValue             the value of the car to be insured 
     * @param aDriverAge            the age of the driver to be insured
     * @param aNoClaimYears         the number of years the driver didn't have
     *                              a claim
     * @param afullyComprehensive   stating if the policy is fully comprehensive
     * @throws IllegalPolicyException  if the driver's age is not between 17 and 99
     */
    public CarPolicy(String aPolicyNo,int aYearOfIssue, double aCarValue, 
                 int aDriverAge, int aNoClaimYears, boolean afullyComprehensive)
                                                  throws IllegalPolicyException{
        super(aPolicyNo, aYearOfIssue);
        
        carValue = aCarValue;
        
        if (aDriverAge<17 || aDriverAge>99)
            throw new IllegalPolicyException("This driver can't be insured");
        else
            driverAge = aDriverAge;
        
        noClaimYears= aNoClaimYears;
        
        fullyComprehensive = afullyComprehensive;       
    }
    
    /**
     * a method to state if a driver is a "young driver"
     * @return true if the are and false otherwise
     */
    public boolean isYoungDriver(){
        if (driverAge>=17 && driverAge<=25)
            return true;
       else
            return false;
    }
    
    /**
     * @return the value of the insured car
     */
    public double getCarValue(){
        return carValue;
    }
    
    /**
     * @return the age of the age of the driver
     */
    public int getAge(){
        return driverAge;
    }
    
    /**
     * @return the number of year a client didn't have a claim
     */
    public int getNoClaimYears(){
        return noClaimYears;
    }
    
    /**
     * @return true if this policy is fully comprehensive and false otherwise 
     */
    public boolean getFullyComprehensive(){
        return fullyComprehensive;
    }
    
    /**
     * a method to update the value of an insured car
     * @param aCarValue a value to replace the existing one
     */
    public void setCarValue(double aCarValue){
        carValue=aCarValue;
    }   
    
    /**
     * a method to update the age of a driver
     * @param aDriverAge an age to update the existing one
     * @throws IllegalPolicyException if the given age is not between 17 and 99
     */
    public void setDriverAge(int aDriverAge)throws IllegalPolicyException{
       if (aDriverAge<17 || aDriverAge>99)
            throw new IllegalPolicyException("This driver can't be insured");
        else
            driverAge = aDriverAge; 
    }
    
    /**
     * a method to update the years a client didn't have a claim
     * @param aNoClaimYears a number of years to update the existing one
     */   
    public void setNoClaimYears(int aNoClaimYears){
        noClaimYears=aNoClaimYears;
    }
    
    /**
     * a method to update if the policy is fully comprehensive
     * @param aValue a boolean value to update the existing one
     */    
    public void setFullyComprehensive(boolean aValue){
        fullyComprehensive=aValue;
    }
    
    /**
     * calculating the initial premium of this policy
     */
    double initPremium=max(BASIC_COVER, 0.1*carValue);
    
    /**
     * a method to calculate the premium of this policy
     * @return the calculated premium of this policy
     */
    @Override
    public double getPremium(){
        double premium;
        
        if (isYoungDriver())
            premium=initPremium+(initPremium*0.5);
        else
            premium=initPremium;
        
        if (fullyComprehensive==true)
            premium=premium+(premium*0.5);
        
        if (getNoClaimYears()>5)
            premium = premium - (5*0.075);
        else
            premium = premium - (getNoClaimYears()*0.075);
        
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
        str.append(yearOfIssue).append("\n\tCar Value:\t");
        str.append(carValue).append("\n\tDriver's age:\t");
        str.append(driverAge).append("\n\tYears without claim:\t");
        str.append(noClaimYears).append("\n\tFully Comprehensive:\t");
        str.append(fullyComprehensive).append("\n\tPremium:\t");
        str.append(getPremium());
        return str.toString();
    } 
}
