import java.util.Arrays;

/**
 * @ClassName Test合并两个有序的数组 如int[] array1 = {1,3,6,9}  int[] array2 = {2,4,6,8}，合并为一个有序的。
 * 合并之后的结果：1,2,3,4,6,6,9
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/5 22:06
 * @Version 1.0
 **/
public class Test {
    public static void func(int[] arr1,int[] arr2){
        int[] a =  Arrays.copyOf(arr1,arr1.length+arr2.length);
        System.arraycopy(arr2,0,a,arr1.length,arr2.length);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,6,9};
        int[] arr2 = {2,4,6,8};
        func(arr1,arr2);
    }
}
