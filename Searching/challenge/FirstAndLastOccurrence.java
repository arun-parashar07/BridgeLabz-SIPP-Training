package search.binary;

public class FirstAndLastOccurrence {
    public int[] findFirstLast(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = findOccurrence(arr, target, true);
        result[1] = findOccurrence(arr, target, false);
        return result;
    }

    private int findOccurrence(int[] arr, int target, boolean first) {
        int left = 0, right = arr.length - 1, index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                index = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return index;
    }
}
