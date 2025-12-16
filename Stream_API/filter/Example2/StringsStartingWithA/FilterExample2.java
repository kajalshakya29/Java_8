package streams.filter.Example2.StringsStartingWithA;
import java.util.*;
import java.util.stream.*;

public class FilterExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Kajal", "Ankit", "Riya", "Aditi");
        List<String> result = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);
    }
}

