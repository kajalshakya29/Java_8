package streams.skip.Example3.SkipSalaries;
import java.util.*;
import java.util.stream.*;

public class SkipExample3 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Kajal", 30000), new Employee("Rahul", 40000), new Employee("Simran", 50000), new Employee("Priya", 60000));
        List<Employee> result = list.stream().skip(3).collect(Collectors.toList());
        for(Employee e : result){
            System.out.println(e.name + ":" + e.salary);
        }
    }
}
