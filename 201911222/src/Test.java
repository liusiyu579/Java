import java.util.Stack;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/22 17:54
 * @Version 1.0
 **/
public class Test {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a,b,ret;
        String c;
        for(int i=0;i<tokens.length;i++){
            c=tokens[i];
            if(c.equals("+")){
                a=stack.pop();
                b=stack.pop();
                ret=a+b;
                stack.push(ret);
            }else if(c.equals("-")){
                a=stack.pop();
                b=stack.pop();
                ret=b-a;
                stack.push(ret);
            }else if(c.equals("*")){
                a=stack.pop();
                b=stack.pop();
                ret=a*b;
                stack.push(ret);
            }else if(c.equals("/")){
                a=stack.pop();
                b=stack.pop();
                ret=b/a;
                stack.push(ret);
            }else {
                ret=Integer.parseInt(c);
                stack.push(ret);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String[] s=new String[]{"4","13","5","/","+"};
        int a=evalRPN(s);
        System.out.println(a);
    }
}
