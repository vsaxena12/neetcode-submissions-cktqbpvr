class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                int l = nums.length-1;
                int k=j+1;
                while(k<l) {
                    if(nums[i]+nums[j]+nums[k]+nums[l] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        set.add(list);
                        k++;
                        l--;
                    } else if(nums[i]+nums[j]+nums[k] > 0) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}