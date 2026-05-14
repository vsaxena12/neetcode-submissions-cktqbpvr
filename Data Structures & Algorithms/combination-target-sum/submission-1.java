class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(0, nums, target, 0, curr, list);
        return list;
    }

    private void helper(int i, int[] nums, int target, int sum,
        List<Integer> curr, List<List<Integer>> list) {
            if(target == sum) {
                list.add(new ArrayList<>(curr));
                return;
            }

            if(sum > target || i>=nums.length) {
                return;
            }


            curr.add(nums[i]);
            helper(i, nums, target, sum + nums[i], curr, list);
            curr.remove(curr.size()-1);
            helper(i+1, nums, target, sum, curr, list);

        }


}