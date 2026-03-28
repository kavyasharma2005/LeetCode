class Solution {
    public int tribonacci(int n)
    {int a=0,b=1,c=1,tribo=0;
    if(n==1)
    return 1;
    else if(n==0)
    return 0;
    else if(n==2)
    return 1;
    else
    for(int i=1;i<n-1;i++)
    {
        tribo=a+b+c;
        a=b;
        b=c;
        c=tribo;
    }
    return tribo;
    }
}