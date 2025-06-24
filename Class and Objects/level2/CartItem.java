import java.util.ArrayList;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + totalCost());
    }
}

class CartItemTest {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Book", 250, 2);
        CartItem item2 = new CartItem("Pen", 20, 5);
        item1.displayItem();
        item2.displayItem();
    }
}