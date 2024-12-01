public class Bank {
    public static void main(String[] args) {
        // Create an account using the no-argument constructor
        Account account1 = new Account();
        System.out.println("Account 1:");
        account1.displayBalance(); // Initial balance should be 0
        account1.deposit(500); // Deposit 500
        account1.withdraw(200); // Withdraw 200
        account1.displayBalance(); // Display remaining balance

        System.out.println();

        // Create an account using the parameterized constructor
        Account account2 = new Account(1000);
        System.out.println("Account 2:");
        account2.displayBalance(); // Initial balance should be 1000
        account2.deposit(300); // Deposit 300
        account2.withdraw(1500); // Attempt to withdraw 1500 (should fail)
        account2.withdraw(500); // Withdraw 500
        account2.displayBalance(); // Display remaining balance
    }
}
