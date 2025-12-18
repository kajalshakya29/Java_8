package functional_interface_with_lambda.BiConsumer.Example3_AccountBalance;
import java.util.function.BiConsumer;

public class BiConsumerExample3 {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> updateBalance =
                (balance, deposit) ->
                        System.out.println(balance + deposit);

        updateBalance.accept(5000, 2000);
    }
}
