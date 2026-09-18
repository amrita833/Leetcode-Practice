/*class Solution {
    public int coinChange(int[] coins, int amount) {
        return helper(coins, amount);
    }

    private int helper(int[] coins, int amount) {
        
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        int min = Integer.MAX_VALUE;

        
        for (int coin : coins) {
            int res = helper(coins, amount - coin);
            if (res >= 0 && res < min) {
                min = 1 + res; 
            }
        }

        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}*/
class Solution {
    public int coinChange(int[] coins, int amount) {
        // DP array to store minimum coins for each amount
        int[] dp = new int[amount + 1];
        
        // Initialize with a large value (infinity substitute)
        Arrays.fill(dp, amount + 1);
        
        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;
        
        // Build up the solution
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        
        // If dp[amount] is still large, return -1 (not possible)
        return dp[amount] > amount ? -1 : dp[amount];
    }
}

