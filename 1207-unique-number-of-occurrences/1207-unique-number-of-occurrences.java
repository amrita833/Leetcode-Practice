import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count frequencies of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check if frequencies are unique
        Set<Integer> freqSet = new HashSet<>(freqMap.values());

        // If set size == map size, all frequencies are unique
        return freqMap.size() == freqSet.size();
    }
}
