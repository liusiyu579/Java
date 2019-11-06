/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        Node cur=head;
        //1.将老新节点串起来
        while(cur != null) {
            Node node = new Node(cur.val,cur.next,null);
            Node tmp = cur.next;
            node.next = tmp;
            cur.next = node;
            cur = tmp;
        }
        //2.处理random
        cur = head;
        while(cur!= null) {
            if(cur.random != null) {
                cur.next.random = cur.random.next;
            } else {
                cur.next.random = null;
            }
            cur=cur.next.next;
        }
        //3.将老新节点拆分开
        cur = head;
        Node newHead = cur.next;
        while(cur.next != null) {
            Node tmp = cur.next;
            cur.next = tmp.next;
            cur = tmp;
        }
        return newHead;
    }
}