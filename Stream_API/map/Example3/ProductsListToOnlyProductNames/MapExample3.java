package streams.map.Example3.ProductsListToOnlyProductNames;
import java.util.*;
import java.util.stream.*;

public class MapExample3 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product(1, "Pen", 20), new Product(2, "Bag", 500), new Product(3, "Shoes", 1500));
        List<String> productNames = products.stream().map(p -> p.name).collect(Collectors.toList());
        for(String s : productNames){
            System.out.println(s);
        }
    }
}
