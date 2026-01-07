package functional_interface_with_lambda.BiConsumer.Example2_TwonumbSum;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println(a + b);
        sum.accept(10, 20);
    }
}
