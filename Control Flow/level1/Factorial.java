package ControlflowLevel1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("enter valid number to find factorial");
			return;
		}
		int i=1;
		long factorial=1;
		while(i<=num) {
			factorial*=i;
			i++;
		}
		System.out.println("the factorial of number is"  +  factorial);
	}

}
