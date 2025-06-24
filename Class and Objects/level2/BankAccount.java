public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Neha", "1234567890", 10000);
        account.displayBalance();
        account.deposit(5000);
        account.withdraw(3000);
        account.displayBalance();
        account.withdraw(20000); // Test insufficient balance
    }
}