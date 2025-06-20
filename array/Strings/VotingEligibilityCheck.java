import java.util.Scanner;

public class VotingEligibilityCheck {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = (int)(Math.random() * 40);
        return ages;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = generateAges(n);

        System.out.printf("%-5s %-10s\n", "Age", "Can Vote?");
        for (int age : ages) {
            boolean eligible = age >= 18;
            System.out.printf("%-5d %-10s\n", age, eligible ? "Yes" : "No");
        }
    }
}
