package streams.map.Example4.EmployeesListToSalaryWithBonus;
import java.util.*;
import java.util.stream.*;

public class MapExample4 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Kajal", 20000), new Employee("Rahul", 30000), new Employee("Pooja", 25000));
        List<Double> newSalaries = list.stream().map(e -> e.salary + e.salary * 0.10).collect(Collectors.toList());
        for(Double s : newSalaries){
            System.out.println(s);
        }
    }
}
