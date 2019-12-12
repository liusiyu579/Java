import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/11 18:51
 * @Version 1.0
 **///
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(str2.contains(ch+"")) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
