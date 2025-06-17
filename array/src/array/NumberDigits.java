package array;

import java.util.Scanner;
import java.util.Arrays;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;
            if (index == maxDigit) {
                maxDigit *= 2;
                digits = Arrays.copyOf(digits, maxDigit);
            }
            digits[index++] = digit;
            number /= 10;
        }

        int largest = 0, secondLargest = 0;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}