class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(0, nums, target, curr, list);
        return list;
    }

    private void helper(int i, int[] nums, int target, 
        List<Integer> curr, List<List<Integer>> list) {
            if(target == 0) {
                list.add(new ArrayList<>(curr));
                return;
            }

            if(target < 0 || i>=nums.length) {
                return;
            }

            curr.add(nums[i]);
            helper(i, nums, target-nums[i], curr, list);
            curr.remove(curr.size()-1);
            helper(i+1, nums, target, curr, list);
            
    }
}
