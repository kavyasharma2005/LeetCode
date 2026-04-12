class Solution {
    public int findPairs(int[] nums, int k) 
    {
        Arrays.sort(nums);

        int left = 0;
        int right = 1;
        int count = 0;

        while (right < nums.length)
        {
            if (left == right)
            {
                right++;
            }
            else
            {
                int diff = nums[right] - nums[left];

                if (diff == k)
                {
                    count++;
                    left++;
                    right++;

                    while (right < nums.length && nums[right] == nums[right - 1])
                    {
                        right++;
                    }
                }
                else if (diff < k)
                {
                    right++;
                }
                else
                {
                    left++;
                }
            }
        }
        return count;
    }
}