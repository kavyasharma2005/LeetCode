class Solution {

    public boolean backspaceCompare(String s, String t) 
    {

        return build(s).equals(build(t));
    }

    String build(String str) 
    {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) 
        {

            if (c != '#') 
            {
                stack.push(c);
            }
             else if (!stack.isEmpty()) 
            {
                stack.pop();
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack) 
        {
            ans.append(c);
        }

        return ans.toString();
    }
}