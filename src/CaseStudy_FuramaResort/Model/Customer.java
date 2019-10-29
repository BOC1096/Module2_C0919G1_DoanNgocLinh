package CaseStudy_FuramaResort.Model;

public class Customer implements Comparable<Customer> {
    private String customerName;
    private String birthday;
    private int idCard;
    private int numberPhone;
    private String email;
    private String address;
    private String customerType;
    private String gender;
    private String id;
    private Services services;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Customer(String customerName, String birthday, byte idCard, byte numberPhone, String email, String address, String customerType, String gender, String id, Services services) {
        this.customerName = customerName;
        this.birthday = birthday;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.gender = gender;
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
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

    public void showInformation() {
        System.out.print("\nInformation Customer" +
                "\nCustomer Name: " + this.getCustomerName() +
                "\nIdCard: " + this.getIdCard() +
                "\nBirthday: " + this.getBirthday() +
                "\nEmail: " + this.getEmail() +
                "\nAddress: " + this.getAddress() +
                "\nNumber Phone: " + this.getNumberPhone() +
                "\nCustomer type: " + this.getCustomerType() +
                "\nGender: " + this.getGender() +
                "\nID: " + this.getId());
    }

    @Override
    public int compareTo(Customer customer) {
        return this.customerName.compareTo(customer.getCustomerName());
    }
}
