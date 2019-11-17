/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/17 17:18
 * @Version 1.0
 **/
class Student{
    public String name;
    public int age;
    public Address address;//组合

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
class Address{
    public int dormic;
    public int floor;

    public Address(int dormic,int floor){
        this.dormic = dormic;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Address{" +
                "dormic=" + dormic +
                ", floor=" + floor +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Address address = new Address(3,6);
        Student student = new Student("小花",18,address);
        System.out.println(student);
    }

}
