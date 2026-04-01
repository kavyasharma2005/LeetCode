class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int freq = 0;
        int pro = 1;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
                pro *= nums[i];
            else
                freq++;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(freq == 1)
            {
                if(nums[i] != 0)
                    nums[i] = 0;
                else
                    nums[i] = pro;
            }
            else if(freq > 1)
            {
                nums[i] = 0;
            }
            else
            {
                nums[i] = pro / nums[i];
            }
        }

        return nums;
    }
}