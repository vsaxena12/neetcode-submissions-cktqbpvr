class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] result = new int[size*2];

        for(int i=0; i<nums.length; i++) {
            result[i] = nums[i];
            result[i+size] = nums[i];
        }
        return result;
    }
}