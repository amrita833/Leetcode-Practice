
        class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans = -1;
        int maxFreq = 0;

        // Outer loop: pick each element
        for (int i = 0; i < nums.length; i++) {
            // skip odd numbers
            if (nums[i] % 2 != 0) continue;

            // check if already counted before
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;

            // Inner loop: count frequency of nums[i]
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Update answer if frequency is higher
            if (count > maxFreq || (count == maxFreq && (ans == -1 || nums[i] < ans))) {
                maxFreq = count;
                ans = nums[i];
            }
        }

        return ans;
    }
}

        
    