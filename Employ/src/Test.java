import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/1/28 18:21
 * @Version 1.0
 **/
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
public class Test {
    public  static int getImportance(List<Employee> employees, int id) {
        for (Employee e:employees) {
            if(e.id == id){
                if(e.subordinates.size() == 0){
                    return e.importance;
                }
                for (int i:e.subordinates) {
                    e.importance+=getImportance(employees,i);
                }
                return e.importance;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        List<Employee> employees = new ArrayList<>();
        employee1.id = 1;
        employee1.importance=5;
        employee1.subordinates= new ArrayList<>();
        employee1.subordinates.add(2);
        employee1.subordinates.add(3);
        employee2.id = 2;
        employee2.importance=3;
        employee2.subordinates= new ArrayList<>();
        employee3.id = 3;
        employee3.importance=3;
        employee3.subordinates= new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println(getImportance(employees,1));
    }
}
