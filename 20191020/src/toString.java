import java.util.Arrays;

/**
 * @ClassName toString
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/20 14:41
 * @Version 1.0
 **/
public class toString {
    public static String print(int[] arr) {
        String str=" ";
        for (int i = 0; i <arr.length ; i++) {
            str+=arr[i];
            if(i!=arr.length-1) {
                str+=",";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
        String a=print(arr);
        System.out.println("["+a+"]");
    }
}
