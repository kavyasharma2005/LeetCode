class Solution {
    public int mirrorDistance(int n)
    {
    int rev=0,d,num=n;
    while(num!=0)
    {
        d=num%10;
        rev=rev*10+d;
        num=num/10;
    }
    return (Math.abs(n-rev));
    }
}