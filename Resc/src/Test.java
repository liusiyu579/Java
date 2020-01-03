import java.util.Random;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/2 16:39
 * @Version 1.0
 **/
public class Test {
    public static int RectCover(int target) {
        if(target<=2){
            return target;
        }
        return RectCover(target-1)+RectCover(target-2);
    }
    public static void main(String[] args) {
        System.out.println(RectCover(6));
    }
}
