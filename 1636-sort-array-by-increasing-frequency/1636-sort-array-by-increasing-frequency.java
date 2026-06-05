class Solution 
{
    public int[] frequencySort(int[] nums) 
    {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: count frequency
        for (int num : nums) 
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[nums.length];
        int index = 0;

        // Step 2: keep selecting best element until map is empty
        while (!freq.isEmpty()) 
        {

        int chosen = 0;
        int minFreq = Integer.MAX_VALUE;

        for (int key : freq.keySet()) 
        {

        int f = freq.get(key);

        if (f < minFreq || (f == minFreq && key > chosen)) {
        minFreq = f;
        chosen = key;
        }
        }

            // fill result
            for (int i = 0; i < minFreq; i++) 
            {
                res[index++] = chosen;
            }

            // remove used element
            freq.remove(chosen);
        }

        return res;
    }
}