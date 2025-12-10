package streams.avg.Example1.avg;
import java.util.*;

class AvgExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        double avg = numbers.stream().mapToInt(n -> n).average().getAsDouble();
        System.out.println(avg);
    }
}
