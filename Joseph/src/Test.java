import java.util.ArrayList;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/16 17:22
 * @Version 1.0
 **/
public class Test {
    public static int getResult(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            list.add(i);
        }
        int m=2;
        while(list.size()>1){
            ArrayList<Integer> ret = new ArrayList<>();
            int num=0;
            while(num<list.size()){
                if(num%m==0){
                    ret.add(list.get(num));
                }
                num++;
            }
            m++;
            list=ret;
            list.add(0,ret.get(ret.size()-1));
            list.remove(list.size()-1);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(getResult(n));
    }
}
