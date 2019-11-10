/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/31 12:47
 * @Version 1.0
 **/
public class TestDemo {
    //找到两个单链表交点
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA == null || headB == null) {
            return  null;
        }
        //指向最长单链表
        ListNode pL=headA;
        //指向短的单链表
        ListNode pS=headB;
        int lenA=0;
        int lenB=0;
        //分别求长度
        while(pL != null) {
            lenA++;
            pL=pL.next;
        }
        while(pS != null) {
            lenB++;
            pS=pS.next;
        }
        pL=headA;
        pS=headB;
        //求长度差值
        int len=lenA-lenB;
        //负数  pL=headB     pS=headA
        if(len < 0) {
            pL=headB;
            pS=headA;
            len=lenB-lenA;
        }
        //pL走len 步   走完之后 两个同时走  走到.next相同时就是交点
        while(len > 0) {
            pL=pL.next;
            len--;
        }
        //没考虑一个节点
        //while(pL.next!=pS.next) {
        //    pL=pL.next;
        //    pS=pS.next;
        //}
        while(pL != pS && pL != null) {
            pL=pL.next;
            pS=pS.next;
        }
        if(pL == pS && pS != null) {
            return pL;
        }
        //万一没有相交 并且两个单链表长度一样 防止最后一个节点
        //if(pL.next==pS.next || pL.next!=null) {
        //    return pL.next;
        //}

        return null;
    }
    //设置交叉点
    public static void createCut(ListNode headA,ListNode headB){
        headA.next.next=headB.next.next.next;
    }
    //两个有序单链表串起来
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB) {
        ListNode node=new ListNode(-1);
        ListNode tmp=node;
        while(headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else {
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }
        if(headA != null) {
            tmp.next=headA;
        }
        if(headB != null) {
            tmp.next=headB;
        }
        return node.next;
    }
    public static void main(String[] args) {
        MySignalList mySignalList=new MySignalList();
        mySignalList.addLast(1);
        mySignalList.addLast(4);
        mySignalList.addLast(6);
        mySignalList.addLast(7);
        mySignalList.addLast(9);
        //mySignalList.addLast(12);
        mySignalList.clear();
        mySignalList.display();
        System.out.println("hhhh");
        //MySignalList mySignalList2=new MySignalList();
        //mySignalList2.addLast(2);
        //mySignalList2.addLast(3);
        //mySignalList2.addLast(5);
        //mySignalList2.addLast(8);
        //mySignalList2.addLast(10);
        //mySignalList2.addLast(11);
        //mySignalList2.display();
       // mySignalList.display2(mergeTwoLists(mySignalList.head,mySignalList2.head));
       //createCut(mySignalList.head,mySignalList2.head);
        //ListNode node=getIntersectionNode(mySignalList.head,mySignalList2.head);
        //System.out.println(node.data);
/*
        //mySignalList.display2(mySignalList.reverseList2());
        //mySignalList.display2(mySignalList.reverseList2());
       // ListNode node=mySignalList.partition(4);
        ListNode node=mySignalList.deleteDuplication();
        //mySignalList.display2(node);
        //System.out.println(mySignalList.chkPalindrome());
        mySignalList.createLoop();
        System.out.println(mySignalList.hasCycle());
        ListNode node=mySignalList.detectCycle();
        System.out.println(node.data);
        System.out.println(mySignalList.listLen());
        */
    }
}
