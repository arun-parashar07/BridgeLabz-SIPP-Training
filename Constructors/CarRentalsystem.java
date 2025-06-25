package Java_Constructor;
import java.util.*;

class CarRental{
	String customerName;
	String carModel;
	int Days;
	double DailyRate;
	
	CarRental(){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name of the customer");
		this.customerName= sc.nextLine();
		System.out.println("enter the model of the 'SEDAN','SUV' , 'hatchaback'");
		this.carModel = sc.nextLine();
		System.out.println("enter the days for car rent");
		this.Days =sc.nextInt();
		
		switch (carModel.toLowerCase()) {
		case "sedan":
			this.DailyRate=2000;
			break;
		case "suv":
			this.DailyRate=3000;
			break;
		case "hatchakback":
			this.DailyRate=1500;
			break;
		default:
			this.DailyRate=1000;
		}
	}
	
	double calculateTotalCost() {
		return DailyRate*Days;
	}
	void display() {
		System.out.println("the car details");
		System.out.println("the Name of the cutomer "+customerName);
		System.out.println("the Model of the car "+carModel);
		System.out.println("the number of days for rental the car "+Days+" and the total cost of rental car is "+calculateTotalCost());
	}
}
public class CarRentalsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRental rent = new CarRental();
		rent.display();
	}

}
