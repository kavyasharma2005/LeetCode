class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int zeroes=0,left=0,right=0;
        int maxlen=0,len;
        for(right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                zeroes++;
            }
            while(k<zeroes)
            {
                if(nums[left]==0)
                zeroes--;
                left++;
            }
            len=right-left+1;
            maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
}