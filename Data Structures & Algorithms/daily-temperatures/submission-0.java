class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[] = new int[temperatures.length];
        int k = 0;
        for(int i=0; i<temperatures.length; i++) {
            for(int j=i+1; j<temperatures.length; j++) {
                if(temperatures[i] < temperatures[j]) {
                    result[k] = j-i;
                    k++;
                    break;
                }
            }
        }
        return result;
    }
}
