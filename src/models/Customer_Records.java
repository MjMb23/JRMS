package models;


public class Customer_Records {
    private int costumerID;
    private String lastname, firstname, phone, email;

    public Customer_Records(int costumerID, String lastname, String firstname, String phone, String email) {
        this.costumerID = costumerID;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.email = email;
    }
    
    public Customer_Records(){
        this.costumerID = costumerID;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.email = email;
    }

    public int getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
