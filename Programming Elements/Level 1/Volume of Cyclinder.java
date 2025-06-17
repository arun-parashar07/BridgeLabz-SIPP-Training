import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius and height of the cylinder: ");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);
        scanner.close();
    }
}
