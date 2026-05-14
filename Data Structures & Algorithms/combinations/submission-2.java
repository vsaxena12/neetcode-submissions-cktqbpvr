class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(n, k, 1, new ArrayList<>(), list);
        return list;
    }

    private void dfs(int n, int k, int i, List<Integer> curr, List<List<Integer>> list) {

        if(curr.size() == k) {
            list.add(new ArrayList<>(curr));
            return;
        }

        if(i > n) {
            return;
        }

        curr.add(i);
        dfs(n, k, i+1, curr, list);
        curr.remove(curr.size()-1);
        dfs(n, k, i+1, curr, list);

    }
}