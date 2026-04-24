class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = left;
        while(left <=right) {
            mid = left + (right-left)/2;
            if((long)mid * mid > x) {
                right = mid-1;
            } else if((long)mid * mid < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return mid;
    }
}