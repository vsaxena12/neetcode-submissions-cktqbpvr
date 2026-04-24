class Solution {
    public int mySqrt(int x) {
        int element = 0;
        for(int i=1; i<=x; i++) {
            if(i*i <= x) {
                element = i;
            }
        }
        return element;
    }
}