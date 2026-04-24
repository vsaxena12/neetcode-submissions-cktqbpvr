class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        int add = 0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("+")) {
                stack.push(sum);
            } else if(operations[i].equals("C")) {
                stack.pop();
            } else if(operations[i].equals("D")) {
                if(!stack.isEmpty())
                    stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.valueOf(operations[i]));
                sum += !stack.isEmpty() ? stack.peek() : 0;
            }
        }

        while(!stack.isEmpty()) {
            add += stack.pop();
        }
        return add;
    }
}