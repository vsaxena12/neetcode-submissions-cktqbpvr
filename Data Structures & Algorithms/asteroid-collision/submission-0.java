class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int a: asteroids) {
            
            while(!stack.isEmpty() && a<0 && stack.peek() > 0) {
                int diff = a + stack.peek();
                if(diff < 0) {
                    stack.pop();
                    stack.push(a);
                } else if(diff > 0) {
                    a = 0;
                } else {
                    stack.pop();
                    a = 0;
                }
            }

            if(a != 0) {
                stack.push(a);
            }
        }

        int[] intArray = stack.stream() // Creates a Stream<Integer>
                                .mapToInt(i -> i) // Maps Integer objects to primitive int values (auto-unboxing)
                                .toArray();

        return intArray;
    }
}