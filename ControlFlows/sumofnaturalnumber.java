//Write a program to check for the natural number and write the sum of n natural numbers 
package aa;
import java.util.Scanner;
public class sumofnaturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner object = new Scanner(System.in);
	int num = object.nextInt(10);
	int sum = num*(num + 1) / 2;
	if(num > 0 ) {
		System.out.println("total suum of these natural numbers is " + sum);
	}
	else {
		System.out.println("invalid input");
	}
	object.close();
	}

}
