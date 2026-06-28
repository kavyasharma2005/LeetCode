import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {

        // Step 1: frequency map
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) 
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: min heap using comparator (based on frequency)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // compare frequency

        // Step 3: add elements to heap
        for (int key : freq.keySet()) 
        {

            int count = freq.get(key);

            pq.offer(new int[]{count, key});

            if (pq.size() > k) 
            {
                pq.poll();
            }
        }

        // Step 4: build result
        int[] res = new int[k];

        for (int i = 0; i < k; i++) 
        {
            res[i] = pq.poll()[1];
        }

        return res;
    }
}