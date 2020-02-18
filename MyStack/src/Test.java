/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/23 21:44
 * @Version 1.0
 **/
class Stack<E>{
    private E[] arr =  (E[])new Object[100];
    private int size = 0;
    public void push(E e){
        if(size == 100){
            return;
        }
        arr[size++] = e;
    }
    public E pop(){
        if(empty()){
            return null;
        }
        E e = arr[size-1];
        size--;
        return e;
    }
    public boolean empty(){
        return 0 == size;
    }
    public int size(){
        return size;
    }
    public E peek(){
        if(empty()){
            return null;
        }
        E e = arr[size-1];
        return e;
    }
}
public class Test {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println(s.size());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.size());
        System.out.println(s.peek());
    }
}
