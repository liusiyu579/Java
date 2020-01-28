import java.util.ArrayList;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/27 17:58
 * @Version 1.0
 **/
public class Test {
    public static ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> alls = new ArrayList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i <ope.length ; i++) {
            if(ope[i][0] == 1){
                alls.add(ope[i][1]);
            }else if(ope[i][0] == 2) {
                if(ope[i][1] == 0){
                    if(!alls.isEmpty()){
                        ret.add(alls.get(0));
                        alls.remove(0);
                    }
                }else if(ope[i][1] == 1){
                    for (int j = 0; j < alls.size(); j++) {
                        if(alls.get(j) > 0){
                            ret.add(alls.get(j));
                            alls.remove(j);
                            break;
                        }
                    }
                }else if(ope[i][1] == -1){
                    for (int j = 0; j < alls.size(); j++) {
                        if(alls.get(j) < 0){
                            ret.add(alls.get(j));
                            alls.remove(j);
                            break;
                        }
                    }
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] ope=new int[][]{{1,1},{1,-1},{2,0},{2,-1}};
        ArrayList<Integer> a = asylum(ope);
        System.out.println(a);
    }
}
