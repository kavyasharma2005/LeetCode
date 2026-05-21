class Solution {
    public int maxProduct(int[] nums) 
    {
        int pro=nums[0],min=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]<0) 
           {
            int temp=min;
            min=max;
            max=temp;
           }

           max=Math.max(nums[i],max*nums[i]);
           min=Math.min(nums[i],min*nums[i]);
           pro=Math.max(pro,max);
        }
        return pro;
    }
}