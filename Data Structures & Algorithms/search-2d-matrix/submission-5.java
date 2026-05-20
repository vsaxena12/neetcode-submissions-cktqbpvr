class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int left = 0;
        int right = ROWS * COLS-1;

        while(left<=right) {
            int mid = left + (right-left)/2;

            int rows = mid/2;
            int cols = mid%2;

            if( target < matrix[rows][cols]) {
                right = mid-1;
            } else if(target > matrix[rows][cols]) {
                left = mid+1;
            } else {
                return true;
            }
        }
        return false;
    }
}
