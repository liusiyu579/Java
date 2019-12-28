/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/22 16:19
 * @Version 1.0
 **/
//1 1 2 3 5 8
public class Test {
    public static int Fibonacci1(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return Fibonacci1(n-1)+Fibonacci1(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci1(6));
    }
}
