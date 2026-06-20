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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        while (head != null && head.next != null &&
               head.val == head.next.val) 
               {

            int val = head.val;

            while (head != null && head.val == val) 
            {
                head = head.next;
            }
        }

        if (head == null) return null;

        ListNode curr = head;

        while (curr.next != null && curr.next.next != null) 
        {

            if (curr.next.val == curr.next.next.val) 
            {

                int val = curr.next.val;

                while (curr.next != null && curr.next.val == val) 
                {
                    curr.next = curr.next.next;
                }

            } 
            else 
            {
                curr = curr.next;
            }
        }

        return head;
    }
}