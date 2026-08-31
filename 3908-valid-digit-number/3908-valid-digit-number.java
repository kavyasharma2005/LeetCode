class Solution {
    public boolean validDigit(int n, int x) 
    {
        String s= String.valueOf(n);
        char digit =(char)('0'+x);

        if(s.charAt(0)==digit)
        return false;
        
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==digit)
            return true;
        }
        return false;
    }
}