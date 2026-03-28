class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    { int d=0,sum=0,num=x;
    while(x!=0)
    {
        d=x%10;
        sum+=d;
        x=x/10;
    }
    if(num%sum==0)
    return sum;
    else 
    return -1;
    }
}