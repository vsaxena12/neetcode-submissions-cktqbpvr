class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);   
        
        int i = 0, j = 0;
        if(ch1.length != ch2.length) {
            return false;
        }

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        while(i<ch1.length && j < ch2.length) {
            if(ch1[i] != ch2[j]) {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
}
