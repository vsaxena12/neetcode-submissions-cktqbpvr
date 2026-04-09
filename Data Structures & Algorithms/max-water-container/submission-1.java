class Solution {
    public int maxArea(int[] height) {
        int counter = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int val = 0;
            if(height[i] < height[j]){
                val = height[i] * (j-i);
                i++;
            } else if(height[i] >= height[j]){
                val = height[j] * (j-i);
                j--;
            }
            counter = Math.max(counter, val);
        }

        return counter;
    }
}
