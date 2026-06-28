/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class Solution 
 {
    public ListNode mergeKLists(ListNode[] lists) 
    {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Step 1: add all list heads
        for (ListNode node : lists) 
        {
            if (node != null) 
            {
                pq.offer(node);
            }
        }

        ListNode head = null;
        ListNode tail = null;

        // Step 2: process heap
        while (!pq.isEmpty()) 
        {
            ListNode curr = pq.poll();

            if (head == null) 
            {
                // first node becomes head
                head = curr;
                tail = curr;
            } 
            else 
            {
                tail.next = curr;
                tail = tail.next;
            }

            if (curr.next != null) 
            {
                pq.offer(curr.next);
            }
        }
        return head;
    }
}