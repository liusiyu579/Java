/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/28 16:30
 * @Version 1.0
 **/
public class Test {
    public static int JumpFloor(int target) {
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(5));
    }
}
