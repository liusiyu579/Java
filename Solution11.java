/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution11 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode pL = pHead1;
        ListNode pS = pHead2;
        int lenA = 0;
        int lenB = 0;
        while(pL != null) {
            lenA++;
            pL = pL.next;
        } 
        while(pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = pHead1;
        pS = pHead2;
        int len = lenA - lenB;
        if(len < 0) {
            pL = pHead2;
            pS = pHead1;
            len = lenB - lenA;
        }
        while(len > 0) {
            pL = pL.next;
            len--;
        }
        while(pL != null && pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        if(pL != null && pL == pS) {
            return pL;
        }
        return null;
    }
}