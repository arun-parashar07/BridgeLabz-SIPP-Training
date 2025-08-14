import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWords(String text) {
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println(countWords(text));
    }
}
