package JavaGenericsPackage;

abstract class ProductCategory {
    private String categoryName;
    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getCategoryName() {
        return categoryName;
    }
}

class BookCategory extends ProductCategory {
    public BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends ProductCategory {
    public ClothingCategory() {
        super("Clothing");
    }
}

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}

class MarketplaceUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
    }
}
