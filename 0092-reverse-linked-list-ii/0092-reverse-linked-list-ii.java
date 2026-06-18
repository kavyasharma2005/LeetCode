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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right)
            return head;

        ListNode prev = null;
        ListNode curr = head;

        // Move to position left
        for (int i = 1; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode connection = prev; // node before left
        ListNode tail = curr;       // first node of reversed part

        // Reverse right-left+1 nodes
        ListNode next = null;
        for (int i = 0; i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Reconnect
        if (connection != null)
            connection.next = prev;
        else
            head = prev; // left == 1

        tail.next = curr;

        return head;
    }
}