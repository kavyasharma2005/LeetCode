class Solution {
    public int alternateDigitSum(int n)
    {
        int d=0,sum=0,num=n,rev1=0,c=0;
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        c++;
    }
    while(num!=0)
    {
        if(c%2==0)
        {
        d=num%10;
        d=d*-1;
        sum+=d;
        num=num/10;
        c--;
        }
        else  
        {
        d=num%10;
        sum+=d;
        num=num/10;
        c--;
        }
    }
     return sum;
    }
}