class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();  
        for(int i:nums)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        } 
        int maxfreq=0;
        int count=0; 
        for(int i:map.keySet())
        {
            if(map.get(i)>maxfreq)
            {
            maxfreq=map.get(i);
            count=maxfreq;
            }
            else if(maxfreq==(map.get(i)))
            {
                count+=maxfreq;
            }
        }
        return count;
    }
}