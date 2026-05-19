class Solution {
    public void sortColors(int[] nums) {
        int[] result = new int[3];

        for(int n: nums) {
            result[n]++;
        }

        int j = 0;
        for(int i=0; i<result.length; i++) {
            
            while(result[i] != 0) {
                nums[j++] = i;
                result[i]--;
            }
        }
    }
}