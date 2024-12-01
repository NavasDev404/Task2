public class Account {

    // Data member for balance
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0; // Default balance is 0
    }

    // Parameterized constructor
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        }
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
