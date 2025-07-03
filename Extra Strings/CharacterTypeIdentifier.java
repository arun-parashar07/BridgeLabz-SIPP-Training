import java.util.Scanner;

public class CharacterTypeIdentifier {
    public static String getType(char c) {
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z') {
            return "aeiou".indexOf(c) != -1 ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("%-10s %s\n", "Char", "Type");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.printf("%-10c %s\n", ch, getType(ch));
        }
    }
}
