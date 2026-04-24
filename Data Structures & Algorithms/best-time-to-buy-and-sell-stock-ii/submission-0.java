class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;

        int left = 0;
        int right = left + 1;
        int result = 0;
        while(right<prices.length) {
            if(prices[right] < prices[left]) {
                left = right;
            } else if(prices[right]>prices[left]) {
                result = result + prices[right] - prices[left];
                left++;
            }
            right++;
        }
        return result;
    }
}