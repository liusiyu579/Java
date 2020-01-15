/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/7 16:58
 * @Version 1.0
 **/
public class Test {
    public static double Power(double base, int exponent) {
        return Math.pow(base,exponent);
    }

    public static void main(String[] args) {
        double n=3.01;
        int a=5;
        System.out.println(Power(n,a));
    }
}
