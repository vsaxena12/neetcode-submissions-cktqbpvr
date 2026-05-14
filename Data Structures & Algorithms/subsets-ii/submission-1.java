class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), list);
        return list;
    }

    private void helper(int[] nums, int i, List<Integer> curr, 
        List<List<Integer>> list) {
        
        if(i>=nums.length) {
            list.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        helper(nums, i+1, curr, list);
        curr.remove(curr.size()-1);
        while(i+1 < nums.length && nums[i] == nums[i+1]) {
            i++;
        }
        helper(nums, i+1, curr, list);
        
    }
}
