import java.util.*;
public class Main{
    public static boolean func(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i != j) {
            if(ch[i] != ch[j]) {
                return false;
            }
            i = i+1;
            if(i == j) {
                return true;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean b = func(str);
        if(b == true) {
            System.out.println("Yes!");
        }
        if(b == false) {
             System.out.println("No!");
        }
    }
}