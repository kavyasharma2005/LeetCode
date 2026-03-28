class Solution {
    public String truncateSentence(String s, int k) 
    {
        String ans=" ";
        int c=0,pos=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' )
            {
                c++;
            }
            if(c==k)
            {
                s=s.substring(pos,i);
            }
        }
        return s;
    }
}