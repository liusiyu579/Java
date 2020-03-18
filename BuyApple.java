package word6;

import java.util.Scanner;

/**
 * @ClassName BuyApple
 * @Description TODO
 * @Author lenovo
 * @Date 2020/4/2 15:49
 * @Version 1.0
 **/
public class BuyApple {
    private static int count = 0;
    public static int fun(int n){
        if(n<6 || n%2 != 0){
            return -1;
        }

        if(n%8 == 0){
            return n/8;
        }
        return n/7+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));;
    }
}
