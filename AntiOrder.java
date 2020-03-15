package word5;

/**
 * @ClassName AntiOrder
 * @Description TODO
 * @Author lenovo
 * @Date 2020/3/31 16:25
 * @Version 1.0
 **/
public class AntiOrder {
    public static int antio(int[] A,int n){
        int c=0;
        for(int i = 0; i < n-1; i ++){
            for(int j = i + 1; j < n; j ++){
                if(A[i] > A[j]){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,0};
        int n = 8;
        System.out.println(antio(a,n));
    }
}
