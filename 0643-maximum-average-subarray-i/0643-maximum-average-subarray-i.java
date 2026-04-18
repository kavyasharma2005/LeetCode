class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        double avrg,maxavrg,sum=0.0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxavrg=sum/k;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            avrg=sum/k;
            maxavrg=Math.max(avrg,maxavrg);
        }
        return maxavrg;
    }
}