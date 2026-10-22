class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        for (int x : aliceSizes) sum1 += x;
        for (int x : bobSizes) sum2 += x;

        int diff = (sum1 - sum2) / 2;
        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (a - b == diff) {
                    return new int[]{a, b};
                }
            }
        }
        // 👇 this return must be inside the method
        return new int[]{0, 0};
    }
}
