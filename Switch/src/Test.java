import java.util.Arrays;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/15 17:04
 * @Version 1.0
 **/
public class Test {
    public static void reOrderArray(int [] array) {
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]%2==0&&array[j+1]%2==1){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6,7};
        reOrderArray(a);
    }
}
