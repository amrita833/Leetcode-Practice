class Solution {
    public int numberOfChild(int n, int k){

        int cycle = 2 * (n - 1);
        int kPrime = k % cycle;
        if (kPrime <= n - 1) {
            return kPrime;
        } else {
            return cycle - kPrime;
        }
    }
}


    
