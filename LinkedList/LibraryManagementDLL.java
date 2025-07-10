class Book {
    String title, author, genre, id;
    boolean available;
    Book prev, next;

    Book(String title, String author, String genre, String id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
    }
}

public class LibraryManagementDLL {
    static Book head = null, tail = null;

    public static void addBook(String title, String author, String genre, String id, boolean available) {
        Book newBook = new Book(title, author, genre, id, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public static void removeBook(String id) {
        Book temp = head;
        while (temp != null && !temp.id.equals(id)) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
    }

    public static void updateAvailability(String id, boolean available) {
        Book temp = head;
        while (temp != null) {
            if (temp.id.equals(id)) {
                temp.available = available;
                return;
            }
            temp = temp.next;
        }
    }

    public static void searchBook(String keyword) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                System.out.println("Book Found: " + temp.title + " by " + temp.author);
            }
            temp = temp.next;
        }
    }

    public static void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " [" + (temp.available ? "Available" : "Checked Out") + "]");
            temp = temp.next;
        }
    }

    public static void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " [" + (temp.available ? "Available" : "Checked Out") + "]");
            temp = temp.prev;
        }
    }

    public static void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books: " + count);
    }

    public static void main(String[] args) {
        addBook("Java", "James", "CS", "B101", true);
        addBook("DSA", "Alice", "CS", "B102", false);
        displayForward();
        updateAvailability("B102", true);
        removeBook("B101");
        countBooks();
        System.out.println("Reverse Display:");
        displayReverse();
    }
}
