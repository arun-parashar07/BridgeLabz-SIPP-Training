package search.linear;

public class FirstNegativeLinearSearch {
    public int findFirstNegative(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) return i;
        }
        return -1;
    }
}
