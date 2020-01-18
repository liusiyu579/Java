/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/18 17:58
 * @Version 1.0
 **/
public class Test {
    public static int GetNumberOfK(int [] array , int k) {
        int count=0;
        for (int i = 0; i <array.length ; i++) {
            while(i<array.length&&array[i]==k){
                count++;
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,3,3,3,4,5,6};
        int a=3;
        System.out.println(GetNumberOfK(array,a));
    }
}
