class Solution {
    private List<List<String>> list;

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String hash = hashcode(strs[i]);
            map.putIfAbsent(hash, new ArrayList<>());
            map.get(hash).add(strs[i]);
        }    
        //list = new ArrayList<>();
        return new ArrayList<>(map.values());
    }

    private String hashcode(String s) {
        int[] result = new int[26];

        for(char c: s.toCharArray()) {
            result[c-'a']++;
        }
        return Arrays.toString(result);
     }
}
