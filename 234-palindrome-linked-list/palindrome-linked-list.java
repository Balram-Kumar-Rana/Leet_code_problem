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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode copy(ListNode head) {
        ListNode copy = new ListNode(head.val);
        ListNode temp = copy;
        ListNode curr = head.next;

        while (curr != null) {
            temp.next = new ListNode(curr.val);
            temp = temp.next;
            curr = curr.next;
        }
        return copy;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode copy = copy(head);
        ListNode rev = reverse(head);

        while (copy != null && rev != null) {
            if (copy.val != rev.val) {
                return false;
            }

            copy = copy.next;
            rev = rev.next;
        }

        return true;
    }
}