class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int avrg=0,maxavrg=0;
        for(int i=0;i<k;i++)
        maxavrg+=nums[i];
        avrg=maxavrg;
        for(int i=k;i<nums.length;i++)
        {
            avrg=avrg+nums[i]-nums[i-k];
            maxavrg=Math.max(maxavrg,avrg);
        }
        return (double)maxavrg/k;
    }
}