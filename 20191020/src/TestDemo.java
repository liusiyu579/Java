import java.util.Arrays;

/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/20 12:19
 * @Version 1.0
 **/
public class TestDemo {
    public static int[] mul(int[] array) {
        int[] a=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            a[i]=array[i]*2;
            }
            return a;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        int[] ret=mul(arr);
        System.out.println(Arrays.toString(ret));
    }

}
