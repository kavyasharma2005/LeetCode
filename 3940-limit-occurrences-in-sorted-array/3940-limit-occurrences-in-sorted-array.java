class Solution 
{
    public int[] limitOccurrences(int[] nums, int k) 
    {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Count frequency
        for (int num : nums) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Add each element at most k times
        for (int key : map.keySet()) 
        {
            int count = Math.min(map.get(key), k);

            while (count > 0) 
            {
                list.add(key);
                count--;
            }
        }

        // Convert ArrayList to int[]
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) 
        {
            ans[i] = list.get(i);
        }

        return ans;
    }
}