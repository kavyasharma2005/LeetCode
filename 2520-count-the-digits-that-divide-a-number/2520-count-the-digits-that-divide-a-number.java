class Solution {
    public int countDigits(int num)
    {int c=0,x=num,d;
    while(x>0)
    {
        d=x%10;
        x=x/10;
        if(num%d==0)
        c++;
    }
    return c;
    }
}