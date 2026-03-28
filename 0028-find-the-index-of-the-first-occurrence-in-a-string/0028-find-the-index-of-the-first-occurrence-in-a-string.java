class Solution {
    public int strStr(String haystack, String needle) 
    {
        String s=" ";
        for(int i=0;i<haystack.length();i++)
        {
            if(needle.charAt(0)==haystack.charAt(i))
            if(i+needle.length()-1<haystack.length())
            {
            s=haystack.substring(i,i+needle.length());
            if(needle.equals(s))
            return i;
            else continue;
            }
        }
        return -1;
    }
}