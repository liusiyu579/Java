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
        ListNode cur=this.head;
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
    //打印单链表（1）
    public void display2(ListNode newHead){
        ListNode cur=newHead;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
	//（2）
    public void display(){
        ListNode cur=this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
