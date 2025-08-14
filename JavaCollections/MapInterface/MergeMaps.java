import java.util.*;

public class MergeMaps {
    public static Map<String, Integer> merge(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> result = new HashMap<>(m1);
        for (Map.Entry<String, Integer> entry : m2.entrySet()) {
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> m1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> m2 = Map.of("B", 3, "C", 4);
        System.out.println("Merged Map: " + merge(m1, m2));
    }
}
