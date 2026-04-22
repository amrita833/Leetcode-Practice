import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);   // duplicates remove
        }

        // agar 3 se kam unique elements hain
        if(set.size() < 3){
            int max = Integer.MIN_VALUE;
            for(int num : set){
                max = Math.max(max, num);
            }
            return max;
        }

        // third max nikalna
        for(int i = 0; i < 2; i++){
            int max = Integer.MIN_VALUE;
            for(int num : set){
                max = Math.max(max, num);
            }
            set.remove(max);   // sabse bada remove karo
        }

        // ab set me third max bacha hai
        int thirdMax = Integer.MIN_VALUE;
        for(int num : set){
            thirdMax = Math.max(thirdMax, num);
        }

        return thirdMax;
    }
}