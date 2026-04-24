class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if(nums[l] == nums[m]) {
                l = m+1;
            }else if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int pivot = l;
         l = 0;
        r = nums.length-1;

        if(target >= nums[pivot] && target <= nums[r]) {
            l = pivot;
        } else {
            r = pivot-1;
        }

        return binarySearch(nums, target, l, r);
    }

    private boolean binarySearch(int[] nums, int target, int left, int right) {

        while(left <= right) {
            int mid = left + (right-left)/2;

            if(nums[mid] == target) {
                return true;
            } else if(nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}