class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // nums = [-4, -1, -1, 0, 1, 2]
        // nums = []
        // nums[i] + nums[j] = -(nums[k])
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            int k = nums.length-1;
            for(int j=i+1; j<nums.length; j++) {
                if(i!=j && j!=k && k!=i) {
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        set.add(list);
                        break;
                    } else if(nums[i]+nums[j]+nums[k] > 0) {
                        k--;
                        j--;
                    } 
                }          
            }
        }
        return new ArrayList<>(set);

    }
}
