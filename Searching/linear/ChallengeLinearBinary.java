package search.challenge;

import java.util.Arrays;
import java.util.HashSet;

public class ChallengeLinearBinary {
    public int findFirstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int i = 1;
        while (set.contains(i)) i++;
        return i;
    }

    public int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
