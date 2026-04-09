class Solution {
    public int subarraySum(int[] nums, int k) {
        //[2, -1, 1, 2]
        // i      j
        int counter = 0;
        
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            j = i;
            int sum = 0;
            while(j<nums.length) {
                sum = sum + nums[j];
                if(sum == k) { 
                    counter++;
                } 
                j++;
            }
        }
        return counter;
    }
}