/**
 * @ClassName MySignalList2
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/3 23:03
 * @Version 1.0
 **/
class ListNode2{
    public int data;
    public ListNode2 next;
    public ListNode2(int data){
        this.data=data;
        this.next=null;
    }
}

public class MySignalList2 {
    public ListNode2 head;
    public MySignalList2(){
        this.head=null;
    }
    //头插
    public void addFirst(int data){
        ListNode2 node = new ListNode2(data);
        if(this.head == null) {//如果头结点为空，直接令头结点指向node
            this.head=node;
        }else {
            node.next=this.head;//让node.next指向头结点，再让头结点指向node
            this.head=node;
        }
    }
    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode2 findKthToTail(int k) {
        ListNode2 fast=this.head;
        ListNode2 slow=this.head;
        if(k<0) {
            return null;
        }
        while(k-1>0) {
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else {
                System.out.println("k值偏大" );
                return null;
            }
        }
        while(fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    //打印
    public void display(){
        ListNode2 cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
