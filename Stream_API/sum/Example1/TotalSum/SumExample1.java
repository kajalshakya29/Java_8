package streams.sum.Example1.TotalSum;
import java.util.*;

class SumExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int total = numbers.stream().mapToInt(n -> n).sum();
        System.out.println(total);
    }
}
