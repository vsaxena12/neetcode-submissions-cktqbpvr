class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            set.add(n);
        }

        int result = 0;
        

        for(int i=0; i<nums.length; i++) {
            int element = nums[i];
            int counter = 0;
            while(set.contains(element)) {
                element++;
                counter++;
            }
            result = Math.max(counter, result);
        }
        return result;
    }
}
