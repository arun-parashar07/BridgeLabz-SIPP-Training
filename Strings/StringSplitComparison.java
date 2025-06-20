import java.util.*;

public class StringSplitComparison {
    public static String[] customSplit(String text) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') word += ch;
            else if (!word.isEmpty()) {
                words.add(word);
                word = "";
            }
        }
        if (!word.isEmpty()) words.add(word);
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] builtin = text.split(" ");
        String[] custom = customSplit(text);

        System.out.println("Match: " + compareArrays(builtin, custom));
    }
}
