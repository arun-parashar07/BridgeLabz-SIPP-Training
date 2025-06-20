import java.util.Scanner;

public class WordLengthFinder {
    public static String[] splitWords(String text) {
        text = text.trim() + " ";
        String word = "";
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                if (!word.isEmpty()) list.add(word);
                word = "";
            } else word += c;
        }
        return list.toArray(new String[0]);
    }

    public static int customLength(String word) {
        int i = 0;
        try {
            while (true) {
                word.charAt(i);
                i++;
            }
        } catch (Exception e) {}
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        int min = Integer.MAX_VALUE, max = 0;
        String smallest = "", largest = "";

        for (String word : words) {
            int len = customLength(word);
            if (len < min) {
                min = len;
                smallest = word;
            }
            if (len > max) {
                max = len;
                largest = word;
            }
        }

        System.out.println("Shortest: " + smallest + " (" + min + ")");
        System.out.println("Longest: " + largest + " (" + max + ")");
    }
}
