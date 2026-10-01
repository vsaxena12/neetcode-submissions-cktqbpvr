class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while(left<=right) {
            swap(s, left, right);
            left++;
            right--;
        }
    }

    private void swap(char[] ch, int left, int right) {
        char c  = ch[left];
        ch[left] = ch[right];
        ch[right] = c;
    }
}