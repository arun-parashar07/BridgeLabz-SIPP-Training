//Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

package aa;
import java.util.Scanner;
public class votingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		int age = object.nextInt();
		if(age > 18) {
			System.out.println("The Person is able to vote");
		}
		else {
			System.out.println("cant vote");
		}
		object.close();
	}

}

