class Solution {
    public int[] transformArray(int[] nums) 
    {int i,j,e=0,o=0,n=nums.length;
    for(i=0;i<n;i++)
    {
        if(nums[i]%2==0)
        e++;
        else 
        o++;
    }
        for(i=0;i<e;i++)
        {
            nums[i]=0;
        }
        for(i=e;i<n;i++)
        {
            nums[i]=1;
        }
    return nums;
    }
}