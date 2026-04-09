class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        boolean visited = false;
        while(left<right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isValidPalindrome(s, left+1, right) || isValidPalindrome(s, left, right-1);
            }
        }

        return true;
    }
    
    private boolean isValidPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) 
                return false;
            l++;
            r--;
        }
        return true;
    }
}