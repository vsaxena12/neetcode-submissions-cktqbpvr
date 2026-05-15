class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        return helper(0, nums);
    }

    public static List<List<Integer>> helper(int i, int[] nums) {
        if (i == nums.length) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>());
            return res;
        }
        Set<List<Integer>> resPerms = new HashSet<>();
        List<List<Integer>> perms = helper(i + 1, nums);
        for (List<Integer> p : perms) {
            for (int j = 0; j < p.size() + 1; j++) {
                List<Integer> pCopy = new ArrayList<>();
                pCopy.addAll(p);
                pCopy.add(j, nums[i]);
                resPerms.add(pCopy);
            }
        }
        return new ArrayList<>(resPerms); 
    }
}