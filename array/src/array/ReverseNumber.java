package array;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int tempNumber = number;
        int countDigits = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            countDigits++;
        }

        int[] digits = new int[countDigits];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
    }
}