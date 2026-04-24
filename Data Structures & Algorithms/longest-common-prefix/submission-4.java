class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int n = s.length(); 

        for(int i=1; i<strs.length; i++) {
            int j = 0;
            while(j<n) {
                if(strs[i].charAt(j) != s.charAt(j)) {
                    n = j;
                    break;
                }
                j++;
            }
            s = s.substring(0,n);
        }
        return s;
    }
}