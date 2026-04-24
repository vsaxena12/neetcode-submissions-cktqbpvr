class LRUCache {
    private final Map<Integer, Integer> map;
    private int size;
    private int capacity; 
    public LRUCache(int capacity) {
        this.map = new LinkedHashMap<>(capacity);
        this.size = 0;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        return this.map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if(this.size == this.capacity) {
            Iterator<Map.Entry<Integer, Integer>> iterator = this.map.entrySet().iterator();
            if (iterator.hasNext()) {
                Map.Entry<Integer, Integer> firstEntry = iterator.next();
                iterator.remove();
                this.size--;
            }
        }
        this.map.put(key, value);
        this.size++;
    }
}
