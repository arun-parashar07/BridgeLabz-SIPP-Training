package BuiltInFun;
import java.util.*;

public class primeChecker {
	public static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
	    }
	        return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		System.out.println(num + (isPrime(num) ? " is a prime number." : " is not a prime number."));
	    scanner.close();
	}

}
