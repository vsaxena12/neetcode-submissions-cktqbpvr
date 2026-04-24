class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        
        while(left<right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if(s.charAt(left + 1) == s.charAt(right)) {
                    String s1 = s.substring(left+1, right);
                    return validPalindrome(s1);
                } else if(s.charAt(left) == s.charAt(right-1)) {
                    String s2 = s.substring(left, right-1);
                    return validPalindrome(s2);
                }
                else
                    return false;
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