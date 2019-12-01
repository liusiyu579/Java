import java.util.*;
public class Solution12 {
    public static String func(String str){
        String[] st = str.split(" ");
        String ret = "";
        for(String str2 : st) {
            ret += str2;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = func(str);
        System.out.println(s);
    }
}