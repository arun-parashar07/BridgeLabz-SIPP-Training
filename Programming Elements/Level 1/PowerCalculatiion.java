import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        double base = scanner.nextDouble();
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
        scanner.close();
    }
}
