class Solution {
    public int minElement(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int sum=0;
            while(num>0)
            {
                sum+=num%10;
                num/=10;
            }
            nums[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            min=Math.min(i,min);
        }
        return min;
    }
}