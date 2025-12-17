package streams.anyMatch.Example4.CheckProductPrice;
import java.util.*;

public class AnyMatchExample4 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Pen", 20), new Product("Bottle", 100), new Product("Shoes", 1200));
        boolean result = products.stream().anyMatch(p -> p.price == 100);
        System.out.println(result);
    }
}