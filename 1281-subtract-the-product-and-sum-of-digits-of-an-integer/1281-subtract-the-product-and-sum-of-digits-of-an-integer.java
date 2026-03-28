class Solution {
    public int subtractProductAndSum(int n) 
    {
        int num=n,d=0,sum=0,pro=1;
        while(num>0)
        {
            d=num%10;
            sum+=d;
            pro*=d;
            num=num/10;
        }
        return pro-sum;

    }
}