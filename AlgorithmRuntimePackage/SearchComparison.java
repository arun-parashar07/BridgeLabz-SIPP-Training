import java.util.Arrays;

public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] dataset = new int[100000];
        for (int i = 0; i < dataset.length; i++) dataset[i] = i;
        int target = 99999;

        long start = System.nanoTime();
        linearSearch(dataset, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) + " ns");

        Arrays.sort(dataset);
        start = System.nanoTime();
        binarySearch(dataset, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) + " ns");
    }
}