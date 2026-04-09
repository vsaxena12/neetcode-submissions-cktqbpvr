class Solution {
    public int majorityElement(int[] nums) {
        int element = Integer.MIN_VALUE;
        int counter = 0;

        for(int i=0; i<nums.length; i++) {
            if(counter == 0 || element == nums[i]) {
                element = nums[i];
                counter++;
            } else {
                counter--;
            }
        }
        return element;
    }
}