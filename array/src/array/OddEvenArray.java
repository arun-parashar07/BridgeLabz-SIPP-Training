package array;
import java.util.*;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Enter a natural number");
            return;
        }

        int maxSize = number / 2 + 1;
        int[] oddNumbers = new int[maxSize];
        int[] evenNumbers = new int[maxSize];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.println("Odd numbers: " + Arrays.toString(Arrays.copyOf(oddNumbers, oddIndex)));
        System.out.println("Even numbers: " + Arrays.toString(Arrays.copyOf(evenNumbers, evenIndex)));
    }
}