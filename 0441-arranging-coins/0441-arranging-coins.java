class Solution {
    public int arrangeCoins(int n) {
        long sum=0,i;
        for( i=1;i<=n;i++)
        {
            sum+=i;
            if(sum>n)
            break;
        }
    return (int)i-1;   
    }
}