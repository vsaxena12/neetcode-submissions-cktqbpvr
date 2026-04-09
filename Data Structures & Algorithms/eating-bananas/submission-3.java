class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for(int i: piles) {
            if(max < i)
                max = i;
        }

        int minTime = max;
        int left = 1;
        int right = max;
        
        while(left<=right) {
            int k = left + (right-left)/2;

            long totalHours = 0;
            for(int p: piles) {
                totalHours += (int) Math.ceil((double)p/k);
            }

            if(totalHours <= h) {
                minTime = Math.min(minTime, k);
                right = k - 1;;
            } else {
                left = k + 1;
            }
        }
        return minTime;
    }
}
