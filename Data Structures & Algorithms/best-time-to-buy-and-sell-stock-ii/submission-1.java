class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;

        int left = 0;
        int right = 1;
        int result = 0;
        while(right<prices.length) {
            if(prices[right] > prices[right-1]) {
                result = result + prices[right] - prices[right-1];
                // left = right-1;
            }
            right++;
        }
        return result;
    }
}