package streams.groupingBy.Example5.SalaryTotalPerDepartment;
import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String dept;
    int salary;

    Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }
    public int getSalary() {
        return salary;
    }
}

public class Example5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Kajal", "IT", 60000), new Employee("Sneha", "IT", 55000), new Employee("Rohit", "HR", 45000), new Employee("Aman", "Admin", 40000));
        Map<String, Integer> salarySum = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingInt(Employee::getSalary)));
        System.out.println(salarySum);
    }
}
