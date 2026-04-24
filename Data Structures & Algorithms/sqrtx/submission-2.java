class Solution {
    public int mySqrt(int x) {
        int element = 0;
        for(long i=1; i<=x; i++) {
            if(i*i <= x) {
                element = (int)i;
            }
        }
        return element;
    }
}