package BuiltInFun;
import java.util.*;

public class FactorialRecursion {
	public static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
        scanner.close();
    }

}
