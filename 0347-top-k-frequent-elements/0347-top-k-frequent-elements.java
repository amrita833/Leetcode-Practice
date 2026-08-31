import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }

        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());

        
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
