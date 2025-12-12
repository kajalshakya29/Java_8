package streams.sort.Example4.EmployeeSalary;
import java.util.*;

class SortedExample4 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee("Kajal", 30000), new Employee("Rahul", 50000), new Employee("Aman", 25000));
        List<Employee> sorted = emp.stream().sorted((e1, e2) -> e1.salary - e2.salary).toList();
        for(Employee e : sorted){
            System.out.println(e.name + " : " + e.salary);
        }
    }
}
