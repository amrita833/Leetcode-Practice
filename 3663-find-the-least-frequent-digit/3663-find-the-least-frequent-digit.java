class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10]; // to count digits 0–9

        // count frequency of each digit
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int minFreq = Integer.MAX_VALUE;
        int result = 0;

        // find smallest digit with least frequency
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0 && freq[i] < minFreq) {
                minFreq = freq[i];
                result = i;
            }
        }

        return result;
    }
}
