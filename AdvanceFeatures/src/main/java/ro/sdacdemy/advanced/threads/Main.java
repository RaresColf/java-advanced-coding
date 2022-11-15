package ro.sdacdemy.advanced.threads;

/**
 *
 *         Create and start threads.
 *
 *         Create first a BankAccount class which will have a double balance and a String accountNumber.
 *         The class should  contain the following methods:
 *         - a constructor which initialize both fields
 *         - a method deposit which adds to the account balance
 *         - a method withdraw which subtracts from the account balance
 *         - toString() method which prints the account details
 *
 *         We could have two people using a joint bank account at the same time.
 *         Create and start two threads that use the same BankAccount instance and an initial balance of $1000.00.
 *         One will deposit $300.00 into the bank account, and then withdraw $50.00.
 *         The other will deposit $203.75 and then withdraw $100.00
 *
 *         After testing how multithreading non-safe behaviour is working, we need to make the methods thread-safe
 *         */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        final BankAccount account = new BankAccount(1000.0, "BGT1234");

        Thread t1 = new Thread(){
            @Override
            public void run() {

                account.deposit(300);

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("t1: " + Thread.currentThread().getName());
                account.withdraw(50);
            }
        };



        Thread t2 = new Thread(){
            @Override
            public void run() {
                account.deposit(203.75);
                System.out.println("t2: " + Thread.currentThread().getName());
                account.withdraw(100);
            }
        };


        Thread t3 = new Thread(){
            @Override
            public void run() {
                account.deposit(510.25);
                System.out.println("t3: " + Thread.currentThread().getName());
                account.withdraw(25);

            }
        };

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(3);

        System.out.println(account);

    }


}