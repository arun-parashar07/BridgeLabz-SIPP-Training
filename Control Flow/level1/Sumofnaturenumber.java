package ControlflowLevel1;
import java.util.Scanner;
public class Sumofnaturenumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sumofnatunumber= (number * (number+1) / 2 );
		if(number>=1) {
			System.out.println("The sum of" + number + "natural numbers is" + sumofnatunumber);

		}
		else {
			System.out.println("number is not an nature number:- ");
		}
	}

}
