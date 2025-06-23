package BuiltInFun;
import java.util.*;

public class PalindromeChecker {
	public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("'" + str + "' is " + (isPalindrome(str) ? "" : "not ") + "a palindrome.");
        scanner.close();
    }

}
