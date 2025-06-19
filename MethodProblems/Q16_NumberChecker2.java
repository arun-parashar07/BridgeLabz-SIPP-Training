package methodsSheetSolutions;

import java.util.Scanner;

public class Q16_NumberChecker2 {
    public static int[] extractDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d * d;
        return sum;
    }

    public static boolean isHarshad(int number, int sumDigits) {
        return number % sumDigits == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] digits = extractDigits(n);
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Harshad number: " + isHarshad(n, sum));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] row : freq) {
            if (row[1] > 0)
                System.out.println("Digit " + row[0] + " appears " + row[1] + " time(s)");
        }
    }
}
