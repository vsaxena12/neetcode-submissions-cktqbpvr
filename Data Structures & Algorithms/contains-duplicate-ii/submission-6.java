class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            while(j<nums.length) {
                if(i != j && nums[i] == nums[j] && Math.abs(i-j) <= k) {
                    return true;
                }
                j++;
            }
            j=i;
        }
        return false;
    }
}