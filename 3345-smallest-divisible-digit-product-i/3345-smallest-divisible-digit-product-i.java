class Solution {
    public int smallestNumber(int n, int t) 
    {
        while(true)
        {
            int d=0;
            int num=n++;
            int pro=1;
            while(num>0)
            {
                d=num%10;
                num/=10;
                pro*=d;
            }
            if(pro%t==0)
            return n-1;
        }
    }
}