class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for(String s: strs) {
            int val = 0; 
            for(char c: s.toCharArray()) {
                val = val + Integer.valueOf(c);
            }
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
