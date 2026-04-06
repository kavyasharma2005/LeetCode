class Solution {
    public void sortColors(int[] nums) 
    {
        int start=0,mid=0,end=nums.length-1;
        int temp;
        while(mid<=end)
        {
            if(nums[mid]==0)
            {
                temp=nums[mid];
                nums[mid]=nums[start];
                nums[start]=temp;
                mid++;
                start++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                temp=nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
    }
}