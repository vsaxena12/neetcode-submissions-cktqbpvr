class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        int add = 0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("+")) {
                int a = stack.pop();          // last
                int b = stack.peek();         // second last
                stack.push(a);                // put last back
                stack.push(a + b);  
            } else if(operations[i].equals("C")) {
                stack.pop();
            } else if(operations[i].equals("D")) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.valueOf(operations[i]));
                sum += stack.peek();
            }
        }

        while(!stack.isEmpty()) {
            add += stack.pop();
        }
        return add;
    }
}