package methodsSheetSolutions;

import java.util.Scanner;

public class Q5_HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Maximum number of handshakes: " + calculateHandshakes(n));
    }
}
