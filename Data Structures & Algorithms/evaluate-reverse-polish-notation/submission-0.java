class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int i=0; i<tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") 
            || tokens[i].equals("*") 
            || tokens[i].equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                result = calculation(tokens[i], a, b);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }

    private int calculation(String token, int a, int b) {
        int res = 0;
        if(token.equals("+")) {
            res = b + a;
        } else if(token.equals("-")) {
            res = b - a;
        } else if(token.equals("*")) {
            res = a * b;
        } else if(token.equals("/")) {
            if(a != 0 && b != 0) {
                res = b/a;
            }
        }
        return res;
    }
}
