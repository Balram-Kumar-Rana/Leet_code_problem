/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int length1 = 0;
        int length2 = 0;

        // calculate first linklist length 
        while (temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }
        // claculate second Linklist length 

        while (temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }
        temp1 = headA;
        temp2 = headB;

        if (length1 > length2) {
            int step = length1 - length2;
            for (int i = 0; i < step; i++) {
                temp1 = temp1.next;
            }
        } else {
            int step = length2 - length1;
            for (int i = 0; i < step; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;

    }
}