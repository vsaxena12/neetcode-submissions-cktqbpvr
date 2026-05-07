class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(nums, 0, list, current);
        return list;
    }

    private void helper(int[] nums, int i, List<List<Integer>> list, List<Integer> curr) {
        if(i>=nums.length) {
            list.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        helper(nums, i+1, list, curr);
        curr.remove(curr.size()-1);
        helper(nums, i+1, list, curr);

    }
}
