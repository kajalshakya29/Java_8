package streams.groupingBy.Example2.NumbersEvenOddGroup;
import java.util.*;
import java.util.stream.*;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<String, List<Integer>> result = numbers.stream().collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even Numbers" : "Odd Numbers"));
        System.out.println(result);
    }
}
