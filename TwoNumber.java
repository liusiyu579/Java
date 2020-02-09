

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class TwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 0;
        ListNode node = new ListNode(-1);
        ListNode tmp = node;
        while(l1 != null || l2 != null){
            //int num1 = l1 == null? 0 :l1.val;
            //int num2 = l2 == null? 0 :l2.val;
            int num1 = 0;
            if(l1 == null){
                num1 = 0;
            }else {
                num1 = l1.val;
            }
            int num2 = 0;
            if(l2 == null){
                num2 = 0;
            }else {
                num2 = l2.val;
            }
            int num = num1+num2+i;
            i = num/10;
            tmp.next = new ListNode(num%10);
            if(l1 == null){
                l1 = null;
            }else {
                l1 = l1.next;
            }
            if(l2 == null){
                l2 = null;
            }else {
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if(i == 1){
            tmp.next = new ListNode(i);
        }
        return node.next;
    }
}