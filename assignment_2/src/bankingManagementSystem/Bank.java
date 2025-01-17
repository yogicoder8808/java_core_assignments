package bankingManagementSystem;

public class Bank {
    private Account[] accounts;
    private int accountCount;

    // Constructor
    public Bank(int capacity) {
        this.accounts = new Account[capacity];
        this.accountCount = 0;
    }

    // Method to open a new account
    public Account openAccount(String accountNumber, Customer customer) {
        if (accountCount < accounts.length) {
            Account newAccount = new BasicAccount(accountNumber, customer);
            accounts[accountCount++] = newAccount;
            System.out.println("Account " + accountNumber + " opened for " + customer.getName());
            return newAccount;
        } else {
            System.out.println("Account limit reached.");
        }
        return null;
    }

    // Method to get account by number
    public Account getAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc != null && acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
}
