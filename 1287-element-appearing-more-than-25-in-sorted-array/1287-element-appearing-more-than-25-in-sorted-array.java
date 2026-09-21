
class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int n = arr.length;
        for (int key : mp.keySet()) {
            int frq = mp.get(key);
            if (frq > n / 4) {
                return key;
            }
        }

        return -1;
    }
}
