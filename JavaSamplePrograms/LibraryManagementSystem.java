package JavaSamplePrograms;

public class Book {
    private static String libraryName = "City Library";

    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("ISBN1234", "Java Basics", "Jane Smith");
        displayLibraryName();
        book1.displayDetails();
    }
}
