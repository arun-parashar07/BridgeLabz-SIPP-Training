public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

class ItemTest {
    public static void main(String[] args) {
        Item item = new Item(1001, "Pen", 10.5);
        item.displayItemDetails();
        System.out.println("Total Cost (for 5): ₹" + item.calculateTotalCost(5));
    }
}