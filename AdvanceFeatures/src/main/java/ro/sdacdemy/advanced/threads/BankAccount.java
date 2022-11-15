package ro.sdacdemy.advanced.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();
    }

    // when we make the method synchronized we mark it for the case when multiple threads tries to
    // access it, then the method will allow only one thread at the moment to access the method
    // and then after the execution it will force the tread the write the value to the ram memory
    public void withdraw(double amount){
        synchronized (this){
            balance -= amount;
        }
    }

    public void deposit(double amount){
        // t2 t3
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
