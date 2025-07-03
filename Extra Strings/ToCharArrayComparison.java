import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayComparison {
    public static char[] customToCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    public static boolean compare(char[] a, char[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] c1 = customToCharArray(text);
        char[] c2 = text.toCharArray();
        System.out.println("Match: " + compare(c1, c2));
    }
}
