import java.util.Arrays;

/**
 * @ClassName ave
 * @Description TODO
 * @Author lenovo
 * @Date
 * @Version 1.0
 **/
public class ave {
    public static int ave(int[] a) {
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        return sum/a.length;
    }
    public static int[] fun1(int[] a) {
        for (int i = 0; i <a.length/2 ; i++) {
                int tmp = a[i];
                a[i] = a[a.length - 1 - i];
                a[a.length - 1 - i] = tmp;
        }
        return a;
    }
    public static int[] fun2(int[] a) {
        int left=0;
        int right=a.length-1;
        while(left<right) {
            while (left < right && a[left]%2!=0) {
                left++;
            }
            while (left < right && a[right]%2==0) {
                right--;
            }
            if(left<right) {
                int tmp=a[left];
                a[left]=a[right];
                a[right]=tmp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,5,6,1,4,9,8,3,10};
        System.out.println("平均值为："+ave(arr));
        System.out.println("将数组逆置："+Arrays.toString(fun1(arr)));
        System.out.println("奇前偶后："+Arrays.toString(fun2(arr)));
    }
}
