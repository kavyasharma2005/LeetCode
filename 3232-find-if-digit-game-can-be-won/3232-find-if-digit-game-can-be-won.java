class Solution {
    public boolean canAliceWin(int[] nums)
    {
        int dsum=0,ssum=0;
        for(int i=0;i<nums.length;i++)
        if(nums[i]>9)
        {
            dsum+=nums[i];
        }
        else 
        ssum+=nums[i];
    if(dsum==ssum)
    return false;
    else 
    return true;
    }
}