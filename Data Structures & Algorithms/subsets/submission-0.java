class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        helper(0, nums, current, subset);
        return subset;
    }

    private void helper(int i, int[] nums, List<Integer> current, 
        List<List<Integer>> subset) {
            if(i>=nums.length) {
                subset.add(new ArrayList<>(current));
                return;
            }
            current.add(nums[i]);
            helper(i + 1, nums, current, subset);
            current.remove(current.size() - 1);
            // decision NOT to include nums[i]
            helper(i + 1, nums, current, subset);
    }
}
