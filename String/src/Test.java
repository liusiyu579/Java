import java.util.Stack;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/15 19:36
 * @Version 1.0
 **/
public class Test {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(ch != '#'){
                s1.push(ch);
            }else if(s1.empty()){
                continue;
            }else {
                s1.pop();
            }
        }
        for (int j = 0; j <T.length() ; j++) {
            char ch = T.charAt(j);
            if(ch != '#'){
                s2.push(ch);
            }else if(s2.empty()){
                continue;
            }else {
                s2.pop();
            }
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s="xywrrmp";
        String t="xywrrmu#p";
        System.out.println(backspaceCompare(s,t));
    }
}
