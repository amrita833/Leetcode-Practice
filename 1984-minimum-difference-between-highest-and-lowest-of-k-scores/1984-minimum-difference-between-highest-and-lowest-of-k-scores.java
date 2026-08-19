import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums); // Step 1: sort the array
        int minDiff = Integer.MAX_VALUE;

        // Step 2: check every window of size k
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
