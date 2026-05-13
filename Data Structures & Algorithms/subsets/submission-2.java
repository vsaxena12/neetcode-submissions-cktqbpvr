class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for(int num: nums) {
            int size = list.size();
            for(int i=0; i<size; i++) {
                List<Integer> element = list.get(i);
                List<Integer> curr = new ArrayList<>(element);
                curr.add(num);
                list.add(curr);
            }
        }
        return list;
    }
}
