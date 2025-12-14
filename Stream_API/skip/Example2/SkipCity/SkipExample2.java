package streams.skip.Example2.SkipCity;
import java.util.*;
import java.util.stream.*;

public class SkipExample2 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Pune", "Hyd");
        List<String> result = cities.stream().skip(1).collect(Collectors.toList());
        System.out.println(result);
    }
}
