package streams.count.Example5.ProductsCount;
import java.util.*;

class CountExample5 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Pen", 50), new Product("Notebook", 120), new Product("Headphones", 499), new Product("Power Bank", 1200));
        long cheapItems = products.stream().filter(p -> p.price < 500).count();
        System.out.println("Products Under 500 = " + cheapItems);
    }
}
