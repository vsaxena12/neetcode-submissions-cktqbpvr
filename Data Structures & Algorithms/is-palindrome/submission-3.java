class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left = 0;
        int right = s.length()-1;

        while(left<right) {
            while(left<right && (!isValid(s.charAt(left)))) {
                left++;
            }
            while(left<right && (!isValid(s.charAt(right)))) {
                right--;
            }
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isValid(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
}
