class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] result = new int[nums.length];

        result[0] = product;

        for(int i=1; i<result.length; i++) {
            result[i] = nums[i-1] * result[i-1];
        }

        for(int j=result.length-1; j>=0; j--) {
            result[j] = result[j] * product;
            product = product * nums[j];
        }
        return result;
    }
}  
