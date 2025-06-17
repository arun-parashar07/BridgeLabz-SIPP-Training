package ControlflowLevel1;

import java.util.Scanner;

public class Bonush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05; 
            System.out.printf("Congratulations! You are eligible for a bonus of: $%.2f\n", bonus);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        scanner.close();
    }
}
