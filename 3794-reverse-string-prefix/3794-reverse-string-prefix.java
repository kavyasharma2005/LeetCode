class Solution {
    public String reversePrefix(String s, int k) 
    {int len=s.length();
        String rev="";
        for(int i=k-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        s=rev+s.substring(k,len);
        return s;
    }
}