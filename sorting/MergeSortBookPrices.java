package sorting;

public class MergeSortBookPrices {
    public void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    private void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = prices[left + i];
        for (int j = 0; j < n2; j++) R[j] = prices[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            prices[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        while (i < n1) prices[k++] = L[i++];
        while (j < n2) prices[k++] = R[j++];
    }
}
