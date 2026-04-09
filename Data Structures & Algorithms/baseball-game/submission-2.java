class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                if (!stack.isEmpty())
                    stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.valueOf(operations[i]));
            }
        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}