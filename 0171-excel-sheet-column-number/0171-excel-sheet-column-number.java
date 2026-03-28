class Solution {
    public int titleToNumber(String columnTitle) 
    {
        int sum=0;
        long col=1;
        int n=columnTitle.length();
        for(int i=0;i<n;i++)
        {
            char ch=columnTitle.charAt(i);
            sum=ch-'A'+1;
            col+=sum* Math.pow(26,(n-1-i));
        }
        return (int)col-1;
    }
}