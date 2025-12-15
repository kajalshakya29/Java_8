package streams.groupingBy.Example4.DeptCounting;
import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }
}

public class Example4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Kajal", "IT"), new Employee("Sneha", "IT"), new Employee("Rohit", "HR"), new Employee("Aman", "Admin"));
        Map<String, Long> countByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println(countByDept);
    }
}
