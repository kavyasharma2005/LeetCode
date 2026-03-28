class Solution {
    public int climbStairs(int n) 
    {
       int a=1,b=2,c=0;
       if(n<4)
       return n;
       else{
        for(int i=1;i<n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
       }
    }
}