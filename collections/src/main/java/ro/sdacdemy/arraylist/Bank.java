package ro.sdacademy.advanced.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public Branch findBranch(String searchName) {
        for (Branch b : branches) {
            if (b.getName().equals(searchName)) {
                return b;
            }
        }
        return null; //in caz ca este goala lista, sau nu intra in for sau if, se returneaza null
    }

    public boolean addBranch(String newBranchName) {
        if (findBranch(newBranchName) == null) {
            this.branches.add(new Branch(newBranchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers details for branch: " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer currentCustomer = branchCustomers.get(i); // aici suntem la iteratia curenta
                System.out.println("Customer: " + currentCustomer.getName() + " " + (i + 1));

                if (showTransactions) {
                    System.out.println("\tTransactions: ");
                    ArrayList<Double> transactions = currentCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("\t\t[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
        }
    }

}
