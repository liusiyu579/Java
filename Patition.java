

import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Patition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null){
            return null;
        }
        ListNode cur = pHead;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while(cur != null){
            if(cur.val < x){
                if(beforeStart == null){
                    beforeStart = cur;
                    beforeEnd = beforeStart;
                }else {
                    beforeEnd.next = cur;
                    beforeEnd = beforeEnd.next;
                }
            }else {
                if(afterStart == null){
                    afterStart = cur;
                    afterEnd = afterStart;
                }else {
                    afterEnd.next = cur;
                    afterEnd = afterEnd.next;
                }
            }
            cur = cur.next;
        }
        if(beforeStart == null){
            return afterStart;
        }
        if(afterStart != null){
            afterEnd.next = null;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
    }
}