class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            // Agar right side bada hai → peak right me hai
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } 
            // Warna peak left me ya mid par hi hai
            else {
                hi = mid;
            }
        }

        // lo == hi → wahi peak index hai
        return lo;
    }
}