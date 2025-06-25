package Java_Constructor;
import java.util.*;

class LBooks{
	String title;
	String author;
	int price;
	boolean available;
	
	LBooks(String title,String author,int price,boolean available){
		this.title=title;
		this.author=author;
		this.price=price;
		this.available=available;
	}
	void display() {
		System.out.println("\nBook Details:");
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : ₹" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
	}
	void borrowBook() {
		if(available) {
			available=false;
			System.out.println("You have successfully borrowed the book: " + title);
		}
		else {
			System.out.println("❌ Sorry, the book '" + title + "' is not available.");
		}
	}
	
}
public class LibraryBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		LBooks book=new LBooks("Atomic Habits", "James Clear", 399, true);
		book.display();
		
		System.out.println("\n Do you want to borrow this book ? (yes/no");
		String choice = sc.next().toLowerCase();
		
		if(choice.equals("yes")){
			book.borrowBook();
		}
		else {
			System.out.println("No problem. You can borrow it later.");
		}
		book.display();
	}

}
