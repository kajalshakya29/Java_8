package streams.flatMap.Example4;
import java.util.*;

class FlatMapExample4 {
    public static void main(String[] args) {
        List<int[]> list = Arrays.asList(new int[]{1,2,3}, new int[]{4,5}, new int[]{6,7,8,9});
        List<Integer> result = list.stream().flatMap(arr -> Arrays.stream(arr).boxed()).toList();
        System.out.println("Result = " + result);
    }
}
