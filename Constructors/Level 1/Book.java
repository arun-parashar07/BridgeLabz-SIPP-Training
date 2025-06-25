package Java_Constructor;
import java.util.*;

class bookDetails{
	String title;
	String author;
	int price;
	
	bookDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the story");
		String title=sc.nextLine();
		this.title=title;
		System.out.println("Enetr the name of the Author");
		String author =sc.nextLine();
		this.author=author;
		System.out.println("Ennter the Price of the Book");
		int price = sc.nextInt();
		this.price=price;
		sc.close();
	}
	bookDetails(String title,String author , int price){
		this.title = title;
		this.author=author;
		this.price=price;
	}
	void display() {
		System.out.println("the Title of the story( "+title+" )and the Author of the story( "+author+" )and the price of the book( "+price+" )\n");
	}
}
public class Book {

	public static void main(String[] args) {
		bookDetails obj1=new bookDetails();
		obj1.display();
		
		bookDetails obj=new bookDetails("deep water","J.k arun",1024);
		obj.display();
		

	}

}
