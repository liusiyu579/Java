import java.util.Stack;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/15 20:16
 * @Version 1.0
 **/
public class Test {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0||popA.length==0){
            return false;
        }
        Stack<Integer> s=new Stack<>();
        int j=0;
        for (int i = 0; i < pushA.length; i++) {
            s.push(pushA[i]);
            while(j < pushA.length && s.peek() == popA[j]){
                s.pop();
                j++;
            }
        }
        return s.empty() ? true : false;
    }

    public static void main(String[] args) {
        int [] pushA=new int[]{1,2,3,4,5};
        int [] popA=new int[]{5,4,3,2,1};
        System.out.println(IsPopOrder(pushA,popA));
    }
}
