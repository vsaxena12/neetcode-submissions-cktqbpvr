class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        for(int i=0; i<k; i++) {
            int temp = nums[k+i];
            nums[k+i] = nums[i];
            nums[i] = temp;
        }

    }
}