class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        int j = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i] - prices[j] < 0) {
                j = i;
            }
            max = Math.max(max, prices[i] - prices[j]);
        }
        return max;
    }
}
