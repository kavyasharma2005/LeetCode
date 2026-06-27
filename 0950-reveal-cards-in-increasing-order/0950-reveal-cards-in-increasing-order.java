class Solution 
{
    public int[] deckRevealedIncreasing(int[] deck) 
    {
        // Step 1: Sort the deck
        Arrays.sort(deck);

        int n = deck.length;
        int[] ans = new int[n];

        // Step 2: Store all indices in a queue
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) 
        {
            queue.offer(i);
        }

        // Step 3: Place each sorted card
        for (int card : deck) 
        {
            // Get the position where this card should go
            int index = queue.poll();
            ans[index] = card;

            // Simulate moving the next index to the back
            if (!queue.isEmpty()) 
            {
                queue.offer(queue.poll());
            }
        }

        return ans;
    }
}