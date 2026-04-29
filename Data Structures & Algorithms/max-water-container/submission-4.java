class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i = 0;
        int j=i+1;

        while(j<heights.length) {
            int curr = 0;
            if(heights[i] < heights[j]) {
                curr = heights[i] * (j-i);
                i=j;
            } else {
                curr = heights[j] * (j-i);
            }
            max = Math.max(max, curr);
            j++;
        }
        return max;
    }
}
