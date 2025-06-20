import java.util.Scanner;

public class VowelConsonantCounter {
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int vowels = 0, consonants = 0;

        for (char c : text.toCharArray()) {
            if (isLetter(c)) {
                if (isVowel(c)) vowels++;
                else consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
