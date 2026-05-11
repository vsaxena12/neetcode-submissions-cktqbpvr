class Solution {
    public void sortColors(int[] nums) {
        int[] result = new int[3];

        for(int i=0; i<nums.length; i++) {
            result[nums[i]]++;
        }

        int index = 0;
        for(int i=0; i<result.length; i++) {
            while(result[i] > 0) {
                nums[index++] = i;
                result[i]--;
            }
        }
    }
}