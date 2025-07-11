package problems.hashmap;

import java.util.*;

public class LongestConsecutiveSequence {
    public int longestSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int maxLen = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num, count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
