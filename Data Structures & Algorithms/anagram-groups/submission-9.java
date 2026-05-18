class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for(String s: strs) {
            String hashCode = hashCode(s);
            map.putIfAbsent(hashCode, new ArrayList<>());
            map.get(hashCode).add(s);
        }

        for(Map.Entry<String, List> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }

    private String hashCode(String s) {
        int[] result = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<result.length; i++) {
            String str = String.valueOf(result[i]);
            sb = sb.append(str).append('#');
        }
        return sb.toString();
    }




}
