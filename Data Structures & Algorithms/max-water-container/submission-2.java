class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i = 0;
        int j = heights.length-1;

        while(i<j) {
            int val = 0;
            if(heights[i] < heights[j]) {
                val = heights[i] * (j-i);
                i++;
            } else {
                val = heights[j] * (j-i);
                j--;
            }
            max = Math.max(max, val);
        }
        return max;
    }
}
