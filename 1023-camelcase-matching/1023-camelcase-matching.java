class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) 
    {
        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) 
        {
            ans.add(isCamel(q, pattern));
        }

        return ans;
    }
    boolean isCamel(String q,String p)
    {
        int i=0,j=0;
        while(i<q.length())
        {
            if(j<p.length() && q.charAt(i)==p.charAt(j))
            {
                i++;
                j++;
            }
            else if(Character.isLowerCase(q.charAt(i)))
            i++;
            else
            return false;
        }
        return j==p.length();
    }
}