package ControlflowLevel1;
import java.util.Scanner;
public class Smallestnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1<num2 && num1<num3) {
			System.out.println("number 1 is the smallest no between numbers");
		}
		else {
			System.out.println("not");
		}

		
		

		
	}

}
