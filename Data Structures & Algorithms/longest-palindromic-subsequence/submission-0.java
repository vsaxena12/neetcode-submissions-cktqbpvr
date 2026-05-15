class Solution {
    public int longestPalindromeSubseq(String s) {
        return helper(s, 0, s.length() - 1);
    }

    private int helper(String s, int i, int j) {

        if (i > j) return 0;
        if (i == j) return 1;
        if (s.charAt(i) == s.charAt(j)) {
            return 2 + helper(s, i + 1, j - 1);
        }

        return Math.max(
            helper(s, i + 1, j),
            helper(s, i, j - 1)
        );

    }
}