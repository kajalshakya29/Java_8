package functional_interface_with_lambda.BiFunction.Example5_Result;
import java.util.function.BiFunction;

public class BiFunctionExample5 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> result = (marks, attendance) -> {
                    if(marks >= 40 && attendance >= 75)
                        return "Pass";
                    else
                        return "Fail";
                };
        System.out.println(result.apply(65, 80));
        System.out.println(result.apply(30, 90));
    }
}
