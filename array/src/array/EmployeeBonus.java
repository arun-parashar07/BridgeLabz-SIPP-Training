package array;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaries[i] = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextInt();

            while (salaries[i] <= 0) {
                System.out.print("Enter positive salary: ");
                salaries[i] = sc.nextDouble();
            }
            while (yearsOfService[i] < 0) {
                System.out.print("Enter valid years of service: ");
                yearsOfService[i] = sc.nextInt();
            }

            double bonusPercent = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            double bonus = salaries[i] * bonusPercent;
            double newSalary = salaries[i] + bonus;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;

            System.out.println("Employee " + (i+1) + " Bonus: " + bonus + ", New Salary: " + newSalary);
        }

        System.out.println("Total Bonus paid: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}