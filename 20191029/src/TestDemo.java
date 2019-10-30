/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/29 18:03
 * @Version 1.0
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,5);
        myArrayList.add(0,4);
        myArrayList.add(0,3);
        myArrayList.add(0,2);
        myArrayList.add(0,1);
        myArrayList.display();
        System.out.println(myArrayList.search(3));
        System.out.println(myArrayList.search(6));
        System.out.println(myArrayList.contains(2));
        System.out.println(myArrayList.contains(5));
        System.out.println(myArrayList.getPos(2));
        System.out.println(myArrayList.getPos(3));
        System.out.println(myArrayList.getPos(6));
        myArrayList.remove(3);
        myArrayList.display();
        myArrayList.remove(1);
        myArrayList.display();
        myArrayList.remove(5);
        myArrayList.display();
        System.out.println(myArrayList.size());
        myArrayList.clear();
        myArrayList.display();
    }
}
