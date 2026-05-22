class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int result = -1;

        for(int i=n-1; i>=0; i--) {
            ans[i] = result;
            result = Math.max(arr[i], result);
        }
        return ans;
    }
}