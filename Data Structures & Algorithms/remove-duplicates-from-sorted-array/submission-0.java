class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        
        int counter = 1;
        int i = 1;

        while(i<nums.length) {
            if(nums[i-1] != nums[i]) {
                nums[counter++] = nums[i];
            }
            i++;
        }
        return counter;
    }
}