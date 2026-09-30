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
    public ListNode revrese(ListNode head ){
        ListNode prev = null;
        ListNode curr = head ;
        while(curr != null){
            ListNode Next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = Next ;
        }
        return prev ;
    }
    public int size(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next ;
        }
        return  count ;

    }
    public int pairSum(ListNode head) {
        int revpos = (size(head)/2)-1 ;
        ListNode temp = head ;
        int i = 0;
        while(i != revpos){
            temp = temp.next;
            i++;
        }
        temp.next = revrese(temp.next);
        int max = 0 ;
        int sum = 0 ;
        temp = temp.next;
        while(temp != null){
            sum = head.val + temp.val;
            max = Math.max(max , sum );
            temp = temp.next;
            head = head.next;
        }
        return max ;
        
        
        
    }
}