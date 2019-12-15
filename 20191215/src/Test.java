import java.util.*;
/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/15 22:50
 * @Version 1.0
 **/

public class Test {
    public static String rotateString(String A, int n, int p) {
        if(n == 0) {
            return "";
        }
        if(p<0 || p>n) {
            return "";
        }
        String str2 = A.substring(0,p+1);
        String str3 = A.substring(p+1,n);
        return str3+str2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int p = scan.nextInt();
        int n = str.length();
        System.out.println(rotateString(str,n,p));
    }
}
