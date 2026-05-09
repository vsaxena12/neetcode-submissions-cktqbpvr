class KthLargest {
    private PriorityQueue<Integer> queue;
    private int k;

    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>();
        this.k = k;

        for(int i: nums) {
            queue.offer(i);
            if(queue.size() > k) {
                queue.poll();
            }
        }    
    }
    
    public int add(int val) {
        queue.offer(val); 
        if(queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }
}
