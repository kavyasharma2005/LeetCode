class Solution {
    public int differenceOfSum(int[] nums)
    {
        int esum=0,dsum=0,d=0,n=0;
        for(int i=0;i<nums.length;i++)
        {
            esum+=nums[i];
            n=nums[i];
            while(n!=0)
            {
                d=n%10;
                n=n/10;
                dsum+=d; 
            }
        }
    return esum-dsum;
    }
}