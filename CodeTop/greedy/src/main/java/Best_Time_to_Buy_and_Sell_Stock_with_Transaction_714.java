public class Best_Time_to_Buy_and_Sell_Stock_with_Transaction_714 {
    public int maxProfit(int[] prices, int fee) {
        if (prices == null || prices.length <= 1) return 0;

        int totalProfit = 0;
        int effectiveBuyPrice = prices[0] + fee;
        for(int i= 1; i<prices.length; i++){
            if (prices[i] + fee < effectiveBuyPrice) {
                effectiveBuyPrice = prices[i] + fee;
            } else if (prices[i] > effectiveBuyPrice) {
                // Case 2: We found a day where selling yields profit
                totalProfit += prices[i] - effectiveBuyPrice;

                effectiveBuyPrice = prices[i];
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock_with_Transaction_714 solver = new Best_Time_to_Buy_and_Sell_Stock_with_Transaction_714();

        int[] prices = {1,3,2,8,4,9};
        int result = solver.maxProfit(prices, 2);
        System.out.println("Maximum children: " + result);
    }
}
