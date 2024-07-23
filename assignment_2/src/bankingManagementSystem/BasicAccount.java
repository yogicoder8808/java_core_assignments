package bankingManagementSystem;

public class BasicAccount extends Account {

    public BasicAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited " + amount + " into account " + getAccountNumber());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + " from account " + getAccountNumber());
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    @Override
    public void transfer(Account toAccount, double amount) {
        if (amount > 0 && amount <= getBalance()) {
            withdraw(amount);
            toAccount.deposit(amount);
            addTransaction(new Transaction("Transfer", amount, "Transferred " + amount + " to account " + toAccount.getAccountNumber()));
            toAccount.addTransaction(new Transaction("Transfer", amount, "Received " + amount + " from account " + getAccountNumber()));
            System.out.println("Transferred " + amount + " from account " + getAccountNumber() + " to account " + toAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    @Override
    public void viewDetails() {
        System.out.println("Account Number: " + getAccountNumber() + ", Customer: " + getCustomer().getName() + ", Balance: " + getBalance());
        System.out.println("Transaction History: " + getTransactions());
    }
}

