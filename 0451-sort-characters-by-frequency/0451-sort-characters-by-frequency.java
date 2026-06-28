import java.util.*;

class Solution {
    public String frequencySort(String s) 
    {
        // Step 1: frequency map
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) 
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: max heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        // add all characters to heap
        for (char c : map.keySet()) 
        {
            pq.offer(c);
        }

        // Step 3: build result
        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) 
        {

            char c = pq.poll();
            int freq = map.get(c);

            while (freq-- > 0) 
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}