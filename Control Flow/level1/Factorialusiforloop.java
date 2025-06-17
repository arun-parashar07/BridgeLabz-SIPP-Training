package ControlflowLevel1;
import java.util.Scanner;
public class Factorialusiforloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("enter valid number to find factorial");
			return;
		}else {
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		System.out.println("the factorial of number is"  +  factorial);
	}

}
}