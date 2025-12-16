package streams.flatMap.Example3;
import java.util.*;
class Employee {
    String name;
    List<String> phones;

    Employee(String name, List<String> phones){
        this.name = name;
        this.phones = phones;
    }
}

class FlatMapExample3 {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("Kajal", Arrays.asList("111", "222")), new Employee("Rahul", Arrays.asList("333")), new Employee("Aman", Arrays.asList("444", "555")));
        List<String> allPhones = emps.stream().flatMap(e -> e.phones.stream()).toList();
        System.out.println("All Phones = " + allPhones);
    }
}
