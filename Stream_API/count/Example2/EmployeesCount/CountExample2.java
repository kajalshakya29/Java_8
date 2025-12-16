package streams.count.Example2.EmployeesCount;

import java.util.*;
class CountExample2 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee("Kajal", 30000), new Employee("Rahul", 45000), new Employee("Aman", 50000));
        long count = emp.stream().count();
        System.out.println(count);
    }
}
