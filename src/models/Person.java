
package models;


public abstract class Person {
    
    private String firstName, lastName, middleName;
    
    public Person(String firstName, String lastName, String middleName){
        
        this.firstName=firstName;
        this.lastName=lastName;
        this.middleName=middleName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getMiddleName(){
        return middleName;
    }
}
