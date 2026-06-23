class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            while (!stack.isEmpty()
                    && asteroid < 0
                    && stack.peek() > 0
                    && stack.peek() < -asteroid) {

                stack.pop();
            }

            if (!stack.isEmpty()
                    && asteroid < 0
                    && stack.peek() > 0) {

                if (stack.peek() == -asteroid) {
                    stack.pop();
                }

                continue;
            }

            stack.push(asteroid);
        }

        int[] ans = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}