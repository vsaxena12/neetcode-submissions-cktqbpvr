class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);

        int[] result = new int[k];

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            pq.offer(new int[]{value, key});
        }

        for(int i=0; i<k; i++) {
            result[i] = pq.poll()[1];
        }

        return result;
    }
}
