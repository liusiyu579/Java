import java.util.Arrays;

/**
 * @ClassName binarySearch
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/20 17:32
 * @Version 1.0
 **/
public class binarySearch {
    //1 2 3 4 5 6 7 8 9
    public static int binarySearch2(int[] a,int key,int left,int right) {
        int mid=(left+right)/2;
        while(left<right) {
            if(a[mid]<key) {
                return binarySearch2(a,5,mid+1,right);
            }else if(a[mid]>key) {
                return binarySearch2(a,5,left,mid-1);
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch1(int[] a,int key) {
        int left=0;
        int right=a.length-1;
         while(left<=right) {
              int mid=(left+right)/2;
              if(a[mid]<key) {
              left=mid+1;
            }else if(a[mid]==key) {
                return mid;
             }else {
               right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int left=0;
        int right=arr.length-1;
        System.out.println(Arrays.binarySearch(arr,0,6,5));
        System.out.println(binarySearch1(arr,5) );
        System.out.println(binarySearch2(arr,5,left,right));
    }
}
