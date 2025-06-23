package BuiltInFun;
import java.util.*;

public class GCD_LCM {
	 public static int gcd(int a, int b) {
	        return b == 0 ? a : gcd(b, a % b);
	    }

	    public static int lcm(int a, int b) {
	        return a * b / gcd(a, b);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int x = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int y = scanner.nextInt();
	        System.out.println("GCD: " + gcd(x, y));
	        System.out.println("LCM: " + lcm(x, y));
	        scanner.close();
	    }
}
