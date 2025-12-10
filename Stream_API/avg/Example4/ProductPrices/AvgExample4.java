package streams.avg.Example4.ProductPrices;
import java.util.*;

class AvgExample4 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Pen", 20.5), new Product("Notebook", 55.0), new Product("Bottle", 80.0));
        double avgPrice = products.stream().mapToDouble(p -> p.price).average().getAsDouble();
        System.out.println(avgPrice);
    }
}
