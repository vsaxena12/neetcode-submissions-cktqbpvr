class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        
        for(int i=0; i<nums.length-1; i++) {
            result[i+1] = nums[i] * result[i];
        }

        int[] res = new int[nums.length];
        res[nums.length-1] = 1;

        for(int j = nums.length-1; j>0; j--) {
            res[j-1] = nums[j] * res[j];
        }

        for(int k=0; k<nums.length; k++) {
            result[k] = result[k] * res[k];
        }

        return result;

    }
}  
