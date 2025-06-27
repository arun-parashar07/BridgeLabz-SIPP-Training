import java.util.ArrayList;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) {
            System.out.println("- " + p.name + ": ₹" + p.price);
        }
    }
}

class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public Order placeOrder(Product... items) {
        Order o = new Order();
        for (Product p : items) {
            o.addProduct(p);
        }
        return o;
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Phone", 20000);
        Product p2 = new Product("Charger", 1500);
        Customer c = new Customer("Karan");
        Order o = c.placeOrder(p1, p2);
        o.showOrder();
    }
}