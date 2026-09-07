import java.util.*;

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> ans = new HashSet<>();

        for (int i = 0; i < 20 && Math.pow(x, i) <= bound; i++) {
            for (int j = 0; j < 20 && Math.pow(y, j) <= bound; j++) {
                int val = (int)Math.pow(x, i) + (int)Math.pow(y, j);
                if (val <= bound) {
                    ans.add(val);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
