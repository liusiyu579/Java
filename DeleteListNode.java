

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class DeleteListNode {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        if(pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return node.next;
    }
}