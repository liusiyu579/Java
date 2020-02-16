/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/23 20:43
 * @Version 1.0
 **/
class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data = data;
        next = null;
    }
}
class Linked{
    public ListNode head;
    public void add(int x){
        ListNode node = new ListNode(x);
        if(head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    public void print(ListNode head){
        if(head != null){
            print(head.next);
            System.out.print(head.data);
        }
        System.out.println();
    }
    public void print1(){
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.data);
            cur = cur.next;
        }
        System.out.println();
    }
}
public class Test {
    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.add(5);
        linked.add(4);
        linked.add(3);
        linked.add(2);
        linked.add(1);

        linked.print(linked.head);
        linked.print1();
    }
}
