package org;

import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_III_123 {
    public int maxProfit(int[] prices) {
        int n  = prices.length;
        int[] hold = new int[n+1];
        int[] sold = new int[n+1];
        return sold[n];
    }
//    public int maxProfit(int k, int[] prices) {
//        if (prices.length == 0) return 0;
//        int hold1 = -prices[0];
//        int sold1 = 0;
//        int hold2 = -prices[0];
//        int sold2 = 0;
//        for (int i = 1; i < prices.length; i++) {
//
//            hold1 = Math.max(hold1, -prices[i]);
//            sold1 = Math.max(sold1, hold1 + prices[i]); // 这里的 hold1 已经是今天的了
//
//            hold2 = Math.max(hold2, sold1 - prices[i]); // 这里的 sold1 也是今天的了
//            sold2 = Math.max(sold2, hold2 + prices[i]);
//        }
//        return sold2;
//    }

    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_III_123 solver = new Best_Time_to_Buy_and_Sell_Stock_III_123();

        int[] prices = {3,3,5,0,0,3,1,4};

        int result = solver.maxProfit(prices);

        System.out.println("Maximum profit: " + result);
    }
}
