import java.util.Scanner;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/13 18:48
 * @Version 1.0
 **/
public class Solution {
    public static String LeftRotateString(String str,int n) {
        if(str.length() == 0) {
            return "";
        }
        String str2 = str.substring(0,n);
        String str3 = str.substring(n,str.length());
        return str3+str2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        System.out.println(LeftRotateString(str,n));
    }
}
