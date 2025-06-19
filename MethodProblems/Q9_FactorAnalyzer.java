package methodsSheetSolutions;

import java.util.Scanner;

public class Q9_FactorAnalyzer {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int i : arr) prod *= i;
        return prod;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int i : arr) sum += Math.pow(i, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum of factors: " + sum(factors));
        System.out.println("Product of factors: " + product(factors));
        System.out.printf("Sum of squares of factors: %.2f%n", sumOfSquares(factors));
    }
}
