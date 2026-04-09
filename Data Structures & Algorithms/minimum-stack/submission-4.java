class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;
    private int top;
    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
        this.top = -1;
    }
    
    public void push(int val) {
        this.stack.push(val);
        if(this.minStack.isEmpty() || this.minStack.peek() >= val) {
            this.minStack.push(val);
        }

    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        int top = this.stack.pop();
        if(top == this.minStack.peek()) {
            this.minStack.pop();
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}
