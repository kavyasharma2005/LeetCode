class Solution 
{
    public int findMaxValueOfEquation(int[][] points, int k) 
    {

        // Stores {x, y - x}
        Deque<int[]> deque = new ArrayDeque<>();

        int ans = Integer.MIN_VALUE;

        for (int[] point : points) 
        {

            int x = point[0];
            int y = point[1];

            // Remove points whose distance is greater than k
            while (!deque.isEmpty() && x - deque.peekFirst()[0] > k)
            {
                deque.pollFirst();
            }

            // Calculate answer using the best previous point
            if (!deque.isEmpty()) 
            {
                ans = Math.max(ans, x + y + deque.peekFirst()[1]);
            }

            // Remove smaller (y - x) values
            while (!deque.isEmpty() && deque.peekLast()[1] <= y - x) 
            {
                deque.pollLast();
            }

            // Add current point
            deque.offerLast(new int[]{x, y - x});
        }

        return ans;
    }
}