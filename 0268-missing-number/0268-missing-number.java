class Solution {
    public int missingNumber(int[] nums) 
    {
        int sum=0,n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
          sum+=nums[i];
        }
        int misno=(((n)*(n+1))/2-sum);
        return misno;
    }
}