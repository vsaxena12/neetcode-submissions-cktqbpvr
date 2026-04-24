class Solution {
    public int mySqrt(int x) {
        int element = 1;
        for(int i=1; i<=x; i++) {
            if((long)i*i > x) {
                return element;
            }
            element = i;
        }
        return element;
    }
}