class Solution {
    public int[] getSneakyNumbers(int[] nums)
    {
        int k=0,d=-1;
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && i!=j && nums[i]!=d)
                {
                    if(k<2)
                    {
                    ans[k++]=nums[i];
                    d=nums[i];
                    }
                }
            }
        }
        return ans;
    }
}