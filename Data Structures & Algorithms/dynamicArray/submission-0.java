class DynamicArray {

    private int[] nums;
    private int capacity;
    private int size = 0;

    public DynamicArray(int capacity) {
        this.nums = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return nums[i];
    }

    public void set(int i, int n) {
        nums[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity) {
            resize();
        }
        nums[size++] = n;
    }

    public int popback() {
        if (size > 0) {
            // soft delete the last element
            size--;
        }
        return nums[size];
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = nums[i];
        }
        nums = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
