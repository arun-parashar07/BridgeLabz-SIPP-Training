interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: ₹" + price + ", Quantity: " + quantity);
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }

    public String getDiscountDetails() {
        return "10% discount on Veg items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 30; // extra charge
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% discount on Non-Veg items";
    }

    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer", 150, 2);
        FoodItem f2 = new NonVegItem("Chicken", 250, 2);

        f1.getItemDetails();
        System.out.println("Total: ₹" + f1.calculateTotalPrice());

        f2.getItemDetails();
        System.out.println("Total: ₹" + f2.calculateTotalPrice());
    }
}
