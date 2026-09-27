class Solution {
    public String reverseParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) 
        {

            if (s.charAt(i) == '(') 
            {
                stack.push(result.length());
            }
            else if (s.charAt(i) == ')') 
            {
                int start = stack.pop();

                int left = start;
                int right = result.length() - 1;

                while (left < right) 
                {
                    char temp = result.charAt(left);
                    result.setCharAt(left, result.charAt(right));
                    result.setCharAt(right, temp);

                    left++;
                    right--;
                }
            }
            else 
            {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}