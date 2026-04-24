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
            } else if(s.charAt(left+1) == s.charAt(right) && !visited) {
                left = left + 2;
                right--;
                visited = true;

            } else if(s.charAt(left) == s.charAt(right-1) && !visited) {
                left++;
                right = right - 2;
                visited = true;
            } else {
                return false;
            }
        }

        return true;
    }
}