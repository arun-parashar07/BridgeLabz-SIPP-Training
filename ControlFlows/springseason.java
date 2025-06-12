//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
package aa;
import java.util.Scanner;
public class springseason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		March 20 → March 31
//
//		April 1 → April 30
//
//		May 1 → May 31
//
//		June 1 → June 20
//		above is the limit for the springseason
		Scanner object = new Scanner (System.in);
		System.out.println("tell about the number of month you want to check");
		int month = object.nextInt() ;
		System.out.println("tell about the number of day you want to check");
		int day = object.nextInt();
		if((month == 3 && day > 20 && day < 31)||
	    (month == 4 && day > 1 && day < 30)||
		(month == 5 && day > 1 && day < 31)||
		(month == 6 && day > 1 && day < 20)){
			System.out.println("Yes , it is a springSeason");
		}
		else {
			System.out.println("No, this is not the part of springseason");
		}object.close();
				
		
	}

}
