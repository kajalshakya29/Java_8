package streams.reduce.Example2.Product;
import java.util.*;

public class ReduceExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4);
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
