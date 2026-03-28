class Solution {
    public int missingNumber(int[] nums) 
    {
        int sum=0,n=nums.length+1;
        for(int i=0;i<nums.length;i++)
        {
          sum+=nums[i];
        }
        int misno=(((n-1)*(n))/2-sum);
        return misno;
    }
}