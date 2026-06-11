class Solution {
    public int minimumSwaps(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int i = 0, j = n - 1;

        while (i < j) {
            while (i < n && nums[i] != 0) i++;   // find zero from left
            while (j > 0 && nums[j] == 0) j--;   // find non-zero from right

            if (i >= j) break;

            // swap zero at i with non-zero at j
            ans++;
            i++;
            j--;
        }
        return ans;
    }
}
