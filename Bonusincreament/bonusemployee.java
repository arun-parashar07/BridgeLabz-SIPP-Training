//cap to find the employyees bonus based on their year of service 
package tech.com;
import java.util.Scanner;
public class bonusemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		System.out.println("Enter Your Salary");
		int salary = object.nextInt();
		System.out.println("Enter Your Years of doing Service");
		int year_of_service = object.nextInt();
		if(year_of_service > 5) {
			System.out.println("salary with increament is " + (salary + salary*.05) );
		}
		else {
			System.out.println("There is no increament");
		}object.close();
	}

}
