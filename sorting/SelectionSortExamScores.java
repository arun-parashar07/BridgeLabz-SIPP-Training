package sorting;

public class SelectionSortExamScores {
    public void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
    }
}
