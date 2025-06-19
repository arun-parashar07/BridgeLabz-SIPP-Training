package methodsSheetSolutions;

import java.util.Scanner;

public class Q21_NumberChecker5 {
    public static int[] properDivisors(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) count++;
        int[] divs = new int[count];
        int index = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) divs[index++] = i;
        return divs;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static boolean isPerfect(int n) {
        return sum(properDivisors(n)) == n;
    }

    public static boolean isAbundant(int n) {
        return sum(properDivisors(n)) > n;
    }

    public static boolean isDeficient(int n) {
        return sum(properDivisors(n)) < n;
    }

    public static boolean isStrong(int n) {
        int sumFact = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sumFact += factorial(digit);
            temp /= 10;
        }
        return sumFact == n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
