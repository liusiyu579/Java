

import java.util.Scanner;
class ListNode{
    public int val;
    public ListNode next;
    
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Main{
    public static ListNode add(){
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        for(int i = 1;i<=7;i++){
            tmp.next = new ListNode(i);
            tmp = tmp.next;
        }
        return node.next;
    }
    public static void main(String[] args){
        ListNode cur = add();
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for(int i = 0;i<7-k;i++){
            cur = cur.next;
        }
        System.out.println(cur.val);
    }
}