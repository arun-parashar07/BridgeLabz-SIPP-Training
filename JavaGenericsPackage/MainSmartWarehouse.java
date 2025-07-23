package JavaGenericsPackage;

import java.util.List;

public class MainSmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Wheat"));

        System.out.println("Electronics:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("Groceries:");
        Storage.displayItems(groceriesStorage.getItems());
    }
}
