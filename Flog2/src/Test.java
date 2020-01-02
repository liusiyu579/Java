import java.util.Scanner;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/29 16:34
 * @Version 1.0
 **/
public class Test {
    public static int JumpFloorII(int target) {
        if(target<=2){
            return target;
        }
        return 2*JumpFloorII(target-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        System.out.println(JumpFloorII(t));
    }
}
