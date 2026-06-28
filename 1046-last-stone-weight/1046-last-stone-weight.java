import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // add all stones
        for (int s : stones) 
        {
            pq.offer(s);
        }

        while (pq.size() > 1) 
        {

            int first = pq.poll();   // largest
            int second = pq.poll();  // second largest

            if (first != second) 
            {
                pq.offer(first - second);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}