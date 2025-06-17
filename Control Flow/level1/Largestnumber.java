package ControlflowLevel1;
import java.util.Scanner;
public class Largestnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers1,number2, number3");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("number 1 is the largest number" + "True");
			System.out.println("number 2is the largest number" + "false");
			System.out.println("number 3 is the largest number" + "false");

		}
		else if(num2>num3 && num2>num3) {
			System.out.println("number 1 is the largest number" + "false");
			System.out.println("number 2is the largest number" + "true");
			System.out.println("number 3 is the largest number" + "false");
			}else if(num3>num1 && num3>num1) {
				System.out.println("number 1 is the largest number" + "false");
				System.out.println("number 2is the largest number" + "false");
				System.out.println("number 3 is the largest number" + "true");		}

	}

}
