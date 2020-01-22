/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/15 20:03
 * @Version 1.0
 **/
public class Test {
    public static int calPoints(String[] ops) {
        int[] arr=new int[ops.length];
        int i=0;
        for (String str:ops) {
            switch (str){
                case "+":
                    arr[i]=arr[i-1]+arr[i-2];
                    i++;
                    break;
                case "D":
                    arr[i]=2*arr[i-1];
                    i++;
                    break;
                case "C":
                    arr[i-1]=0;
                    i--;
                    break;
                    default:
                        arr[i]=Integer.valueOf(str);
                        i++;
            }
        }
        int sum=0;
        for (int j = 0; j <arr.length ; j++) {
            sum+=arr[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] s=new String[]{"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }
}
