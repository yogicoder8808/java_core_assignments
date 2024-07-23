package bankingManagementSystem;

public class BankingSystem {

    public static void main(String[] args) {

        Bank bank = new Bank(10); 

        Customer customer1 = new Customer("A Yogi", "C001");
        Customer customer2 = new Customer("A Yo", "C002");
        Account account1 = bank.openAccount("A001", customer1);
        Account account2 = bank.openAccount("A002", customer2);

        account1.deposit(500);
        account1.withdraw(200);
        account1.transfer(account2, 100);


        // View account details
        account1.viewDetails();
        account2.viewDetails();
    }
}

