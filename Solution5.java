/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution5 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) {
            return null;
        }  
        int count = 0;
        ListNode p = head;
        while(p != null) {
            count++;
            p = p.next;
        }
        if(count == n) {
            head = head.next;
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(n > 0) {
            fast = fast.next;
            n--;
        }
        
        while(fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        slow.next = cur.next;
        return head;
    }
}