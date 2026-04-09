class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        
        for(int i=0; i<nums.length-1; i++) {
            result[i+1] = nums[i] * result[i];
        }

        int postfix = 1;
        for(int j = nums.length-1; j>=0; j--) {
            result[j] = postfix * result[j];
            postfix = postfix * nums[j];
        }

        return result;

    }
}  
