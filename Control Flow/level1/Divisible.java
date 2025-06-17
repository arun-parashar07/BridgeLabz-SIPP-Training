package ControlflowLevel1;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number %5 ==0) {
			System.out.println("divisible by 5");
		}
		else {
			System.out.println("not divisible by 5");
		}

	}

}
