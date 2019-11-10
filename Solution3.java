/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution3 {
    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return null;
        }
        ListNode cur = head; 
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while (cur != null) {
            if (cur.val < x) {
               if (beforeStart == null) {
                   beforeStart = cur;
                   beforeEnd = beforeStart;
               } else {
                   beforeEnd.next = cur;
                   beforeEnd = beforeEnd.next;
               }
            }else {
                if (afterStart == null) {
                   afterStart = cur;
                   afterEnd = afterStart;
               } else {
                   afterEnd.next = cur;
                   afterEnd = afterEnd.next;
               }
            }
            cur = cur.next;
        }
        if (beforeStart == null) {
            return afterStart;
        }
        if (afterStart != null) {
            afterEnd.next = null;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
    }
}