class Solution 
{
    public boolean hasGroupsSizeX(int[] deck) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int card : deck) 
        {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;

        for (int freq : map.values()) 
        {
            minFreq = Math.min(minFreq, freq);
        }

        for (int x = 2; x <= minFreq; x++) 
        {

            boolean valid = true;

            for (int freq : map.values()) 
            {

                if (freq % x != 0) 
                {
                    valid = false;
                    break;
                }

            }
            if (valid)
                return true;
        }
        return false;
    }
}