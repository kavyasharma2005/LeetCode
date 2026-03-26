class Solution {
    public int findPeakElement(int[] nums) 
    {
        int i=0,pos=-1;
        for(i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]<nums[i]&&nums[i+1]<nums[i])
            {
                pos=i;
            break;
            }
        }
        if(pos!=-1)
        return pos;
        else
        {
            int max=nums[0];
            pos=0;
            for(i=0;i<nums.length;i++)
            {
                if(max<nums[i])
                pos=i;
            }
            return pos;
        }
        
    }
}