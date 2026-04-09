class MyQueue {

    Deque<Integer> stack1; 
    Deque<Integer> stack2;
    int top = -1;

    public MyQueue() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while(stack1.size() > 1) {
            stack2.push(stack1.pop());
        }
        int res = stack1.pop();

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }
    
    public int peek() {
        while(stack1.size() > 1) {
            stack2.push(stack1.pop());
        }
        int res = stack1.peek();

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */