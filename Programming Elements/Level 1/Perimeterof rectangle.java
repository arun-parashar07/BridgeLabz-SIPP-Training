import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length and width of the rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        scanner.close();
    }
}
