/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/23 20:56
 * @Version 1.0
 **/

class Construct {
    public Construct() {
        System.out.println("Construct()!");
    }
    public Construct(int i) {
        System.out.println("Construct(int i)!");
    }
    public Construct(int i,int k) {
        System.out.println("Construct(int i,int k)!");
    }
    public Construct(int i,int k,int m) {
        System.out.println("Construct(int i,int k,int m)!");
    }
}
public class Test {

    public static void main(String[] args) {
        Construct con=new Construct();
        Construct con1=new Construct(1);
        Construct con2=new Construct(1,2);
        Construct con3=new Construct(1,2,3);

    }
}
