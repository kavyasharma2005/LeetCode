class Solution 
{
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) 
        {

            if (c == '(') 
            {
                // Marker for a new '('
                stack.push(0);
            } 
            else 
            {

                // Case 1: "()"
                if (stack.peek() == 0) 
                {
                    stack.pop();      // remove marker
                    stack.push(1);    // score of "()"
                }

                // Case 2: "(A)"
                else {

                    int sum = 0;

                    // Sum all scores inside current parentheses
                    while (stack.peek() != 0) 
                    {
                        sum += stack.pop();
                    }

                    stack.pop();          // remove '(' marker (0)

                    stack.push(2 * sum);  // (A) = 2 × A
                }
            }
        }

        int ans = 0;

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}