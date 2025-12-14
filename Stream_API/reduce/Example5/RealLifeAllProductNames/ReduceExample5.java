package streams.reduce.Example5.RealLifeAllProductNames;
import java.util.*;

public class ReduceExample5 {
    public static void main(String[] args) {
        List<Product> items = Arrays.asList(new Product(1, "Pen"), new Product(2, "Bag"), new Product(3, "Shoes"));
        String allNames = items.stream().map(p -> p.name).reduce("", (a, b) -> a + b + " ");
        System.out.println("All Product Names = " + allNames);
    }
}
