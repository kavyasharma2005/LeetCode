class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int index=nums.length-1,left=0,right=nums.length-1;
        int leftsqr,rightsqr;
        int res[]=new int [nums.length];
        while(index>=0)
        {
            leftsqr=nums[left]*nums[left];
            rightsqr=nums[right]*nums[right];
            if(rightsqr<=leftsqr)
            {
                res[index--]=leftsqr;
                left++;
            }
            else
            {
                res[index--]=rightsqr;
                right--;
            }
        }
        return res;
    }
}