class Solution {
    public int[] decompressRLElist(int[] nums) 
    {
        int n=0,freq,val,k=0;
        for(int  j=0;j<nums.length;j++)
        {
            if(j%2==0)
            n+=nums[j];
        }
        int ans[]=new int[n];
        for(int i=0;i<nums.length/2;i++)
        {
            freq=nums[2*i];
            val=nums[2*i+1];
            for(int j=1;j<=freq;j++)
            {
                ans[k++]=val;
            }
        }
        return ans;
    }
}