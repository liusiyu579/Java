package word6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName DelectString
 * @Description TODO
 * @Author lenovo
 * @Date 2020/4/2 16:12
 * @Version 1.0
 **/
public class DelectString {
    public static void fun(String s1,String s2){
        List<Character> list = new ArrayList<>();
        for(int i = 0;i<s1.length();i++){
            if(!(s2.contains(s1.charAt(i)+""))){
                list.add(s1.charAt(i));
            }
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            fun(s1, s2);
        }
    }
}
