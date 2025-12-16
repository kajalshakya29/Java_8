package streams.flatMap.Example2;
import java.util.*;
import java.util.stream.*;

class FlatMapExample2 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("I love Java", "Java is powerful", "Stream API is awesome");
        List<String> words = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).toList();
        System.out.println(words);
    }
}
