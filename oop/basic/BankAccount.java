package oop.basic;

/**
 * Write a class named BankAccount representing a bank account. Internally,
 * the class uses a double value for representing the balance of the account. The class provides the following methods:
 * <p>
 * public BankAccount() creating an empty account.
 * public BankAccount(double balance) creating an account with the specified balance.
 * public double getBalance() getting the current balance.
 * public void deposit(double amount) depositing the specific amount into the account.
 * public void withdraw(double amount) withdrawing the specified amount from the account.
 */
public class BankAccount {
    /**
     * the class uses a double value for representing the balance of the account
     */
    double balance;

    /**
     * * public BankAccount() creating an empty account.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * public BankAccount(double balance) creating an account with the specified balance.
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * * public double getBalance() getting the current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * * public void deposit(double amount) depositing the specific amount into the account.
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * * public void withdraw(double amount) withdrawing the specified amount from the account.
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }
}
