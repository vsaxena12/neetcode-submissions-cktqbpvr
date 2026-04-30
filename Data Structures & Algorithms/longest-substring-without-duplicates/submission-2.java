class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int maxLength = 0;
        int currentLength = 0;
        for(int i=0; i<s.length(); i++) {
            
            if(map.containsKey(s.charAt(i))) {
                j=i;
                currentLength = 1;
            } else {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
                currentLength++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
