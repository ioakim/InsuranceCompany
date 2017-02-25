package InsuranceCompany;

/**
 * A class to model a client's address
 *
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class Address implements Comparable<Address>{
    
    private String street;
    private String townOrCity;
    private String postcode;
    
    /** Creates a new instance of Address
     * @param street        the street of this address  
     * @param townOrCity    the city of this address
     * @param postcode      the post code of this address
     */
    public Address(String street, String townOrCity, String postcode) {
        this.street = street;
        this.townOrCity = townOrCity;
        this.postcode = postcode;
    }
    
    /** 
     * @return the street of this client's address
     */
    public String getStreet(){
        return street;
    }
    
    /**
     * @return  the town or city of this client's address 
     */
    public String getTownOrCity(){
        return townOrCity;
    }
    
    /** 
     * @return  the postcode of this client's address 
     */
    public String getPostcode(){
        return postcode;
    }
    
    /**
     * method to update a client's street
     * @param aStreet a given address to update the existing address
     */
    public void setStreet(String aStreet){
        this.street=aStreet;
    }
    
    /**
     * method to update a client's town or city
     * @param aTownOrCity a given town or city to update the existing one 
     */
    public void setTownOrCity(String aTownOrCity){
        this.townOrCity=aTownOrCity;
    }
    
    /**
     * method to update a client's post code
     * @param aPostcode a given post code to update the existing one
     */
    public void setPostcode(String aPostcode){
        this.postcode=aPostcode;
    }
    
    /**
     * a method to compare two addresses
     * @param other an address to be compared to this address
     * @return positive if the given address is lexically greater than this 
     *         address, 0 if they are the same and a negative if the given 
     *         address is lexically smaller than this address
     */
    @Override
    public int compareTo(Address other)
       {
        return this.toString().compareTo(other.toString());
       }
    
    /**
     * a method to print out the instance of this address
     * @return a string format of the string builder class used
     */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\t");
        str.append(street).append("\n\t");
        str.append(townOrCity).append("\n\t");
        str.append(postcode).append("\n");
        return str.toString();
    }   
}