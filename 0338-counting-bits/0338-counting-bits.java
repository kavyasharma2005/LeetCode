class Solution {
    public int[] countBits(int n) 
    {
        int num[]=new int[n+1];
        int count=0;
        for(int i=0;i<=n;i++)
        {
            count=0;
            int temp=i;
            while(temp>0)
            {
                if(temp%2==1)
                count++;
                temp/=2;
            }
            num[i]=count;
        }
        return num;
    }
}