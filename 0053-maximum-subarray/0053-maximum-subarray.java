class Solution {
    public int maxSubArray(int[] nums) 
    {
        int currentsum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentsum=Math.max(currentsum+nums[i],nums[i]);
            max=Math.max(max,currentsum);
        }
        return max;
    }
}