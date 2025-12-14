package streams.reduce.Example4.MaximumSalary;
import java.util.*;

public class ReduceExample4 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Kajal", 20000), new Employee("Rahul", 50000), new Employee("Simran", 40000));
        int maxSalary = list.stream().map(e -> e.salary).reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Max Salary = " + maxSalary);
    }
}
