class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int counter = 0;

        for(int n: nums) {
            if(counter == 0) {
                majorityElement = n;
                counter++;
            } else if(majorityElement == n) {
                counter++;
            } else {
                counter--;
            }
        }
        return majorityElement;
    }
}