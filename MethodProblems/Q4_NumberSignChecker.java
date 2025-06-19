package methodsSheetSolutions;

import java.util.Scanner;

public class Q4_NumberSignChecker {
    public static int checkSign(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = checkSign(num);
        if (result == 1) System.out.println("Positive number");
        else if (result == -1) System.out.println("Negative number");
        else System.out.println("Zero");
    }
}
