package streams.avg.Example2.EmployeeSalaries;
import java.util.*;

class AvgExample2 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee("Kajal", 30000), new Employee("Rahul", 40000), new Employee("Aman", 50000));
        double avgSalary = emp.stream().mapToInt(e -> e.salary).average().getAsDouble();
        System.out.println(avgSalary);
    }
}
