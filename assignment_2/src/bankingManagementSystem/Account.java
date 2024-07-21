package bankingManagementSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String accountNumber;
    private Customer customer;
    private double balance;
    private List<Transaction> transactions;

    // Constructor
    public Account(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }
  

    protected void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    // Abstract methods
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void transfer(Account toAccount, double amount);

    public abstract void viewDetails();

    // Protected methods for balance access
    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
