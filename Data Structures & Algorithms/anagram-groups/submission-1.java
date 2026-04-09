class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            int[] num = new int[26]; 
            for(char c: s.toCharArray()) {
                num[c-'a']++;
            }
            String val = Arrays.toString(num);
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
