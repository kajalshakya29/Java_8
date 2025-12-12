package streams.sort.Example1.IntegerList;
import java.util.*;

class SortedExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 1, 9, 2, 7);
        List<Integer> sortedList = numbers.stream().sorted().toList();
        for(Integer n : sortedList){
            System.out.println(n);
        }
    }
}
