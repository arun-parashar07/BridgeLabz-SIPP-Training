package BuiltInFun;
import java.util.*;

public class MaxofThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = scanner.nextInt();
		System.out.print("Enter second number: ");
		int b = scanner.nextInt();
		System.out.print("Enter third number: ");
		int c = scanner.nextInt();
		
		int max = Math.max(a, Math.max(b, c));
		System.out.println("Maximum number is: " + max);
	    scanner.close();
	}

}
