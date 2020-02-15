import java.util.Stack;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/23 20:07
 * @Version 1.0
 **/
class Elem{
    public int data;
    public int min;
    public Elem(int data,int min){
        this.data = data;
        this.min = min;
    }
}
class MinStack {
    Stack<Elem> s ;
    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<>();
    }

    public void push(int x) {
        if(s.empty()||x <= s.peek().min){
            Elem elem = new Elem(x,x);
            s.push(elem);
        }else {
            if(x > s.peek().min){
                Elem elem = new Elem(x,s.peek().min);
                s.push(elem);
            }
        }
    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek().data;
    }

    public int min() {
        return s.peek().min;
    }
}
public class Test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(5);
        minStack.push(0);
        minStack.push(4);

        minStack.pop();
        System.out.println(minStack.top());

        System.out.println(minStack.min());
    }
}
