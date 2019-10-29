package CaseStudy_FuramaResort.Model;

public class Employee implements Comparable<Employee> {
    private String employeeName;
    private int age;
    private String addressEmployee;
    private int keyEmployee;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public int getKeyEmployee() {
        return keyEmployee;
    }

    public void setKeyEmployee(int keyEmployee) {
        this.keyEmployee = keyEmployee;
    }

    public Employee(String employeeName, int age, String addressEmployee, int keyEmployee) {
        this.employeeName = employeeName;
        this.age = age;
        this.addressEmployee = addressEmployee;
        this.keyEmployee = keyEmployee;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "\nKey Of Employee: " + this.keyEmployee +
                "\nEmployee Name: " + this.employeeName +
                "\nAge Employee: " + this.age +
                "\nAddress employee: " + this.addressEmployee;
    }


    @Override
    public int compareTo(Employee o) {
        return this.keyEmployee;
    }
}

