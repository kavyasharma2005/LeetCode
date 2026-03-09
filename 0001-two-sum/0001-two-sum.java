class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,n,j;
        n=nums.length;
         int arr[]=new int[2];
        for (i = 0; i <=n - 1; i++)
        {
            for (j = 0; j <=n- 1; j++)
            {
             if (nums[i] + nums[j]== target & i!=j)
                {
                  arr[0]=i;
                  arr[1]=j;
                }
            }
         }
            return  arr;  
  }
}