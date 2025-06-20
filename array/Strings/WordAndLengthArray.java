import java.util.Scanner;
import java.util.ArrayList;

public class WordAndLengthArray {
    public static String[] splitWords(String text) {
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        for (char c : (text + " ").toCharArray()) {
            if (c != ' ') word += c;
            else {
                if (!word.isEmpty()) list.add(word);
                word = "";
            }
        }
        return list.toArray(new String[0]);
    }

    public static int customLength(String s) {
        int i = 0;
        try {
            while (true) s.charAt(i++);
        } catch (Exception e) {}
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        System.out.printf("%-10s %s\n", "Word", "Length");
        for (String w : words)
            System.out.printf("%-10s %d\n", w, customLength(w));
    }
}
