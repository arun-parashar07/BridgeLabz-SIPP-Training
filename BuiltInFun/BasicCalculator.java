package BuiltInFun;
import java.util.*;

public class BasicCalculator {
	public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return b != 0 ? a / b : Double.NaN; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose operation (+, -, *, /): ");
        String op = scanner.next();
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        switch (op) {
            case "+": System.out.println("Result: " + add(a, b)); break;
            case "-": System.out.println("Result: " + subtract(a, b)); break;
            case "*": System.out.println("Result: " + multiply(a, b)); break;
            case "/": System.out.println("Result: " + divide(a, b)); break;
            default: System.out.println("Invalid operation");
        }
        scanner.close();
    }
}
