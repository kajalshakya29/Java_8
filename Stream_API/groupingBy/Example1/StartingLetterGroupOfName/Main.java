package streams.groupingBy.Example1.StartingLetterGroupOfName;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kajal", "Karan", "Aman", "Anu", "Komal");
        Map<Character, List<String>> grouped = names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(grouped);
    }
}
