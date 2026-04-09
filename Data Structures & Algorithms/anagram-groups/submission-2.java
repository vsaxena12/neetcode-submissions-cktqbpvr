class Solution {
    private String checkAnagram(String s) {
        int[] num = new int[26]; 
        for(char c: s.toCharArray()) {
            num[c-'a']++;
        }
        return Arrays.toString(num);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs) {
            String val = checkAnagram(s);
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
