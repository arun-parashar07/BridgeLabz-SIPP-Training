import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
        scanner.close();
    }
}
