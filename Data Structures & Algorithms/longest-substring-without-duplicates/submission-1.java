class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int totalLength = 0;
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                left = Math.max(map.get(s.charAt(i)) + 1, left);
            }
            map.put(s.charAt(i), i);
            totalLength = Math.max(totalLength, i-left+1);
        }

        return totalLength;
    }
}
