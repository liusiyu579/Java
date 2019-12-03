import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/22 18:35
 * @Version 1.0
 **/
public class Test {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int j=list.size();
            for (int k = 0; k <j ; k++) {
                List<Integer> list1 = new ArrayList<>(list.get(k));
                list1.add(nums[i]);
                list.add(list1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        List<List<Integer>> a=subsets(nums);
        System.out.println(a);
    }
}
