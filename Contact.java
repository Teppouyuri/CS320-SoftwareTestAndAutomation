public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address){
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactId(){
        return contactId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }

    public void setFirstName(String firstName){
        if (null != firstName && firstName.length() < 10){
            this.firstName = firstName;
        }
    }
    public void setLastName(String lastName){
        if (null != lastName && lastName.length() < 10){
            this.lastName = lastName;
        }
    }
    public void setPhone(String phone){
        if(null != phone && phone.length() == 10){
            this.phone = phone;
        }
    }
    public void setAddress(String address){
        if(null != address && address.length() <= 30){
            this.address = address;
        }
    }

}
