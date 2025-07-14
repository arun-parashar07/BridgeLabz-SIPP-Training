import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int size = 100000;
        int target = size - 1;

        // Array
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;

        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) break;
        }
        long end = System.nanoTime();
        System.out.println("Array search: " + (end - start) + " ns");

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) hashSet.add(i);

        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet search: " + (end - start) + " ns");

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) treeSet.add(i);

        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet search: " + (end - start) + " ns");
    }
}