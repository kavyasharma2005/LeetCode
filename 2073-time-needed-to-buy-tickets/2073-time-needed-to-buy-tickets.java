import java.util.*;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> queue = new LinkedList<>();

        // Store indices of people
        for (int i = 0; i < tickets.length; i++) 
        {
            queue.offer(i);
        }

        int time = 0;

        while (!queue.isEmpty()) 
        {

            // Person at the front
            int person = queue.poll();

            // Buys one ticket
            tickets[person]--;
            time++;

            // If this person (k) has bought all tickets
            if (person == k && tickets[person] == 0) 
            {
                return time;
            }

            // Still needs more tickets
            if (tickets[person] > 0) 
            {
                queue.offer(person);
            }
        }

        return time;
    }
}