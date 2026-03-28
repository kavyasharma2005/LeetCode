class Solution {
    public long removeZeros(long n)
    {long d=0,sum=0,rev=0,rev1=0;
        while(n!=0)
        {
       d=n%10;
        n=n/10;
        if(d!=0)
        rev=rev*10+d;   
        }
        while(rev!=0)
        {
            d=rev%10;
            rev=rev/10;
            rev1=rev1*10+d;
        }
        return rev1;
    }
}