package streams.groupingBy.Example3.EmployeesByDepartment;
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
    public String getName() {
        return name;
    }
}

public class Example3 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Kajal", "IT"), new Employee("Rohit", "HR"), new Employee("Sneha", "IT"), new Employee("Aman", "Admin"));
        Map<String, List<Employee>> grouped = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        grouped.forEach((dept, empList) -> {
            System.out.println(dept + " -> " + empList.stream().map(Employee::getName).toList());
        });
    }
}
