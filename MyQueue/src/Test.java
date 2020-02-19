/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/23 21:57
 * @Version 1.0
 **/
class Node<E>{
    public E data;
    public Node<E> next;

    public Node(E data){
        this.data = data;
        next = null;
    }
    public Node(){
        next = null;
    }
}
class Queue<E>{
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public Queue(){
        front = rear = new Node<>();
        size = 0;
    }
    public boolean offer(E e){
        rear.next = new Node<>(e);
        rear = rear.next;
        size++;
        return true;
    }
    public E poll(){
        if(isEmpty()){
            return null;
        }
        E e = front.next.data;
        front.next = front.next.next;
        size--;
        return e;
    }
    public E peek(){
        return front.next.data;
    }
    public boolean isEmpty(){
        return 0==size;
    }
    public int size(){
        return size;
    }
}
public class Test {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);

        System.out.println(q.peek());
        System.out.println(q.size());
        q.offer(6);
        System.out.println(q.size());
        q.poll();
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}
