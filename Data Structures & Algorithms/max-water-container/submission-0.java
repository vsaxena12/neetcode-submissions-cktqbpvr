class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=1;
        int max = 0;
        while(j<heights.length) {
            if(heights[i]<heights[j]) {
                i++;
                j++;
            } else if(heights[i] >= heights[j]) {
                int k = j-i;
                max = Math.max(heights[j] * k, max);
                j++;
            }
        }

        return max;
    }
}
