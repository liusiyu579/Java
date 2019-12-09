import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName TestDemo1
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/8 17:42
 * @Version 1.0
 **/
public class TestDemo1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length();i++) {
            char ch = str.charAt(i);
            if(!sb.toString().contains(ch + "") ) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
