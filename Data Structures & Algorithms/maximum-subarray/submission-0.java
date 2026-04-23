class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        int j=0;

        for(int i=0; i<nums.length; i++) {
            if(sum < 0) {
                j = i;
                sum = nums[j];
            } else {
                sum = sum + nums[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
