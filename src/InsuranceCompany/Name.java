package InsuranceCompany;

/**
 * 
 * A class to model a client's name
 *
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class Name {
    
    private String title;
    private String initials;
    private String surname;
    
    /** 
     * Creates a new instance of Name 
     * @param title     the title of this client
     * @param initials  the initials of this client 
     * @param surname   the surname of this client
     */
    public Name(String title, String initials, String surname) {
        this.title = title;
        this.initials = initials;
        this.surname = surname;
    }
    
    /**
     * @return the title (Mr, Ms etc) of this client's name
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * @return the initials of the forenames of this client's name
     */
    public String getinitials(){
        return initials;
    }
    
    /**
     * @return the surname of this client's name
     */
    public String getSurname(){
        return surname;
    }
    
    /**
     * method to update a client's title
     * @param aTitle    a given title to update the existing one
     */
    public void setTitle(String aTitle){
        this.title=aTitle;
    }
    
    /**
     * method to update a client's initials
     * @param aInitials some given initials to update the existing
     */
    public void setInitials(String aInitials){
        this.initials=aInitials;
    }
    
    /**
     * method to update a client's surname
     * @param aSurname  a given surname to update the existing one
     */
    public void setSurname(String aSurname){
        this.surname=aSurname;
    }
    
    /**
     * a method to print out this name
     * @return a string format of the string builder class used  
     */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\n\t");
        str.append(title).append(". ").append(initials);
        str.append(" ").append(surname);
        return str.toString();
    }
}
