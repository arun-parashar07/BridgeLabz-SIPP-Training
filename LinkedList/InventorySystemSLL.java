class Item {
    String name, id;
    int quantity;
    double price;
    Item next;

    Item(String name, String id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventorySystemSLL {
    static Item head = null;

    public static void addItem(String name, String id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public static void removeItem(String id) {
        if (head == null) return;
        if (head.id.equals(id)) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && !temp.next.id.equals(id)) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public static void updateQuantity(String id, int qty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id.equals(id)) {
                temp.quantity = qty;
                return;
            }
            temp = temp.next;
        }
    }

    public static void searchItem(String keyword) {
        Item temp = head;
        while (temp != null) {
            if (temp.id.equalsIgnoreCase(keyword) || temp.name.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + temp.name + " - Qty: " + temp.quantity + " - Price: " + temp.price);
            }
            temp = temp.next;
        }
    }

    public static void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " (" + temp.id + ") - Qty: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    public static void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    public static void main(String[] args) {
        addItem("Pen", "I001", 100, 10.5);
        addItem("Notebook", "I002", 50, 25.0);
        displayInventory();
        updateQuantity("I002", 60);
        searchItem("Notebook");
        calculateTotalValue();
        removeItem("I001");
        System.out.println("After Removal:");
        displayInventory();
    }
}
