package functional_interface_with_lambda.BiFunction.Example4_TotalSalary;
import java.util.function.BiFunction;

public class BiFunctionExample4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> totalSalary = (salary, bonus) -> salary + bonus;
        System.out.println(totalSalary.apply(30000, 5000));
    }
}
