class Solution {
    public String simplifyPath(String path) 
    {
        Stack<String> stack = new Stack<>();
        String arr[]=path.split("/");
        for(String s:arr)
        {
            if(s.equals("") || s.equals("."))
            continue;
            else if(s.equals(".."))
            {
                if(!stack.isEmpty())
                stack.pop();
            }
            else
            stack.push(s);
        }
        StringBuilder ans = new StringBuilder();
        for (String dir : stack) 
        {
            ans.append("/").append(dir);
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}