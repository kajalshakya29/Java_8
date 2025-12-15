package streams.map.Example2.StringListToUppercaseStrings;
import java.util.*;
import java.util.stream.*;
public class MapExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kajal", "rahul", "sonam");
        List<String> upperNames = names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        for(String name : upperNames){
            System.out.println(name);
        }
    }
}
