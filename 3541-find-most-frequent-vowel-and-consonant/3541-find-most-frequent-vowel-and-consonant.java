class Solution {
    public int maxFreqSum(String s) 
    {
        int i,count=0,vmax=0,cmax=0;
        String s1="aeiou";
        
        String s2=" ";
        for(i=0;i<s.length();i++)
        {
            if(s1.lastIndexOf(s.charAt(i))==-1)
            s2=s2+s.charAt(i);
        }
        s2=s2.trim();
        for(i=0;i<s1.length();i++)
        {
            count=0;
            char ch=s1.charAt(i);
            for(int j=0;j<s.length();j++)
            {
            if(ch==s.charAt(j))
            count++;
            vmax=Math.max(vmax,count);
            }
        }
        for(i=0;i<s2.length();i++)
        {
            count=0;
            char ch=s2.charAt(i);
            for(int j=0;j<s.length();j++)
            {
            if(ch==s.charAt(j))
            count++;
            cmax=Math.max(cmax,count);
            }
        }
        return vmax+cmax;
    }
}