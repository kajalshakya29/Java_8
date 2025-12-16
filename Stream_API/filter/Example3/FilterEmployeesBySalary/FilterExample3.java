package streams.filter.Example3.FilterEmployeesBySalary;
import java.util.*;
import java.util.stream.*;

public class FilterExample3 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(1, "Kajal", 45000), new Employee(2, "Rohan", 40000), new Employee(3, "Priya", 15000));
        List<Employee> highSalary = list.stream().filter(e -> e.salary > 30000).collect(Collectors.toList());
        for(Employee e : highSalary){
            System.out.println(e.name + " : " + e.salary);
        }
    }
}
