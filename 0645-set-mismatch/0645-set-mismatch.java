class Solution 
{

    public int[] findErrorNums(int[] nums) 
    {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        int duplicate = -1;

        for (int num : nums) 
        {

            if (!set.add(num))
                duplicate = num;
        }

        int missing = -1;

        for (int i = 1; i <= nums.length; i++) 
        {

            if (!set.contains(i)) 
            {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}