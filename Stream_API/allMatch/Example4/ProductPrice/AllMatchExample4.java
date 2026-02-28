package streams.allMatch.Example4.ProductPrice;
import java.util.*;

public class AllMatchExample4 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Pen", 20), new Product("Bottle", 100), new Product("Shoes", 1200));
        boolean result = products.stream().allMatch(p -> p.price < 1000);
        System.out.println(result);
    }
}
