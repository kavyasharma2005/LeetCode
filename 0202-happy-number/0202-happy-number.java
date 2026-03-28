class Solution {
    public boolean isHappy(int n) 
    {
        int d,sum=0,num=n;
        if(n==1 || n==7)
        return true;
        else if(n<10)
        return false;
        while(num!=1 && num!=4)
        {
            sum=0;
        while(num!=0)
        {
            d=num%10;
            num=num/10;
            sum+=d*d;
        }
         num=sum;
        }
    if(sum==1)
    return true;
    else return false; 
    }
}