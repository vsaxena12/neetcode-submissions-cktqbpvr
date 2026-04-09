class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(); 
        char ch = 260;

        for(String s: strs) {
            s = s + ch;
            sb = sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        char ch = 260; 
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(c == ch) {
                list.add(sb.toString());
                sb.setLength(0);
            } else {
                sb = sb.append(c);
            }
        }

        return list;
    }
}
