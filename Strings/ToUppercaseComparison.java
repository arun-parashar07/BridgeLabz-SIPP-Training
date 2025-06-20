import java.util.Scanner;

public class ToUppercaseComparison {
    public static String customToUpperCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch -= 32;
            result += ch;
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String userDefined = customToUpperCase(text);
        String builtIn = text.toUpperCase();
        System.out.println("Match: " + compare(userDefined, builtIn));
    }
}
