
/**
 * @ClassName 字符串转化（压缩）   “aabbccdaa” -> "2a2b2c1d2a"
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/5 22:30
 * @Version 1.0
 **/
public class Test2 {
    public static void func(String str) {
        int count = 1;
        char[] arr = str.toCharArray();
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            }else {
                System.out.print(count);
                System.out.println(arr[i]);
                count = 1;
            }
        }
        System.out.print(count);
        System.out.println(arr[arr.length-1]);
    }
    public static void main(String[] args) {
        String str = "aabbrsss";
        func(str);
    }
}
