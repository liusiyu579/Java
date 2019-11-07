/**
 * @ClassName MySignalList
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/7 19:46
 * @Version 1.0
 **/
class ListNode {
    public int data;
    public ListNode next;
    public ListNode (int data) {
        this.data=data;
        this.next=null;
    }
}
public class MySignalList {
    public ListNode head;
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head==null) {
            this.head=node;
        }else {
            node.next=this.head;
            this.head=node;
        }
    }
    public void display(){
        ListNode cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void display2(ListNode newHead){
        ListNode cur = newHead;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
    //1 ≤ m ≤ n ≤ 链表长度。
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode node = new ListNode(-1);
        ListNode pre = node;
        node.next=head;
        for (int i = 0; i <m-1 ; i++) {
            pre=pre.next;
        }
        ListNode cur =pre.next;
        for (int i = m; i <n ; i++) {
            ListNode curNext=cur.next;
            cur.next = curNext.next;
            curNext.next=pre.next;
            pre.next=curNext;
        }
        return node.next;
    }
}
