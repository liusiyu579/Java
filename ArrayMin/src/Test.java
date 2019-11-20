import java.util.Arrays;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/20 17:29
 * @Version 1.0
 **/
public class Test {
    public static int findUnsortedSubarray(int[] nums) {
        int[] a=new int[nums.length];
        System.arraycopy(nums,0,a,0,nums.length);
        Arrays.sort(a);
        //判断是否相等
        if(Arrays.equals(a,nums)){
            return 0;
        }
        //从前到后找出第一次不相同的位置
        int count=0;
        int i=0;
        while(i<nums.length){
            if(nums[i] != a[i]){
                count=i;
                break;
            }else {
                i++;
            }
        }
        //从后往前找出第一次不同的位置
        int j=nums.length-1;
        int k=0;
        while(j>=0){
            if(nums[j] != a[j]){
                k=j;
                break;
            }else {
                j--;
            }
        }
        return (k-count+1);
    }
    public static void main(String[] args) {
        int[] a=new int[]{2, 6, 4, 8, 10, 9, 15};
        int b=findUnsortedSubarray(a);
        System.out.println(b);
    }
}
