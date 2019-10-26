import java.util.Arrays;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/26 17:25
 * @Version 1.0
 **/
public class Test {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        if(nums == null || nums.length == 0){
            return arr;
        }
        int a=searchBinary(nums,target);
        if(a==-1){
            return arr;
        }
        int i=a-1;
        while(i>=0&&nums[i]==target){
            i--;
        }
        arr[0]=i+1;
        int j=a+1;
        while(j<nums.length&&nums[j]==target){
            j++;
        }
        arr[1]=j-1;
        return arr;
    }
    public static int searchBinary(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,5,5,5,5,6,8,9};
        int a=5;
        int[] b=searchRange(nums,a);
        System.out.println(Arrays.toString(b));
    }
}
