/**
 * @ClassName 字符串： i am student 逆置 为  student  am i
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/5 23:04
 * @Version 1.0
 **/
public class Test3 {
    //逆置字符串
    public static StringBuffer func(String str) {
        StringBuffer st = new StringBuffer(str);
        return st.reverse();
    }
    //分段
    public static String[] func2(String str) {
        String[] s = str.split(" ");
        return s;
    }
    public static void main(String[] args) {
        String str = "i am student";
        String[] s =func2(str);
        for (int i = s.length-1; i >=0; i--) {
            StringBuffer sb = func(s[i]);
            StringBuffer sb2 = func(new String(sb));
            System.out.print(sb2+" ");
        }
        System.out.println();
    }
}
