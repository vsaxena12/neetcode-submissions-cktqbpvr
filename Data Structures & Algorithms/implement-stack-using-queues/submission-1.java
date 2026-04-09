class MyStack {

    private List<Integer> queue;
    private int counter;

    public MyStack() {
        this.queue = new ArrayList<>();
        this.counter = -1;
    }
    
    public void push(int x) {
        queue.add(x);
        counter++;
    }
    
    public int pop() {
        if (counter < 0) throw new NoSuchElementException("Stack is empty");
        int val = queue.remove(counter);
        counter--;
        return val;
    }
    
    public int top() {
        if (counter < 0) throw new NoSuchElementException("Stack is empty");
        return queue.get(counter);
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */