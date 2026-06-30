import java.util.*;

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int count = 1; 
        result.add(nums[0]); 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                
                if (count < k) {
                    result.add(nums[i]);
                }
                count++;
            } else {
        
                result.add(nums[i]);
                count = 1; 
            }
        }


        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
