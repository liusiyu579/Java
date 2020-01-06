import java.util.Stack;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/6 22:40
 * @Version 1.0
 **/
public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('||ch =='['||ch=='{'){
                st.push(ch);
            }else {
                if(st.empty()){
                    return false;
                }
                if(st.peek()=='('&&ch==')'||st.peek()=='['&&ch==']'||st.peek()=='{'&&ch=='}'){
                    st.pop();
                }else {
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}