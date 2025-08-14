import java.io.*;
import java.util.*;
public class Q10_CountWords {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        map.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .limit(5)
            .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}