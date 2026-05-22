class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int j = i+1; 
            int maxValue = 0;
            while(j<arr.length) {
                maxValue = Math.max(arr[j], maxValue);
                j++;
            }
            arr[i] = maxValue;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}