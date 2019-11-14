package model;

import java.awt.*;

public class Customer2 {
    private String name;
    private String birthday;
    private String address;

    public Customer2(String name, String birthday, String address) {
        this.name = name;
       this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer2() {
    }
}
