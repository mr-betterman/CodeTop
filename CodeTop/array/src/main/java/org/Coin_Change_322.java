package org;

import java.util.Arrays;

public class Coin_Change_322 {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        // 3. Base case: It takes 0 coins to make amount 0
        dp[0] = 0;

        // 4. Iterate through coins and amount
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if(dp[j - coins[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount];
    }

    // Standard Java Main Method
    public static void main(String[] args) {
        Coin_Change_322 solver = new Coin_Change_322();

        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = solver.coinChange(coins, amount);

        System.out.println("Fewest coins needed: " + result);
    }
}