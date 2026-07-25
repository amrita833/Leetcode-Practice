class Solution {
    public int maxProduct(int n) {
        // Step 1: number ko string me convert karke array fill karo
        String s = Integer.toString(n);
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }

        // Step 2: max aur second max nikalna
        int maxx = Integer.MIN_VALUE;
        int secmaxx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxx) {
                secmaxx = maxx;   // purana max second max ban jaata hai
                maxx = arr[i];    // naya max update
            } else if (arr[i] > secmaxx) {
                secmaxx = arr[i]; // sirf second max update hoga
            }
        }

        // Step 3: agar secmaxx update nahi hua (jaise duplicate digits), toh maxx use karo
        if (secmaxx == Integer.MIN_VALUE) {
            secmaxx = maxx;
        }

        // Step 4: product return karo
        return maxx * secmaxx;
    }
}
