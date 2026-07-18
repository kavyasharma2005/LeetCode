class Solution {
    public int findGCD(int[] nums) 
    { int max=nums[0],min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        while(max%min!=0)
        {
           int temp=min;
            min=max%min;
            max=temp;
        }
        return min;
    }
}