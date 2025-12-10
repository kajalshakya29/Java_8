package streams.sum.Example3.totalPrice;
import java.util.*;

class SumExample3 {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(199.99, 499.00, 250.50);
        double total = prices.stream().mapToDouble(p -> p).sum();
        System.out.println(total);
    }
}
