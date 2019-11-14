package Dao;

import Model.Customer;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer, Customer> listCUSTOMER = new HashMap<Integer, Customer>();

    static {
        initCustomer();
    }

    private static void initCustomer() {
        Customer customer1 = new Customer(1, "Doan Ngoc Linh", "0945123654", "asderwa@gmail.com");
        Customer customer2 = new Customer(2, "Doan Ngoc Anh Tai", "0902311232", "deera@gmail.com");
        Customer customer3 = new Customer(3, "Doan Khanh Linh", "0912365476", "derrsa@gmail.com");
        Customer customer4 = new Customer(4, "Nguyen Van A", "09050001232", "dagfhfa@gmail.com");
        listCUSTOMER.put(customer1.getId(), customer1);
        listCUSTOMER.put(customer2.getId(), customer2);
        listCUSTOMER.put(customer3.getId(), customer3);
        listCUSTOMER.put(customer4.getId(), customer4);
    }

    public static Customer getCustomer(int customerID) {
        return listCUSTOMER.get(customerID);
    }

    public static void addCustomer(Customer customer) {
        listCUSTOMER.put(customer.getId(), customer);
    }

    public static Customer updateAndCreateCustomer(Customer customer) {
        listCUSTOMER.put(customer.getId(), customer);
        return customer;
    }
    public static void deleteCustomer(int customerID){
        listCUSTOMER.remove(customerID);
    }
    public static List<Customer> getAllCustomer(){
        Collection<Customer> customers = listCUSTOMER.values();
        List<Customer> list = new ArrayList<Customer>();
        list.addAll(customers);
        return list;
    }
}