/**
 * @ClassName Main
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/16 22:51
 * @Version 1.0
 **/
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        while(scan.hasNextLine()) {
            str = scan.nextLine();
            String[] s = str.split(" ");
            int n = s[s.length-1].length();
            System.out.println(n);
        }
    }
}
