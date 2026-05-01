class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        helper(1, n, k, current, list);

        return list;
    }

    private void helper(int i, int num, int k, List<Integer> current, List<List<Integer>> list) {
        if(current.size() == k) {
            list.add(new ArrayList<>(current));
            return;
        }
        if(i>num)
            return;

        current.add(i);
        helper(i+1, num, k, current, list);

        current.remove(current.size()-1);
        helper(i+1, num, k, current, list);

    }
}