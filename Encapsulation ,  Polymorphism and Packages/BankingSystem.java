interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan requested for Savings Account");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan() {
        System.out.println("Loan requested for Current Account");
    }

    public double calculateLoanEligibility() {
        return getBalance() * 1.5;
    }

    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV101", "Ravi", 50000);
        BankAccount acc2 = new CurrentAccount("CUR102", "Seema", 30000);

        System.out.println(acc1.getHolderName() + " Interest: ₹" + acc1.calculateInterest());
        System.out.println(acc2.getHolderName() + " Interest: ₹" + acc2.calculateInterest());
    }
}