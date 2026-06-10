import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int k = 0;
        for (int val : set) {
            nums[k] = val;
            k++;
        }

        return k;
    }
}
