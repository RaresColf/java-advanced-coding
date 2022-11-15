package ro.sdacademy.advanced.arraylist;

/**
 *     // You job is to create a simple banking application.
 *     // There should be a Bank class
 *     // It should have an arraylist of Branches
 *     // Each Branch should have an arraylist of Customers
 *     // The Customer class should have an arraylist of Doubles (transactions)
 *     // Customer:
 *     // Name, and the ArrayList of doubles.
 *     // Branch:
 *     // Need to be able to add a new customer and initial transaction amount.
 *     // Also needs to add additional transactions for that customer/branch
 *     // Bank:
 *     // Add a new branch
 *     // Add a customer to that branch with initial transaction
 *     // Add a transaction for an existing customer for that branch
 *     // Show a list of customers for a particular branch and optionally a list
 *     // of their transactions
 *     // Demonstration autoboxing and unboxing in your code
 *     // Hint: Transactions
 *     // Add data validation.
 *     // e.g. check if exists, or does not exist, etc.
 *     // Think about where you are adding the code to perform certain actions
 */

public class Main {
    public static void main(String[] args) {
       Bank bank = new Bank("ING");
       bank.addBranch("ING_SUCURSALA_UNIRII");
       bank.addBranch("ING_SUCURSALA_PIATA VICTORIEI");
       bank.addBranch("ING_SUCURSALA_OBOR");
       bank.addBranch("ING_SUCURSALA_OBOR");

       bank.addCustomer("ING_SUCURSALA_UNIRII", "Ion", 550.5);
       bank.addCustomer("ING_SUCURSALA_UNIRII", "Mihai", 550.5);
       bank.addCustomer("ING_SUCURSALA_UNIRII", "Marius", 550.5);
       bank.addCustomer("ING_SUCURSALA_OBOR", "Bogdan", 550.5);

       bank.addCustomerTransaction("NON_EXISTENT", "Ion", 100);

       bank.addCustomerTransaction("ING_SUCURSALA_UNIRII", "Ion", 100);
       bank.addCustomerTransaction("ING_SUCURSALA_UNIRII", "Ion", 100.20);
       bank.addCustomerTransaction("ING_SUCURSALA_UNIRII", "Ion", 100.40);

       bank.addCustomerTransaction("ING_SUCURSALA_UNIRII", "Mihai", 300.40);
       bank.addCustomerTransaction("ING_SUCURSALA_UNIRII", "Mihai", 400.40);
       bank.addCustomerTransaction("ING_SUCURSALA_UNIRII", "Mihai", 500.40);

       bank.addCustomerTransaction("ING_SUCURSALA_UNIRII", "Marius", 10.40);

       bank.addCustomerTransaction("ING_SUCURSALA_OBOR", "Marius", 120.40);

       bank.listCustomers("ING_SUCURSALA_UNIRII", true);

    }
}
