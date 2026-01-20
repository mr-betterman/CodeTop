package org;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {
    public int maxProfit(int[] prices) {
        int n  = prices.length;
        int[] hold = new int[n+1];
        int[] sold = new int[n+1];
        hold[0] = -prices[0];
        sold[0] = 0;
        for(int i = 1; i< n; i++){
            hold[i] = Math.max(hold[i-1], sold[i-1] - prices[i]);
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
        Best_Time_to_Buy_and_Sell_Stock_II_122 solver = new Best_Time_to_Buy_and_Sell_Stock_II_122();

        int[] prices = {1,2,3,0,2};

        int result = solver.maxProfit(prices);

        System.out.println("Maximum profit: " + result);
    }
}
