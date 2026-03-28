class Solution {
    public int gcdOfOddEvenSums(int n)
    {
        int esum=0,osum=0;
        if(n==1)
        return 1;
        else
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            esum+=i;
            else 
            osum+=i;
        }
        return (esum%osum);
    }
}