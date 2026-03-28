class Solution {
    public int minElement(int[] nums)
    {
        int d=0,sum=0,min=0,fmin=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=0)
            {
                d=nums[i]%10;
                nums[i]=nums[i]/10;
                sum+=d;
            } 
            nums[i]=sum;
            sum=0;
        }
        min=nums[0];
        for(int i=0;i<nums.length;i++)
        { 
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}