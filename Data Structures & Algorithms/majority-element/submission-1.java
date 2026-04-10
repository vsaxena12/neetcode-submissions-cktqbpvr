class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0;
        int maxElement = 0;

        for(int n: nums) {
            if(counter == 0) {
                maxElement = n;
                counter++;
            } else if(maxElement == n) {
                counter++;
            } else {
                counter--;
            }
        }
        return maxElement;
    }
}