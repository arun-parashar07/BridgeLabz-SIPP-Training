import java.util.ArrayList;

class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        Customer cust = new Customer("Ravi");
        bank.openAccount(cust);
        cust.deposit(5000);
        cust.viewBalance();
    }
}