class Solution {
    public int[] replaceElements(int[] arr) {
        int j = 0;

        for(int i=0; i<arr.length; i++) {
            j = i + 1;
            while(j < arr.length) {
                int currentMax = arr[j];
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[k] > currentMax) currentMax = arr[k];
                }
                arr[i] = currentMax;
                break;
            }  
        }
        arr[arr.length-1] = -1;

        return arr;
    }
}