//Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
package aa;
import java.util.Scanner;
public class RocketLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner (System.in);
		System.out.println("time for take off");
		int counter = object.nextInt();
		while(counter >= 1) {
			System.out.println(counter);
			counter--;
		}
		System.out.println("Ready to Take OFF!!");
		
		object.close();
	}

}
