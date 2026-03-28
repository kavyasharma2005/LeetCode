class Solution {
    public int countPairs(List<Integer> nums, int target) 
    {int c=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=0+i;j<nums.size();j++)
            {
                if(nums.get(i)+nums.get(j)<target && i!=j)
                c++;
            }
        }
        return c;
    }
}