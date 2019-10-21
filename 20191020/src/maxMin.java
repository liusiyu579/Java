/**
 * @ClassName maxMin
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/20 16:11
 * @Version 1.0
 **/
public class maxMin {
    public static int max(int[] a) {
        for (int i = 0; i <a.length ; i++) {
            if(a[0]<a[i]) {
                int tmp=a[i];
                a[i]=a[0];
                a[0]=tmp;
            }
        }
        return a[0];
    }
    public static int min(int[] a) {
        for (int i = 0; i <a.length ; i++) {
            if(a[0]>a[i]) {
                int tmp=a[i];
                a[i]=a[0];
                a[0]=tmp;
            }
        }
        return a[0];
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,2,8,9,5,6,4,3};
        System.out.println("最大值为："+max(arr));
        System.out.println("最小值为："+min(arr));
    }
}
