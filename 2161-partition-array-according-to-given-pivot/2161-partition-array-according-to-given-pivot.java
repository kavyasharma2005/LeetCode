class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
    int left=0,right=nums.length-1;
    int ans[]=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]<pivot)
        ans[left++]=nums[i];
        else 
        continue;
       } 
       for(int i=nums.length-1;i>=0;i--)
       {
        if(nums[i]>pivot)
        ans[right--]=nums[i];
        else 
        continue;
       }
        for(int i=left;i<=right;i++)
        {
            ans[i]=pivot;
        }
        return ans;
    } 
}