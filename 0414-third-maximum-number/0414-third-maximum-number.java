class Solution {
    public int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
        int i=nums.length-1;
        int k=1;
        if(nums.length<3)
        return nums[nums.length-1];
        while( i>0)
        {
            if(nums[i]>nums[i-1])
            {
                k++;
            }
            if(k==3)
            {
            return nums[i-1];
            }
            i--;
        }
        return nums[nums.length-1];
    }
}