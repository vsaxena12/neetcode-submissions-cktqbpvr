class Solution {
    public boolean validPalindrome(String s) {
        return dfs(s, 0, s.length()-1, false);
    }

    private boolean dfs(String s, int left, int right, boolean deleted) {
        while (left < right && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }
        if (left >= right) return true;          // already palindrome

        if (deleted) return false;        // already used the one deletion

        // try deleting left OR deleting right (only once)
        return dfs(s, left + 1, right, true) || dfs(s, left, right - 1, true);
    }

}