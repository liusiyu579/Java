package word4;

import java.util.Arrays;

/**
 * @ClassName Main2
 * @Description TODO
 * @Author lenovo
 * @Date 2020/3/30 17:26
 * @Version 1.0
 **/
public class QuickSort {
    public static int findKth(int[] a, int n, int K) {
        quickSort(a,0,n-1);
        return a[n-K];
    }
    public static void quickSort(int[] a,int left,int right) {
        if(left == right) {
            return;
        }
        if(left > right) {
            return;
        }
        int pivot = partition(a,left,right);
        quickSort(a,left,pivot-1);
        quickSort(a,pivot+1,right);
    }
    public static int partition(int[] a,int left,int right){
        int i = left;
        int j = right;
        int p = a[left];
        while(i<j) {
            while(i<j && a[j] >= p) {
                j--;
            }
            while(i<j && a[i] <= p) {
                i++;
            }
            swap(a,i,j);
        }
        swap(a,i,left);
        return i;
    }
    public static void swap(int[] a,int i,int left) {
        int tmp = a[i];
        a[i] = a[left];
        a[left] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1,2,5,3};
        int n = 5;
        int K = 3;
        System.out.println(findKth(a,n,K));
    }
}
