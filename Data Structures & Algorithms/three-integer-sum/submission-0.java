class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            int target = -(nums[i]);
            List<Integer> listVal = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for(int j=0; j<nums.length; j++) {
                if(i != j) {
                    int compliment = target - nums[j];
                    if(set.contains(compliment)) {
                        listVal.add(nums[i]);
                        listVal.add(nums[j]);
                        listVal.add(compliment);
                        break;
                    } else {
                        set.add(nums[j]);
                    }
                }
            }
            Collections.sort(listVal);
            if(!list.contains(listVal) && !listVal.isEmpty()){
                list.add(listVal);
            }
            
        }

        return list;
    }
}
