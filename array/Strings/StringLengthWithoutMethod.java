import java.util.Scanner;

public class StringLengthWithoutMethod {
    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("Custom Length: " + customLength(input));
        System.out.println("Built-in Length: " + input.length());
    }
}
