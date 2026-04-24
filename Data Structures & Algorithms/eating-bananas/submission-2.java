class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for(int i: piles) {
            if(max < i)
                max = i;
        }

        long minTime = max;
        int k = 1;
        for(k = 1; k<=max; k++) {
            long totalHours = 0;
            for(int p: piles) {
                totalHours += (int) Math.ceil((double)p/k);
            }

            if(totalHours <= h) {
                minTime = Math.min(minTime, k);
            }
        }
        return (int) minTime;
    }
}
