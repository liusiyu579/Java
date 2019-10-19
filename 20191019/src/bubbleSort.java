import java.util.Arrays;

/**
 * @ClassName bubbleSort
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/19 19:08
 * @Version 1.0
 **/
public class bubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length-1-i; j++) {
                if(array[j]>array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,8,6,4,5};
        bubbleSort(arr);
    }
}
