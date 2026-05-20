class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        swap(nums, 0, k-1);
        swap(nums, k, nums.length);
        swap(nums, 0, nums.length);
        

    }

    private void swap(int[] nums, int start, int end) {
        end = end-1;
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}