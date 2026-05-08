class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0; i<matrix.length; i++) {
            if(matrix[i][0] <= target && matrix[i][matrix[i].length-1] >= target) {
                int[] nums = new int[matrix[i].length];
                for(int k=0; k<matrix[i].length; k++) {
                    nums[k] = matrix[i][k];
                }
                return searchElement(nums, target);
            }
        }
        return false;
    }

    private boolean searchElement(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right) {
            int mid = left + (right-left)/2;

            if(nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
