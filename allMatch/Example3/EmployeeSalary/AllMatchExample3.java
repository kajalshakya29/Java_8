package streams.allMatch.Example3.EmployeeSalary;
import java.util.*;

public class AllMatchExample3 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Kajal", 30000), new Employee("Rahul", 50000), new Employee("Simran", 40000));
        boolean result = list.stream().allMatch(e -> e.salary > 20000);
        System.out.println(result);
    }
}
