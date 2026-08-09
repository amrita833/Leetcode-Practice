class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;   // 0 aur 1 ke liye direct true

        long left = 2, right = num / 2;   // range set karo
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long guess = mid * mid;

            if (guess == num) return true;   // exact square
            if (guess > num) {
                right = mid - 1;             // chhota karo
            } else {
                left = mid + 1;              // bada karo
            }
        }
        return false;   // agar nahi mila
    }
}
