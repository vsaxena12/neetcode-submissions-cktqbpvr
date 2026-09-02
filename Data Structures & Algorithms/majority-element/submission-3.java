class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int element: nums) {
            if(count == 0) {
                maxValue = element;
                count++;
            } else if(element == maxValue) {
                count++;
            } else {
                count--;
            }
        }
        return maxValue;
    }
}