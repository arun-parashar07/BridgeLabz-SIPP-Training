package problems.hashmap;

import java.util.*;

public class PairWithGivenSum {
    public boolean hasPair(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(target - num)) return true;
            seen.add(num);
        }
        return false;
    }
}
