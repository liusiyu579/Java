import java.util.Arrays;

/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/27 21:13
 * @Version 1.0
 **/
public class TestDemo {
    public static boolean func(char[] ch ){
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] < 1 || ch[i] > 9) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "15525f25";
        char[] ch = str.toCharArray();
        System.out.println(func(ch));
    }
}
