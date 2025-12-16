package streams.flatMap.Example1;
import java.util.*;

class FlatMapExample1 {
    public static void main(String[] args) {
        List<List<Integer>> data = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> result = data.stream().flatMap(list -> list.stream()).toList();
        System.out.println("Result = " + result);
    }
}
