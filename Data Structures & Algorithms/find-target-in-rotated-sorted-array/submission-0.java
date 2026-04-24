class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for(int k=0; k<nums.length; k++) {
            map.put(nums[k], k);
        }

        int j = 0;
        int i2=0, j2=0;
        for(int i=1; i<n; i++) {
            if(nums[i] > nums[i-1]) {
                j++;
            } else {
                i2 = i;
                j2 = n-1;
                break;
            }
        }

        sort(nums, 0, j);
        sort(nums, i2, j2);
        sort(nums, 0, j2);

        int index = findIndex(nums, target);

        return map.getOrDefault(index, -1);
    }

    private void sort(int[] nums, int left, int right) {
        while(left<=right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }

    private int findIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = left + (right-left)/2;

            if(nums[mid] == target) {
                return nums[mid];
            } else if(nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
