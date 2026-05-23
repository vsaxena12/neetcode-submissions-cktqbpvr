class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxConsecutive = Math.max(count, maxConsecutive);
        }
        return maxConsecutive;
    }
}