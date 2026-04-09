class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Brute force -> Two for loop and O(n^2)
        // Sorting
        // Hash set
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums) {
            if(set.contains(n)) {
               return true; 
            }
            set.add(n);
        }
        return false;
    }
}