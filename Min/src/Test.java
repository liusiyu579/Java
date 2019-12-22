import java.util.Arrays;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/13 16:08
 * @Version 1.0
 **/
public class Test {
    public static int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
        int[] a=new int[]{3,4,5,1,2};
        int b=minNumberInRotateArray(a);
        System.out.println(b);
    }
}
