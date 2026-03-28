class Solution 
{
    public boolean isSameAfterReversals(int num)
    {
        int d=0,rev=0,rev2=0,n=num;
        while(num!=0)
        {
            d=num%10;
            num=num/10;
            rev=rev*10+d;
        }
        num=rev;
        while(rev!=0)
        {
            d=rev%10;
            rev=rev/10;
            rev2=rev2*10+d;
        }
        if(rev2==n)
        return true;
        else 
        return false;
    }
}