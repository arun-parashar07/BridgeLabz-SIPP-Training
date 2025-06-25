package Java_Constructor;
import java.util.*;

class HotelBooking{
	String guestName;
	String Roomtype;
	int nights;
	
	HotelBooking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the name of the guest");
		this.guestName=sc.nextLine();
		System.out.println("Enetr the type of room u want [Delux , Super Delux , luxury]");
		this.Roomtype=sc.nextLine();
		System.out.println("Enter the number of nights you want to spend");
		this.nights=sc.nextInt();
		
		sc.close();
	}
	HotelBooking(String guestName,String Roomtype,int nights){
		this.guestName=guestName;
		this.Roomtype=Roomtype;
		this.nights=nights;
	}
	HotelBooking(HotelBooking c){
		this.guestName=c.guestName;
		this.Roomtype=c.Roomtype;
		this.nights=c.nights;
	}
	void display() {
		System.out.println("\nBooking Details");
		System.out.println("the name of the guest "+guestName);
		System.out.println("the type of room guest needed "+Roomtype);
		System.out.println("number of nights guest want to spend is "+nights);
	}
}
public class HotelBookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelBooking book=new HotelBooking();
		book.display();
		
		HotelBooking book1=new HotelBooking("Abhishek", "Super Delux" , 5);
		book1.display();
		
		HotelBooking book2=new HotelBooking(book);
		book2.display();
		
		HotelBooking book3=new HotelBooking(book1);
		book3.display();

	}

}
