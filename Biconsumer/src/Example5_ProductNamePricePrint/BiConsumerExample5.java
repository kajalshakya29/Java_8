package functional_interface_with_lambda.BiConsumer.Example5_ProductNamePricePrint;
import java.util.function.BiConsumer;

public class BiConsumerExample5 {
    public static void main(String[] args) {
        BiConsumer<String, Integer> product = (name, price) -> {
                    System.out.println("Product: " + name);
                    System.out.println("Price: " + price);
                };
        product.accept("Mobile", 15000);
    }
}
