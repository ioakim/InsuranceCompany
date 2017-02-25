package InsuranceCompany;
import java.io.File;

/**
 * the main class to run and test the program
 * @author Ioakim Ioakim(100134028)
 * @version 2016
 */
public class InsuranceCoDemo {

    public static void main(String[] args) throws IllegalPolicyException {
        
        //TEST 1 Creating a new instance of Address and printing it out
        //Address address = new Address("2 Bluebell","Norwich","NR47TJ");
        //System.out.println(address.toString());
        
        //TEST 2 updating the details of the address and presenting them 
        //       using the get methods
        //address.setPostcode("NR5 8JK");
        //System.out.println(address.getPostcode());
        
        //address.setStreet("3 Buckingham");
        //System.out.println(address.getStreet());
        
        //address.setTownOrCity("Great Yarmouth");
        //System.out.println(address.getTownOrCity());
        
        //TEST 3 Comparing 2 adresses (should return 0 as they are the same)
        //Address address2=address;
        //System.out.println(address.compareTo(address2));
        
        //TEST4 Creating a new instance of Name and printing it out
        //Name name=new Name("Mr","JD", "Jackson");
        //System.out.println(name.toString());
        
        //TEST 5 updating the details of the name and presenting them 
        //       using the get methods
        //name.setTitle("Ms");
        //System.out.println(name.getTitle());
        
        //name.setInitials("MJ");
        //System.out.println(name.getinitials());
        
        //name.setSurname("Bayes");
        //System.out.println(name.getSurname());
        
                
        //TEST 6 Creating a new building policy and printing it out
        //BuildingPolicy buildPolicy=new BuildingPolicy("B12345678", 2012,0.5,1000);
        //System.out.println(buildPolicy.toString());
        
        //TEST 7 updating the details of the policy and presenting them 
        //       using the get methods
        //buildPolicy.setPolicyNo("B22345678");
        //System.out.println(buildPolicy.getPolicyNo());
        
        //buildPolicy.setYearOfIssue(2010);
        //System.out.println(buildPolicy.getYearOfIssue());
        
        //buildPolicy.setRisk(0.7);
        //System.out.println(buildPolicy.getRisk());
        
        //buildPolicy.setRebuildCost(4000);
        //System.out.println(buildPolicy.getRebuildCost());
        
        //TEST 8 Checking that it throws exception for not appropriate risk value
        //buildPolicy.setRisk(1.5);
        
        //TEST 9 Checking that it throws exception for not appropriate 
        //       policy no. which applies for all kind of policies
        //buildPolicy.setPolicyNo("K838388");
        
        //TEST 10 Checking that it throws exception for not appropriate 
        //        year of issue which applies for all kind of policies
        //buildPolicy.setYearOfIssue(2017);
        
        //TEST 11 Creating a new contents policy and printing it out
        //ContentPolicy contentpolicy = new ContentPolicy("C12345678",2010,0.5,100);
        //System.out.println(contentpolicy.toString());
        
        //TEST 12 updating the details of the policy and presenting them 
        //       using the get methods
        
        //contentpolicy.setPolicyNo("C21234568");
        //System.out.println(contentpolicy.getPolicyNo());
        
        //contentpolicy.setYearOfIssue(2010);
        //System.out.println(contentpolicy.getYearOfIssue());
        
        //contentpolicy.setRisk(0.7);
        //System.out.println(contentpolicy.getRisk());
        
        //contentpolicy.setContentValue(4000);
        //System.out.println(contentpolicy.getContentValue());
        
        //TEST 13 Checking that it throws exception for not appropriate risk value
        //contentpolicy.setRisk(1.5);
        
        //TEST 14 Creating a new Car policy and printing it out
        //CarPolicy carpolicy= new CarPolicy("V12345678",2009,12000,20,4,false);
        //System.out.println(carpolicy.toString());
        
        //TEST 15 updating the details of the policy and presenting them 
        //       using the get methods
        
        //carpolicy.setPolicyNo("V21234568");
        //System.out.println(carpolicy.getPolicyNo());
        
        //carpolicy.setYearOfIssue(2010);
        //System.out.println(carpolicy.getYearOfIssue());
        
        //carpolicy.setCarValue(8000);
        //System.out.println(carpolicy.getCarValue());
        
        //carpolicy.setDriverAge(40);
        //System.out.println(carpolicy.getAge());
        
        //carpolicy.setNoClaimYears(8);
        //System.out.println(carpolicy.getNoClaimYears());
        
        //carpolicy.setFullyComprehensive(true);
        //System.out.println(carpolicy.getFullyComprehensive());
        
        
        //TEST 16 Checking that it throws exception for not appropriate driver's age
        //carpolicy.setDriverAge(100);
        
        
        //TEST 17 Creating a new life policy and printing it out
        //LifePolicy lifepolicy= new LifePolicy("L12345678",2009,55,100000,4);
        //System.out.println(lifepolicy.toString());
        
        //TEST 18 updating the details of the policy and presenting them 
        //       using the get methods
        
        //lifepolicy.setPolicyNo("L21234568");
        //System.out.println(lifepolicy.getPolicyNo());
        
        //lifepolicy.setYearOfIssue(2010);
        //System.out.println(lifepolicy.getYearOfIssue());
        
        //lifepolicy.setRisk(0.7);
        //System.out.println(lifepolicy.getRisk());
        
        //lifepolicy.setHolderAge(40);
        //System.out.println(lifepolicy.getHolderAge());
        
        //lifepolicy.setCoverAmount(200000);
        //System.out.println(lifepolicy.getCoverAmount());
        
        //TEST 19 Checking that it throws exception for not appropriate risk value
        //lifepolicy.setRisk(6);
        
        
        //TEST 20 Creating a new Policy List and adding the four policies to it
        //        and printing it out
        //PolicyList policylist=new PolicyList();
        
        //policylist.addPolicy(buildPolicy);
        //policylist.addPolicy(carpolicy);
        //policylist.addPolicy(lifepolicy);
        //policylist.addPolicy(contentpolicy);
        
        //System.out.println(policylist.toString());
        
        //TEST 21 Returning the number of pollicies in this collection 
        //        using the size() method
        //System.out.println(policylist.numberOfPolicies());
        
        
        //TEST 22 Creating a new Client Details object and printing it out
        //ClientDetails client=new ClientDetails("XXXXX",name,address,policylist);
        //System.out.println(client.toString());
        
        //TEST 23 updating the details of the client and presenting them 
        //       using the get methods
        //client.setClientID("VVVV");
        //client.setClientName(new Name("Mr", "JK","Johnson"));
        //client.setClientAddress(new Address("124 Earlham","Norwich", "NR4 7TJ"));
        
        //PolicyList list2 =new PolicyList();
        //list2.addPolicy(new BuildingPolicy("B34567890",2013,0.9,208900));
        //client.setPolicyList(list2);
        
        //System.out.println(client.getClientID());
        //System.out.println(client.getName());
        //System.out.println(client.getAddress());
        //System.out.println(client.getPolicyList());
        
        //TEST 24 Checking that it throws exception when a client has 
        //        more than 1 of each policy type
        
        //PolicyList list3= new PolicyList();
        //list3.addPolicy(carpolicy);
        //list3.addPolicy(lifepolicy);
        //list3.addPolicy(contentpolicy);
        //list3.addPolicy(buildPolicy);
        //list3.addPolicy(new BuildingPolicy("B34567890",2013,0.9,208900));
        
        //client.setPolicyList(list3);
         
        //TEST 25 Creating a new ClientDetailsList and adding 2 clients 
        //        to it and printing them out 
        
        //ClientDetailsList  clientlist = new ClientDetailsList();
        
        //ClientDetails client2= new ClientDetails("KKKK",new 
        //                                Name("Mr","KJ","Jacksen"),
        //                    new Address("12 Earlham","Norwich","NR47TJ"),list3);
        
        //clientlist.addClientDetails(client);
        //clientlist.addClientDetails(client2);
        
        //System.out.println(clientlist.toString());
        
        //TEST 26 Finding a client in the list given their last name and postcode
        //System.out.println(clientlist.findClient("Jacksen","NR47TJ"));
        
        //TEST27 Finding a client's details given his ID
        //System.out.println(clientlist.getClientDetails("XXXXX").toString());
        
        //TEST 28 Searching for another client with the same address as the 
        //        client's whose details are given
        
        //System.out.println(clientlist.sameAddressCheck(new ClientDetails("JJJJJ",
                                   // new  Name("Mr","JF","Johnson"),
              // new Address("12 Earlham","Norwich","NR47TJ"),list3)).toString());
        
              
        //TEST 29 Reading the data from the file and returning a client details list
        
        try{
        File clientFile = new File("ClientDetailsInput.txt");
        ClientDetailsList newList=null;
        
        
        newList = InputData.readFile(clientFile);
        System.out.println(newList.toString());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
