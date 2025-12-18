package functional_interface_with_lambda.BiConsumer.Example1_NameAgePrint;
import java.util.function.BiConsumer;

public class BiConsumerExample1 {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printData =
                (name, age) -> System.out.println(name + " " + age);
        printData.accept("Kajal", 22);
    }
}
