interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();
    public double getPrice() { return price; }

    public void displayFinalPrice() {
        double finalPrice = price + ((this instanceof Taxable) ? ((Taxable)this).calculateTax() : 0) - calculateDiscount();
        System.out.println("Final Price for " + name + ": ₹" + finalPrice);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product {
    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.20; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.05; }
}

class ECommerceTest {
    public static void main(String[] args) {
        Product p1 = new Electronics("E101", "Laptop", 60000);
        Product p2 = new Clothing("C202", "Shirt", 2000);
        Product p3 = new Groceries("G303", "Rice", 1000);
        p1.displayFinalPrice();
        p2.displayFinalPrice();
        p3.displayFinalPrice();
    }
}