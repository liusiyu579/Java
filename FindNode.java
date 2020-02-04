

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
public class FindNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode pL = headA;
        ListNode pS = headB;
        while(pL!= null){
            lenA++;
            pL = pL.next;
        }
        while(pS != null){
            lenB++;
            pS = pS.next;
        }
        int len = lenA-lenB;
        pL = headA;
        pS = headB;
        if(len < 0){
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        }
        while(len > 0){
            pL = pL.next;
            len--;
        }
        while(pL != null && pL!= pS){
            pL = pL.next;
            pS = pS.next;
        }
        if(pL != null && pL == pS){
            return pL;
        }
        return null;
    }
}