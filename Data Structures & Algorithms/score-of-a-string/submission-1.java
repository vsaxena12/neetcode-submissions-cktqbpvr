class Solution {
    public int scoreOfString(String s) {
        if(s.length() < 1 || s.length() >100) {
            return -1;
        }
        int counter = 0;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i-1) > 0x7F || s.charAt(i) > 0x7F) {
                return -1;
            }
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(i);

            counter = counter + Math.abs(c1 - c2);
        }
        return counter;
    }
}