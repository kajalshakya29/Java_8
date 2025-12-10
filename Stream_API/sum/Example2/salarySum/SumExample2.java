package streams.sum.Example2.salarySum;
import java.util.*;

class SumExample2 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee("Kajal", 30000), new Employee("Rahul", 40000), new Employee("Aman", 35000));
        int totalSalary = emp.stream().mapToInt(e -> e.salary).sum();
        System.out.println(totalSalary);
    }
}
