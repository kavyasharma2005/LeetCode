class Solution {
    public int search(int[] nums, int target) 
    {
        int beg=0,end=nums.length-1,pos=-1;
        while(beg<=end)
        {
            int mid=(beg+end)/2;
            if(target==nums[mid])
            {
                pos=mid;
                break;
            }
            else if(target<nums[mid])
            end=mid-1;
            else
            beg=mid+1;
        }
        return pos;
    }
}