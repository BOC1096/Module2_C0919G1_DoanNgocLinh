package CaseStudy_FuramaResort.Model;

import java.util.Date;

public class Customer {
    private String customerName;
    private Date birthday;
    private String idCard;
    private byte numberPhone;
    private String email;
    private String address;
    private String customerType;
    private Services services;

    public Customer(String customerName, Date birthday, String idCard, byte numberPhone, String email, String address, String customerType, Services services) {
        this.customerName = customerName;
        this.birthday = birthday;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.services = services;
    }

    public Customer() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public byte getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(byte numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public void showInformation(){
        System.out.println("\nInformation Customer"+
                "\nCustomer Name: "+ this.getCustomerName()+
                "\nIdCard: "+this.getIdCard()+
                "\nBirthday: "+this.getBirthday()+
                "\nEmail: "+this.getEmail()+
                "\nAddress: "+ this.getAddress()+
                "\nNumber Phone: "+ this.getNumberPhone()+
                "\nCustomer type: "+this.getCustomerType()+
                "\nService");

    }
}
