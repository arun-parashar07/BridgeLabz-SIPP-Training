import java.util.Arrays;
import java.util.Random;

public class SortComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(10000, 0, 100000).toArray();

        int[] copy1 = arr.clone();
        int[] copy2 = arr.clone();
        int[] copy3 = arr.clone();

        long start = System.nanoTime();
        bubbleSort(copy1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort: " + (end - start) + " ns");

        start = System.nanoTime();
        Arrays.sort(copy2);
        end = System.nanoTime();
        System.out.println("Quick Sort (Arrays.sort): " + (end - start) + " ns");

        start = System.nanoTime();
        Arrays.parallelSort(copy3);
        end = System.nanoTime();
        System.out.println("Merge Sort (parallelSort): " + (end - start) + " ns");
    }
}