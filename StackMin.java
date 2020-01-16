import java.util.Stack;
public class Test {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public  void push(int node) {
        stack.push(node);
        if(minStack.empty()||node<minStack.peek()){
            minStack.push(node);
        } 
    }

    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}