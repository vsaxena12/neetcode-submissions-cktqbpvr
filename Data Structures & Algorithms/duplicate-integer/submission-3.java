class Solution {
    public boolean hasDuplicate(int[] nums) {
        //1. Hash set
        // Set<Integer> set = new HashSet<>(); 
        // for(int i=0; i<nums.length; i++) {
        //     if(set.contains(nums[i])) {
        //         return true;
        //     }
        //     set.add(nums[i]);
        // }
        // return false;

        //2. Two For loop
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}