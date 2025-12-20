package functional_interface_with_lambda.BiFunction.Example3_FullName;
import java.util.function.BiFunction;

public class BiFunctionExample3 {
    public static void main(String[] args) {
        BiFunction<String, String, String> fullName = (f, l) -> f + " " + l;
        System.out.println(fullName.apply("Kajal", "Shakya"));
    }
}
