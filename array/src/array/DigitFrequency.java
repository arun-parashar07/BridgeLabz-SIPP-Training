package array;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] frequency = new int[10];
        int tempNumber = number;

        if (number == 0) {
            frequency[0] = 1; // special case for zero
        }

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            frequency[digit]++;
            tempNumber /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] != 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
    }
}