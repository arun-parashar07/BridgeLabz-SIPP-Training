package array;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3]; // height, weight, BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter height (meters) for person " + (i+1) + ":");
            double height = sc.nextDouble();
            System.out.println("Enter weight (kg) for person " + (i+1) + ":");
            double weight = sc.nextDouble();

            while (height <= 0) {
                System.out.println("Enter positive height:");
                height = sc.nextDouble();
            }
            while (weight <= 0) {
                System.out.println("Enter positive weight:");
                weight = sc.nextDouble();
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + personData[i][0] + ", Weight: " + personData[i][1] +
                               ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}