package streams.count.Example4.CountEvenNo;
import java.util.*;

class CountExample4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 8, 11, 14, 17);
        long evens = list.stream().filter(n -> n % 2 == 0).count();
        System.out.println(evens);
    }
}
