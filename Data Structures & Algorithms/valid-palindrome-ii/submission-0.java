class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        boolean visited = false;
        while(left<=right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else if((s.charAt(left+1) == s.charAt(right) 
            || s.charAt(left) == s.charAt(right-1)) && !visited) {
                left++;
                right--;
                visited = true;

            } else {
                return false;
            }
        }

        return true;
    }
}