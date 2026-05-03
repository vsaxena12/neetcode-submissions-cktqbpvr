class Solution {
    public boolean hasDuplicate(int[] nums) {
        // [1,2,3,4] -> sorting or hashset
        // sorting -> nums[i] == nums[i-1] return true else false
        // hashset -> nums[i] if contains nums[i] return true else false
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}