/**
 * @ClassName swap
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/23 21:03
 * @Version 1.0
 **/

class Swap1{
    private int a;
    private int b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.b = a;
    }
    public int getB() {//
        return b;
    }
    public void setB(int b) {
        this.a = b;
    }
}
public class swap {
    public static void main(String[] args) {
        Swap1 swp=new Swap1();
        swp.setA(10);
        swp.setB(20);
        System.out.println("a= "+swp.getA());
        System.out.println("b= "+swp.getB());
    }
}
