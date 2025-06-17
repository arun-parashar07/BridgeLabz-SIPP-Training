package array;

import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[] heights = new double[number];
        double[] weights = new double[number];
        double[] BMI = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (meters) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();

            while (heights[i] <= 0) {
                System.out.print("Invalid height! Enter positive height: ");
                heights[i] = sc.nextDouble();
            }
            while (weights[i] <= 0) {
                System.out.print("Invalid weight! Enter positive weight: ");
                weights[i] = sc.nextDouble();
            }

            BMI[i] = weights[i] / (heights[i] * heights[i]);

            if (BMI[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (BMI[i] <= 24.9) {
                status[i] = "Normal";
            } else if (BMI[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + heights[i] + ", Weight: " + weights[i] + ", BMI: " + BMI[i] + ", Status: " + status[i]);
        }
    }
}