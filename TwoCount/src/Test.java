/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/3 16:45
 * @Version 1.0
 **/
public class Test {
    public static int NumberOf1(int n) {
        int count =0;
        while( n!= 0){
            count++;
            n=n&(n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(5));
    }
}
