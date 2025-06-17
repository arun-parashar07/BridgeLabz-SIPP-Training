package array;

import java.util.Scanner;

public class RangeMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication table of " + number + " for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}