class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        helper(1, new ArrayList<>(), list, n, k);
        return list;
    }

    private void helper(int i, List<Integer> curr, List<List<Integer>> comb, int n, int k) {
        if(curr.size() == k) {
            comb.add(new ArrayList<>(curr));
            return;
        }
        if(i>n) {
            return;
        }
        for(int j=i; j<=n; j++) {
            curr.add(j);
            helper(j+1, curr, comb, n, k);
            curr.remove(curr.size()-1);
        }
    }
}