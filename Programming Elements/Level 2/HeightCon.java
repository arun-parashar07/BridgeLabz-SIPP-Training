package operators;


import java.util.Scanner;

public class HeightCon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        double cmToInches = 2.54;
        int inchesPerFoot = 12;

        double totalInches = heightCm / cmToInches;

        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

        System.out.println(String.format(
            "Your height in cm is %.2f while in feet is %d and inches is %.2f",
            heightCm, feet, inches
        ));

        input.close(); 
    }
}

