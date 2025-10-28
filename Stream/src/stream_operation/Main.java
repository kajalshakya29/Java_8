package stream_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 6, 5, 554, 87, 66, 543, 0, 0, 1);
        List<Integer> filteredList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);
        List<Integer> mappedList= filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedList);

        //if we dont want repeated values
        List<Integer> mappedList2= filteredList.stream().map(x -> x / 2).distinct().collect(Collectors.toList());
        System.out.println(mappedList2);

        //sorted list
        List<Integer> mappedList3= filteredList.stream().map(x -> x / 2).distinct().sorted().collect(Collectors.toList());
        System.out.println(mappedList3);

        //sorted list in desce order
        List<Integer> mappedList4= filteredList.stream()
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b)->(b-a))
                .collect(Collectors.toList());
        System.out.println(mappedList4);

        //sorted list in desce order in limit
        List<Integer> mappedList5= filteredList.stream()
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(mappedList5);

        //sorted list in desce order in limit with skip
        List<Integer> mappedList6= filteredList.stream()
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(mappedList6);

        //peek
        List<Integer> mappedList7 = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))
                .collect(Collectors.toList());

        Integer integer = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .peek(System.out::println)
                .max((a, b) -> a-b).get();
        System.out.println(integer);

        //----count----
        Long integer1 = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .count();
        System.out.println(integer1);//-----these few are the terminal operations

    }
}
