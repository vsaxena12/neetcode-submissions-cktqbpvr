class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for(int i=0; i<strs.length; i++) {
            String s = hashCode(strs[i]);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(strs[i]);
        }

        for(Map.Entry<String, List> entry: map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;

    }

    private String hashCode(String s) {
        int[] result = new int[26];
        for(char c: s.toCharArray()) {
            result[c-'a']++;
        }
        return Arrays.toString(result);
    }
}
