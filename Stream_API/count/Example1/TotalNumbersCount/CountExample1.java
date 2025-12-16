package streams.count.Example1.TotalNumbersCount;
import java.util.*;

class CountExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        long total = numbers.stream().count();
        System.out.println(total);
    }
}
