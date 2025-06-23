package BuiltInFun;
import java.util.*;

public class TemperatureConverter {
	public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Convert from (F)ahrenheit or (C)elsius? ");
        String choice = scanner.nextLine().toUpperCase();
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice.equals("F")) {
            System.out.println("In Celsius: " + fToC(temp));
        } else {
            System.out.println("In Fahrenheit: " + cToF(temp));
        }
        scanner.close();
    }
}
