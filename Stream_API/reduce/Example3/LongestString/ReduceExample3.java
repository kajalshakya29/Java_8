package streams.reduce.Example3.LongestString;
import java.util.*;
public class ReduceExample3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("kajal", "java", "springboot", "api");
        String longest = words.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);
        System.out.println(longest);
    }
}
