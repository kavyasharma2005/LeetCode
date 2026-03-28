class Solution {
    public int findNumbers(int[] nums)
    {
        int d=0,f=0;
        for(int i=0;i<nums.length;i++)
        {
            d=0;
        while(nums[i]!=0)
        {
            nums[i]=nums[i]/10;
            d++;
        }
            if(d%2==0)
            f++;
        }
        return f;
    }
}