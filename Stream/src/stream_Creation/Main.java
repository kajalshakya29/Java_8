package stream_Creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","cherry");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        String[] arr={"apple","banana","cherry"};
        Stream<String> stream1 = Arrays.stream(arr);

        //--CREATION OF STREAM WITHOUT USING ANY ARRAYS OR LIST
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        //---OR----
        Stream<Integer> stream2 = Stream.iterate(0, n -> n + 1).limit(100);

        //------OR-----
        Stream<String> stream3 = Stream.generate(() -> "hello").limit(5);
        stream3.forEach(System.out::println);
    }
}
