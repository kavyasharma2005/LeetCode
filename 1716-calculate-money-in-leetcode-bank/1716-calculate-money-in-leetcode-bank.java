class Solution {
    public int totalMoney(int n) 
    {
        int sum=0;
        int k=n/7,c=0;
        n=n%7;
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<=7;j++)
            {
                sum+=j+c;
            }
            c++;
        }
        for(int i=1;i<=n;i++)
        {
            sum=sum+i+c;
        }
         return sum;    
    }
}