class Solution
{
    public int arraySign(int[] nums)
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
        int n=nums[i];
        if(n==0)
        return 0;
        else if(n<0)
        c++;
        }
        if(c%2==0)
        return 1;
        else
        return -1;
    }
}