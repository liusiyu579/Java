package word4;

import java.util.Scanner;

public class BackString{
    public static int count;
    public static boolean isfun(char[] ch,int left,int right) {
        while(left < right) {
            if(ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int func(String s1,String s2){
        if(s1 == null || s2 == null) {
            return 0;
        }
        StringBuffer sb = new StringBuffer(s1.length()+s2.length());
        sb.append(s1);
        for (int i = 0; i < s1.length(); i++) {
            sb.insert(i,s2);
            if(isfun(sb.toString().toCharArray(),0,sb.toString().toCharArray().length-1)){
                count++;
            }
            sb.delete(i,s2.length()+i);
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(func(s1,s2));
        }
    }
}