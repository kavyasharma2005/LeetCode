class Solution {
    public int singleNumber(int[] nums) 
    {
        int x, res=0;
        for(x=0;x<nums.length;x++)
        res^=nums[x];
    return res;
    }
}