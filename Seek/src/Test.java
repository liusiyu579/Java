import java.util.Scanner;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/20 19:05
 * @Version 1.0
 **/
public class Test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] s=scanner.nextLine().split(" ");
        int n=s[0].charAt(0)-'0';
        int m=s[1].charAt(0)-'0';
        int k=s[2].charAt(0)-'0';
        int line=0;
        int row=m-1;
        int[][] arr=new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            String[] s1=scanner.nextLine().split(" ");
            for (int j = 0; j <arr[0].length; j++) {
                arr[i][j]=s1[j].charAt(0)-'0';
            }
        }
        while(line<n && row>-1){
            int val=arr[line][row];
            if(val>k){
                row--;
            }else if(val<k){
                line++;
            }else {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}