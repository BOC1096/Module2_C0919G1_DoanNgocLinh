package dao;

import model.Customer2;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer, Customer2> listCUSTOMER = new HashMap<Integer, Customer2>();

    static {
        initCustomer();
    }
    private static void initCustomer() {
        Customer2 cus1 = new Customer2("Linh", "13/08/1994", "Da Nang");
        Customer2 cus2 = new Customer2("Long", "12/05/1992", "Da Nang");
        Customer2 cus3 = new Customer2("Hien", "21/02/1999", "Da Nang");
        Customer2 cus4 = new Customer2("Hung", "22/11/1990", "Da Nang");
        listCUSTOMER.put(1,cus1);
        listCUSTOMER.put(2,cus2);
        listCUSTOMER.put(3,cus3);
        listCUSTOMER.put(4,cus4);
    }
    public static List<Customer2> getAllCustomer(){
        Collection<Customer2> customers = listCUSTOMER.values();
        List<Customer2> list = new ArrayList<Customer2>();
        list.addAll(customers);
        return list;
    }
}