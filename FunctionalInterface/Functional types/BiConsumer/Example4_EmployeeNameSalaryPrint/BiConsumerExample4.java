package functional_interface_with_lambda.BiConsumer.Example4_EmployeeNameSalaryPrint;
import java.util.function.BiConsumer;

public class BiConsumerExample4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Kajal", 35000);
        BiConsumer<String, Integer> showEmp = (name, salary) -> {
                    System.out.println(name);
                    System.out.println(salary);
                };
        showEmp.accept(emp.name, emp.salary);
    }
}
