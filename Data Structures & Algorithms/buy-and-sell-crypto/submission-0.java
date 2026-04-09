class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++) {
            if(buy > prices[i]) {
                buy = prices[i];
            } else {
                sell = prices[i];
                maxProfit = Math.max(sell - buy, maxProfit);
            }
        }

        return maxProfit;
    }
}
