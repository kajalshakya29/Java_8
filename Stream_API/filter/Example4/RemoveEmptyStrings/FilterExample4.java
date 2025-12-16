package streams.filter.Example4.RemoveEmptyStrings;
import java.util.*;
import java.util.stream.*;

public class FilterExample4 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Kajal", "", "Java", "", "Stream API");
        List<String> result = data.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(result);
    }
}

