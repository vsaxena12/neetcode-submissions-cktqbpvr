class Solution {
    private final char ch = 260;
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            s = s + ch;
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ch) {
                list.add(sb.toString());
                sb.setLength(0);
            } else{
                sb.append(str.charAt(i));
            }
        }
        return list;
    }
}
