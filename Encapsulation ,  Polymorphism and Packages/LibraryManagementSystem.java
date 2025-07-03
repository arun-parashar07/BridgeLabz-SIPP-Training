interface Reservable {
    void reserveItem(String user);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 14; }

    public void reserveItem(String user) {
        System.out.println("Book reserved for: " + user);
    }

    public boolean checkAvailability() { return true; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 7; }

    public void reserveItem(String user) {
        System.out.println("Magazine reserved for: " + user);
    }

    public boolean checkAvailability() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 5; }

    public void reserveItem(String user) {
        System.out.println("DVD reserved for: " + user);
    }

    public boolean checkAvailability() { return false; }

    public static void main(String[] args) {
        LibraryItem item = new Book("B101", "Java Programming", "James");
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
    }
}