class Solution {
    public int firstUniqChar(String s) 
    {
        for(int i = 0; i < s.length(); i++)
        {
            int freq = 0;
            for(int j = 0; j < s.length(); j++)
            {
                if(i != j && s.charAt(i) == s.charAt(j))
                {
                    freq = 1;
                    break;
                }
            }
        if(freq == 0)
            return i;
        }
        return -1;
    }
}