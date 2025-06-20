
import java.util.Scanner;

public class StringComparison {
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean customCompare = compareUsingCharAt(str1, str2);
        boolean builtInCompare = str1.equals(str2);

        System.out.println("Custom comparison result: " + customCompare);
        System.out.println("Built-in equals() result: " + builtInCompare);
    }
}
