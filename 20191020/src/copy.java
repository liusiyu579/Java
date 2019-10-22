import java.util.Arrays;

/**
 * @ClassName copy
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/20 15:07
 * @Version 1.0
 **/
public class copy {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        arr2=arr1.clone();
        //原数组名.clone（）；
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] ArrayscopyOf(int[] arr,int newlength) {
        //模拟实现Arrays.copyOf
        int[] ret=new int[newlength];
        for (int i = 0; i < newlength; i++) {
            ret[i]=arr[i];
        }
        return ret;
    }
    public static void main3(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        //int[] arr2=new int[arr1.length];
        int[] arr2=ArrayscopyOf(arr1,arr1.length);//接收引用，函数里面已经有对象了，不用在new一个对象
        //arr2=Arrays.copyOf(arr1,arr1.length);//自己内部new了一个数组
        //Arrays.copyOf不需要new一个对象
        //Arrays.copyOf（）方法 内部调用了System.arraycopy();
        System.out.println(Arrays.toString(arr2));
    }

    public static void main2(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr1,0,arr2,0,arr1.length);//需要new一个对象
        //System.arraycopy（原数组，原数组哪个地方开始拷，拷到哪个数组，从几号下标开始，拷多长）
        //被native所修饰   底层使用C/C++写的   运行速度快
        System.out.println(Arrays.toString(arr2));
    }
    public static void main1(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i <arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
