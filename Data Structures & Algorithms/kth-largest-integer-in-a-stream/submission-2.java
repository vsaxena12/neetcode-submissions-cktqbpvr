class KthLargest {

    private PriorityQueue<Integer> queue;
    private int K;
    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        for(int n: nums) {
            queue.add(n);
            if(queue.size() > k) {
                queue.poll();
            }
        }

        this.K = k;
    }
    
    public int add(int val) {
        //queue.poll();
        queue.offer(val);
        if(queue.size() > K) {
            queue.poll();
        }
        return queue.peek();
    }
}
