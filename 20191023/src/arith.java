/**
 * @ClassName arith
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/23 20:40
 * @Version 1.0
 **/
class Calculator {
    private int num1;
    private int num2;
    public int sum(int num1,int num2) {
        this.num1=num1;
        this.num2=num2;
        return num1+num2;
    }
    public int dec(int num1,int num2) {
        this.num1=num1;
        this.num2=num2;
        return num1-num2;
    }
    public int mul(int num1,int num2) {
        this.num1=num1;
        this.num2=num2;
        return num1*num2;
    }
    public int dir(int num1,int num2) {
        this.num1=num1;
        this.num2=num2;
        return num1/num2;
    }

}
public class arith {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.sum(10,20));
        System.out.println(cal.dec(30,20));
        System.out.println(cal.mul(10,30));
        System.out.println(cal.dir(30,10));
    }
}

/*
class Calculator{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void sum(){
        System.out.println(num1+num2);
    }
    public void dec(){
        System.out.println(num1-num2);
    }
    public void mul(){
        System.out.println(num1*num2);
    }
    public void div(){
        System.out.println(num1/num2);
    }
}
public class arith {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.setNum1(10);
        cal.setNum2(20);
        cal.sum();
        cal.dec();
        cal.mul();
        cal.div();
    }
}
*/
