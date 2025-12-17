package streams.anyMatch.Example3.CheckEmployeeSalary;
import java.util.*;

public class AnyMatchExample3 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Kajal", 30000), new Employee("Rahul", 60000), new Employee("Simran", 45000));
        boolean result = list.stream().anyMatch(e -> e.salary > 50000);
        System.out.println(result);
    }
}
