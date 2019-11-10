/**
 * @ClaspsName MySignalList
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/31 12:48
 * @Version 1.0
 **/
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class MySignalList {
    public ListNode head;
    public MySignalList(){
        this.head=null;
    }
    //头插
    public void addFirst(int data) {
        ListNode node=new ListNode(data);
        if(this.head==null) {
            this.head=node;
        }else {
            node.next=this.head;
            this.head=node;
        }
    }
    //尾插
    public void addLast(int data) {
        ListNode node=new ListNode(data);
        if(this.head==null) {
            this.head=node;
        }else {
            ListNode cur=this.head;
            while (cur.next != null) {
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    //查找是否包含关键字key在单链表当中
    public boolean contains(int key) {
        if(this.head==null) {
            return false;
        }else {
            ListNode cur = this.head;
            while (cur!= null) {
                if (cur.data == key) {
                    return true;
                }
                cur=cur.next;
            }
            return false;
        }
    }
    //得到单链表的长度
    public int getLength() {
        int count=0;
        ListNode cur=this.head;
        while(cur!=null) {
            count++;
            cur=cur.next;
        }
        return count;
    }
    //任意位置插入，第一个数据节点为0号下标
    //找到index-1
    private ListNode searchIndex(int index) {
        int count = 0;
        ListNode cur=this.head;
        for (int i = count; i <index-1; i++) {
            cur=cur.next;
        }
        return cur;
    }
    public boolean addIndex(int index,int data) {
        ListNode node=new ListNode(data);
        if(index<0||index>getLength()) {
            System.out.println("index不合法");
            return false;
        }
        if(this.head==null) {
            System.out.println("单链表为空");
            return false;
        }
        if(index==0) {
            addFirst(data);
            return true;
        }
        ListNode cur=searchIndex(index);
        if(cur!=null) {
            node.next = cur.next;
            cur.next = node;
        }
        return true;
    }
    //删除第一次出现关键字为key的节点
    //找到key的前驱
    private ListNode prev(int key) {
        ListNode prev=this.head;
        while(prev.next!=null) {
            if(prev.next.data==key) {
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }
    public void remove(int key) {
        if(this.head==null) {
            return;
        }
        if(this.head.data==key) {
            this.head=this.head.next;
            return;
        }
        ListNode prev=prev(key);
        if(prev==null) {
            System.out.println("没找到key");
            return;
        }
        prev.next=prev.next.next;
    }
    //删除所有出现key的节点
    public void allRemoveKey(int key) {
        ListNode prev =this.head;
        ListNode cur=this.head.next;
        while(cur!=null) {
            if(prev.next.data==key) {
                prev.next=cur.next;
                cur=cur.next;
            }else {
                prev=cur;
                cur=cur.next;
            }
        }
        if(this.head.data==key) {
            this.head=this.head.next;
        }
    }
    //防止内存泄漏
    public void clear(){
        //一个一个至为null
        /*
        if(this.head == null) {
            return;
        }
        while(this.head != null) {
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head = cur;
        }
        */
        //
        this.head = null;
    }

    //反转单链表(1)
    public ListNode reverseList () {
        ListNode newHead=null;
        ListNode prev=null;
        ListNode cur=this.head;
        while(cur!=null) {
            ListNode curNext=cur.next;
            if(curNext==null) {
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    //反转单链表（2）
    public ListNode reverseList2(){
        ListNode cur=this.head;
        ListNode curNext=cur.next;
        this.head.next=null;
        while(curNext!=null) {
            ListNode tmp=curNext.next;
            curNext.next=cur;
            cur=curNext;
            curNext=tmp;
        }
        return cur;
    }
    //打印单链表（2）
    public void display2(ListNode newHead){
        ListNode cur=newHead;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
	//（1）
    public void display(){
        ListNode cur=this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //单链表的中间节点
    public ListNode middleNode(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast != null && fast.next != null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //返回第倒数k-1个节点
    public ListNode findKthToTail(int k){
        if(k < 0) {
            return null;
        }
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(k-1 > 0) {
            if(fast.next != null) {
                fast=fast.next;
                k--;
            }else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    //分割单链表
    public ListNode partition(int x){
        ListNode cur=this.head;
        ListNode beforeStart=null;
        ListNode beforeEnd=null;
        ListNode afterStart=null;
        ListNode afterEnd=null;
        while(cur!=null) {
            ListNode curNext=cur.next;
            cur.next=null;
            if(cur.data<x) {
                if(beforeStart==null) {
                    beforeStart=cur;
                    beforeEnd=beforeStart;
                }else {
                    beforeEnd.next=cur;
                    beforeEnd=beforeEnd.next;
                }
            }else {
                if (afterStart==null){
                    afterStart=cur;
                    afterEnd=afterStart;
                }else{
                    afterEnd.next=cur;
                    afterEnd=afterEnd.next;
                }
            }
            //cur=cur.next;
            cur=curNext;
        }
        if(beforeStart==null) {
            return afterStart;
        }
        beforeEnd.next=afterStart;
        //if(afterStart!=null) {
        //    afterEnd.next = null;
        //}
        return beforeStart;
    }
    //遇到重复就删除
    public ListNode deleteDuplication (){
        ListNode node=new ListNode(-1);
        ListNode cur=this.head;
        ListNode tmp=node;
        while(cur!=null) {
            if(cur.next!=null&& cur.data==cur.next.data) {
                //循环
                while(cur.next!=null&&cur.data==cur.next.data) {
                    cur=cur.next;
                }
                //退出循环，cur多走一步
                cur=cur.next;
                //tmp.next=cur;
            }else {
                //当前节点不等于下一个节点
                tmp.next=cur;
                cur=cur.next;
                tmp=tmp.next;
            }
        }
        tmp.next=null;
        return node.next;
    }
    //回文
    public boolean chkPalindrome(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }

        //反转
        ListNode p=slow.next;
        while(p!=null) {
            ListNode pNext=p.next;
            //反转
            p.next=slow;
            slow=p;
            p=pNext;
        }
        //slow往前  head往后
        //直到相遇
        while(slow!=head) {
            if(slow.data!=head.data) {
                return false;
            }
            //偶数
            if(this.head.next==slow) {
                return true;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
    //判断是否有环   一个走一步 一个走两步
    public boolean hasCycle(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                return true;
            }
        }
        return false;
    }
    //建环
    public void createLoop(){
        ListNode cur=this.head;
        while(cur.next!=null) {
            cur=cur.next;
        }
        cur.next=this.head.next.next.next;
    }
    //找环的入口点
    public ListNode detectCycle (){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                break;
                //slow=this.head;
                //while(slow!=fast) {
                //    slow=slow.next;
                //    fast=fast.next;
                //}
                //if (slow==fast) {
                //    return slow;
                //}
            }
        }
        if(fast==null||fast.next==null)
        {
            return null;
        }
        //return null;
        slow=this.head;
        while(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
    //求环长度
    public int listLen(){
        ListNode fast=this.head;
        ListNode slow=this.head;
        while(fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                break;
                //slow=this.head;
                //while(slow!=fast) {
                //    slow=slow.next;
                //    fast=fast.next;
                //}
                //if (slow==fast) {
                //    return slow;
                //}
            }
        }
        if(fast==null||fast.next==null)
        {
            return -1;
        }
        //return null;
        int count=1;
        slow=slow.next;
        while(slow!=fast) {
            slow = slow.next;
            count++;
        }
        return count;
    }
    //
}
