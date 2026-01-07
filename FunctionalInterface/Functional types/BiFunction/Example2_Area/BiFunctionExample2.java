package functional_interface_with_lambda.BiFunction.Example2_Area;
import java.util.function.BiFunction;

public class BiFunctionExample2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> area = (l, b) -> l * b;
        System.out.println(area.apply(5, 4));
    }
}
