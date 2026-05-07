class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        int counter = 0;

        while(i<j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if(s.charAt(i) != s.charAt(j) && counter == 0) {
                    counter++;
                    if(s.charAt(i) == s.charAt(j-1)) {
                        j--;
                    } else {
                        i++;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}