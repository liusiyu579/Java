

import java.util.Scanner;

public class StringCount{
    
    public static void fun(String s){
        int maxI = 0;
        int count = 0;
        int maxLength = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) >= '0'&& s.charAt(i) <= '9'){
                count++;
                if(maxLength < count){
                    maxI = i;
                    maxLength = count;
                }
            }else {
                count = 0;
            }
        }
            System.out.println(s.substring(maxI-maxLength+1,maxI+1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            fun(str);
        }
    }
}