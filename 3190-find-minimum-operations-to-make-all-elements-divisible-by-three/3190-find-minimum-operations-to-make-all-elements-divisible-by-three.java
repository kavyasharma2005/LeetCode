class Solution {
    public int minimumOperations(int[] nums)
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==1)
            {
                nums[i]=nums[i]-1;
                c++;
            }
            else if(nums[i]%3==2)
            {
                nums[i]=nums[i]+1;
                c++;
            }
            else
            continue;
        }
        return c;
    }
}