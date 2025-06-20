
import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String input) {
        int number = Integer.parseInt(input); // Might throw NumberFormatException
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to parse: ");
        String text = scanner.next();

        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        handleException(text);
    }
}
