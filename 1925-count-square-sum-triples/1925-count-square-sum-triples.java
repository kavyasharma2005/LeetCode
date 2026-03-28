class Solution {
    public int countTriples(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            int a=i;
            for(int j=1;j<=n;j++)
            {
                    int b=j;
                    double c=Math.sqrt((a*a)+(b*b));
                    if(c%1==0 && c<=n)
                    count++;
            }
        }
        return count;
    }
}