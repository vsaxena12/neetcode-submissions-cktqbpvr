class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int rightMax = -1;
        for (int i = n - 1; i >= 0; i--) {
            if(arr[i] > rightMax) {
                int temp = rightMax;
                rightMax = arr[i];
                arr[i] = temp;
            } else {
                arr[i] = rightMax;
            }
        }
        return arr;
    }
}