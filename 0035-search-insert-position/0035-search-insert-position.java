class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int beg=0,end=nums.length-1,pos;
        int mid=0;
        while(end>=beg)
        {
        mid=(beg+end)/2;
        if(nums[mid]==target)
        {
         return mid;
        }
        else if(nums[mid]>target)
        {
            end=mid-1;
        }
        else
        {
            beg=mid+1;
        }
        }
        if(target>nums[mid])
        return mid+1;
        else
        return mid;
    }
}