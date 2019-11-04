/**
 * @ClassName TestDemo
 * @Description 测试单链表
 * @Author lenovo
 * @Date 2019/11/3 17:57
 * @Version 1.0
 **/
public class TestDemo {
    //    //找到两个单链表交点
    public static ListNode getIntersectioonNode(ListNode headA,ListNode headB){
        if(headA==null||headB==null) {
            return null;
        }
        ListNode pL=headA;
        ListNode pS=headB;
        int lenA=0;
        int lenB=0;
        while(pL!=null) {
            lenA++;
            pL=pL.next;
        }
        while(pS!=null) {
            lenB++;
            pS=pS.next;
        }
        pL=headA;
        pS=headB;
        int len=lenA-lenB;
        if(len<0) {
            pL=headB;
            pS=headA;
            len=lenB-lenA;
        }
        while(len>0){
            pL=pL.next;
            len--;
        }
        while(pL!=pS&&pL!=null) {
            pL=pL.next;
            pS=pS.next;
        }
        if(pL==pS&&pL!=null) {
            return pL;
        }
        return null;
    }
    //    //设置交叉点
    public static void createCut(ListNode headA,ListNode headB) {
        headA.next=headB.next.next;
    }
    public static void main(String[] args) {
        MySignalList mySignalList = new MySignalList();
        mySignalList.addLast(1);
        mySignalList.addLast(3);
        mySignalList.addLast(5);
        mySignalList.addLast(7);
        mySignalList.addLast(14);
        mySignalList.display();
        MySignalList mySignalList1 = new MySignalList();
        mySignalList1.addLast(2);
        mySignalList1.addLast(6);
        mySignalList1.addLast(13);
        mySignalList1.addLast(15);
        mySignalList1.addLast(17);
        mySignalList1.display();
        createCut(mySignalList.head,mySignalList1.head);
        ListNode node=getIntersectioonNode(mySignalList.head,mySignalList1.head);
        System.out.println(node.data);
    }
}
