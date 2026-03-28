class Solution {
    public int countEven(int num) 
    {
        int i,count=0,d=0,sum=0;
        for(i=1;i<=num;i++)
        {
            if(i%2==0 && i<10)
            count++;
            else
            {
                int temp=i;
                sum=0;
            while(temp!=0)
            {
                d=temp%10;
                sum+=d;
                temp=temp/10;
            }
            if(sum%2==0)
            count++;
            }
        }
        return count;
    }
}