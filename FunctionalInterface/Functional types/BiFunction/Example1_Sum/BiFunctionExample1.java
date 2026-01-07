package functional_interface_with_lambda.BiFunction.Example1_Sum;
import java.util.function.BiFunction;

public class BiFunctionExample1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 20));
    }
}
