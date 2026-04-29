class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int countZero = 0;
        int product = 1;
        for(int num: nums) {
            if(num == 0) {
                countZero++;
            } else {
                product = product * num; 
            }
        }

        if(countZero > 1) {
            return new int[nums.length];
        }

        for(int i=0; i<nums.length; i++) {
            if(countZero > 0) {
                result[i] = (nums[i] == 0)? product:0;
            } else {
                result[i] = product/nums[i];
            }
        }
        return result;
    }
}  
