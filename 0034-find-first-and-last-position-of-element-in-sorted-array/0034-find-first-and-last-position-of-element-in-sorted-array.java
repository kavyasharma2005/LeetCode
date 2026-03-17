class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int i,flag1=-1,flag2=-1,j;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
            flag1=1;
            break;
            }
        }
        for(j=nums.length-1;j>=0;j--)
        {
        if(nums[j]==target)
        {
        flag2=1;
        break;
        }
        }
        if(flag1==-1 && flag2==-1)
        return new int [] {-1,-1};
        else
        return new int [] {i,j};
        
    }
}