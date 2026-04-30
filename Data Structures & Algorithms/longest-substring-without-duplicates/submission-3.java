class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        int maxLength = 0;
        int currentLength = 0;
        for(int i=0; i<s.length(); i++) {
            
            while(map.containsKey(s.charAt(i))) {
                map.remove(s.charAt(j));
                j++;
            } 
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            currentLength = i-j+1;
        
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
