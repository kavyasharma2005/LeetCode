class Solution {
    public void moveZeroes(int[] nums) 
    {
        int fast=0,slow=0;
        for(fast=0;fast<nums.length;fast++)
        {
            if(nums[fast]!=0)
            {
            nums[slow]=nums[fast];
            {
            if(fast!=slow)
            nums[fast]=0;
            }
                slow++;
            }
        }
    }
}