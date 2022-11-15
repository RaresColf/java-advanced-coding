package ro.sdacademy.advanced.arraylist;

import java.security.PublicKey;
import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer findCustomer(String searchName) {              //customer fiind reference type trebuie sa returneze null
        for (int i = 0; i < this.customers.size(); i++) {
            Customer currentIterration = customers.get(i);         // punem intr-o variabila fiecare verficare
            if (currentIterration.getName().equals(searchName)) {  //verificam daca ceea ce introducem este egal cu ce contine lista noastra
                return currentIterration;
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String searchName, double transaction) {
        Customer existentCustomer = findCustomer(searchName);
        if (existentCustomer != null) {
            existentCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }
}
