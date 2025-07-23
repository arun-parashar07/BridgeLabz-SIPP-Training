package JavaGenericsPackage;

public class MainMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 1200.0, new ClothingCategory());

        System.out.println("Original Book Price: " + book.getPrice());
        MarketplaceUtils.applyDiscount(book, 10);
        System.out.println("Discounted Book Price: " + book.getPrice());

        System.out.println("Original Shirt Price: " + shirt.getPrice());
        MarketplaceUtils.applyDiscount(shirt, 15);
        System.out.println("Discounted Shirt Price: " + shirt.getPrice());
    }
}
