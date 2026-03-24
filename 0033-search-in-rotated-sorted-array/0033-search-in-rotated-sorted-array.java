class Solution {
    public int search(int[] nums, int target) 
    {
        int i,pos=-1; 
        for(i=0;i<nums.length;i++)
        {
          if(target==nums[i])
          {
            pos=i;
            break;  
          }
        }
        return pos;
    }
}