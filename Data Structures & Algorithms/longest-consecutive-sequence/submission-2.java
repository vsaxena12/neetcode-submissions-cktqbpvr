class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int n: nums) {
            set.add(n);
        }

        for(int num: nums) {
            
            int counter = 1;
            while(set.contains(num+counter)) {
                counter++;
            }
            max = Integer.max(counter, max);
        }
        return max;
    }
}
