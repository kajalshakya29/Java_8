package streams.sort.Example3.IntegersDescending;
import java.util.*;

class SortedExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 25, 7, 18);
        List<Integer> desc = numbers.stream().sorted((a, b) -> b - a).toList();
        for(Integer n : desc){
            System.out.println(n);
        }
    }
}
