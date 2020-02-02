

/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class RandomList {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        //1.将新老节点串起来
        RandomListNode cur = pHead;
        while(cur != null){
            RandomListNode node = new RandomListNode(cur.label);
            RandomListNode tmp = cur.next;
            node.next = tmp;
            cur.next = node;
            cur = tmp;
        }
        //2.处理random
        cur = pHead;
        while(cur != null){
            if(cur.random != null){
                cur.next.random = cur.random.next;
            }else {
                cur.next.random = null;
            }
            cur = cur.next.next;
        }
        //3.拆分
        cur = pHead;
        RandomListNode newHead = cur.next;
        while(cur.next != null){
            RandomListNode tmp = cur.next;
            cur.next = tmp.next;
            cur = tmp;
        }
        return newHead;
    }
}