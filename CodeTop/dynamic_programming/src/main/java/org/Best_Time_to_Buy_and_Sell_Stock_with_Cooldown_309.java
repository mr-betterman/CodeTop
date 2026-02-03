package org;

public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309 {
    public int maxProfit(int[] prices) {
        int n  = prices.length;
        int[] hold = new int[n+1];
        int[] sold = new int[n+1];
        hold[0] = -prices[0];
        sold[0] = 0;
        hold[1] = Math.max(-prices[0], - prices[1]);
        sold[1] = Math.max(0, -prices[0]+ prices[1]);
        for(int i = 2; i< n; i++){
            //Option A: Keep holding from yesterday (dp[i-1][0]).
            //Option B: Buy today. To buy today, we must use the profit from 2 days ago (dp[i-2][1]) to satisfy the cooldown.
            hold[i] = Math.max(hold[i-1], sold[i-2] - prices[i]);
            sold[i] = Math.max(sold[i - 1], hold[i - 1] + prices[i]);
        }
        for(int holdPrice:hold){
            System.out.println("hold prices: " + holdPrice);
        }
        for(int soldPrice:sold){
            System.out.println("sold prices: " + soldPrice);
        }
        return sold[n-1];
    }

    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309 solver = new Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309();

        int[] prices = {1};

        int result = solver.maxProfit(prices);

        System.out.println("Maximum profit: " + result);
    }
}
