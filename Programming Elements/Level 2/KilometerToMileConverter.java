package operators;

import java.util.Scanner;

public class KilometerToMileConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble(); 

        double conversionFactor = 1.6;
        double miles = km / conversionFactor; 

        System.out.println(String.format(
            "The total miles is %.2f miles for the given %.2f km",
            miles, km
        ));

        input.close();
    }
}

